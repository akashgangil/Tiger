import java.util.*;
import java.util.regex.*;

public class MIPSGenerator{
    private List<Quad> mipsCode;
    private final MIPSRegisterBank rb;  
    private TigerScope scope;
    private String currentFunction;
    private HashMap<String, Integer> paramNamesToNumbers;

    private final String dataSegment = ".data\n";
    private final String textSegment = ".text\n";
    private final String mainSegment = ".globl main\nmain:\n";
    private final String exitProgram = "jr $ra\n";

    private Map<String, String> tempRegMap;

    public MIPSGenerator(TigerScope scope){
        this.mipsCode = new ArrayList<Quad>();
        this.rb = MIPSRegisterBank.getMIPSRegisterBank();
        this.scope = scope;
        this.tempRegMap = new HashMap<String, String>();
        this.paramNamesToNumbers = new HashMap<String, Integer>();
        this.currentFunction = "main";
    }

    public String getType(String varName){
        if(isInt(varName)) return "int";
        if(isFixedpt(varName)) return "fixedpt";
        TigerScope sc = this.scope.childScopes.get(0).childScopes.get(0);
        TigerSymbol s = sc.lookupSymbol(varName);
        if(s == null) return "int";
        TigerVariable var = (TigerVariable)s;
        return var.getType().name;
    }

    private String cfgRegAllocation(List<Quad> ir) {
        BasicBlockGenerator bbg = new BasicBlockGenerator(ir); 
        List<BasicBlock> blocks = bbg.getBasicBlocks();
        
        return "";
    }

    private String naiveRegAllocation(Map<Quad, Boolean> ir){
        String res = "";

        for(Map.Entry<Quad, Boolean> entry:  ir.entrySet()){
            if(!entry.getValue()){
                if(entry.getKey().getOp().equals("assign")){
                    Operand op1 = new Operand(entry.getKey().getAddr1());
                    Operand op2 = new Operand(entry.getKey().getAddr2());

                    /*Load the value*/
                    res += naiveLoad(op1);
                        
                    /*if RHS is *not* a value then we need to load it*/ 
                    if(!isNumeric(op2.getName())){
                        res += naiveLoad(op2);
                    }

                    /* Assign the value 
                     * Either assign a numeric value addi $d, $zero, 2
                     * Or copy between two registers addi $d, $s, 0
                     */
                    res += "addi " + op1.getValReg() + ", ";
                    if(isNumeric(op2.getName())){
                        res += "$zero " + ", " + op2.getName(); 
                    }
                    else{
                        res += op2.getValReg() + ", " + "0";
                    }
                    res += "\n";

                    /*Store the value to the memory location*/
                    res += naiveStore(op1);

                    /*Free the regs to make them resuable*/
                    freeRegs(op1); freeRegs(op2);
                }
                else if(isArithmeticOp(entry.getKey().getOp())){
                    Operand op1 = new Operand(entry.getKey().getAddr1());
                    Operand op2 = new Operand(entry.getKey().getAddr2());
                    Operand op3 = new Operand(entry.getKey().getAddr3());
                    
                    String fp_inst = "";
                    if(getType(op1.getName()).equals("fixedpt") ||
                       getType(op2.getName()).equals("fixedpt") ||
                       getType(op3.getName()).equals("fixedpt")
                      )
                        fp_inst += ".s";

                    /*Load */
                    res += naiveLoad(op1);
                    res += naiveLoad(op2);
                    res += naiveLoad(op3);

                    String inst = entry.getKey().getOp();
                    if(inst.equals("mult")){
                        inst = "mul";
                    }
                    res += inst + fp_inst + " "  + op3.getValReg() + 
                           ", " + op1.getValReg() + 
                           ", " + op2.getValReg() + "\n";
                    
                    res += naiveStore(op3);
                    
                    /*Free Regs*/
                    freeRegs(op1); freeRegs(op2); freeRegs(op3);
                }
                else if (isFunction(entry.getKey().getOp())) {
                    //if (!currentFunction.equals("main")) {
                        res += calleeEnd(currentFunction);
                    //}
                    Quad q = entry.getKey();
                    res += "jr $ra\n";
                    currentFunction = q.getOp().substring(0, q.getOp().length()-1);
                    res += currentFunction + ":\n";
                    res += calleeBegin(currentFunction);
                } else if (entry.getKey().getOp().equals("return")){
                    String returnVal = entry.getKey().getAddr1();
                    Operand o = new Operand(returnVal);
                    res += naiveLoad(o);
                    res += "move $v0, " + o.getValReg() + "\n";
                    freeRegs(o);
                }
                else if(entry.getKey().getOp().equals("call") || entry.getKey().getOp().equals("callr")){
                    if(entry.getKey().getAddr1().equals("printi")){
                        res += "li $v0 1\n";
                        /*hack*/
                        //String isReg = "";
                        //if(isTemp(entry.getKey().getParam())){
                            //isReg = ", $";
                        //}
                        Operand o = new Operand(entry.getKey().getParam());
                        res += naiveLoad(o);

                        res += "move $a0, " + o.getValReg() + "\n"; 
                        res += "syscall" + "\n"; 
                        res += "li $v0 11\n"; //print single character
                        res += "li $a0 0xA\n"; //new line ASCII value
                        res += "syscall"  + "\n";
                    } else {
                        Quad q = entry.getKey();
                        
                        //caller setup
                        res += callerBegin(q);
                        //caller setup end
                        if (q.getOp().equals("callr")){
                            res += "jal " + entry.getKey().getAddr2() + "\n";
                        } else {
                            res += "jal " + entry.getKey().getAddr1() + "\n";
                        }

                        //caller cleanup
                        res += callerEnd(q);
                        
                        //caller cleanup end
                    }
                }
                else if(isLabel(entry.getKey().getOp())){
                    res += entry.getKey().getOp() + "\n";
                }
                else if(entry.getKey().getOp().equals("goto")){
                    res += "j " + entry.getKey().getAddr1() + "\n";
                }
                else if(isArrayLS(entry.getKey().getOp())){
                    if(entry.getKey().getOp().equals("array_load")){
                        
                        String arrName = currentFunction + "_" + entry.getKey().getAddr2();
                        Operand op1 = new Operand(entry.getKey().getAddr1());
                        Operand op3 = new Operand(entry.getKey().getAddr3());
                        
                        String array_base_add_reg = this.rb.regBank.get("TEMPS").getReg();
                        String array_index_add_reg = this.rb.regBank.get("TEMPS").getReg();
                        String final_array_address = this.rb.regBank.get("TEMPS").getReg();
                        
                        res += "la  " + array_base_add_reg  + ",  " + arrName + "\n";
                        res += naiveLoad(op3);
                        res += "mul  " + array_index_add_reg + ",  " + op3.getValReg() + ", 4\n";
                        res += "add  " + final_array_address + ",  " + array_base_add_reg + ", " + array_index_add_reg + "\n"; 
                        res += naiveLoad(op1);
                        res += "lw  " + op1.getValReg() + ", 0(" + final_array_address + ")\n"; 
                        res += naiveStore(op1);

                        this.rb.regBank.get("TEMPS").freeReg(array_base_add_reg);
                        this.rb.regBank.get("TEMPS").freeReg(array_index_add_reg);
                        this.rb.regBank.get("TEMPS").freeReg(final_array_address);
                        
                        freeRegs(op1); freeRegs(op3);
                    }
                    if(entry.getKey().getOp().equals("array_store")){
                        String arrName = currentFunction + "_" + entry.getKey().getAddr1();
                        Operand op2 = new Operand(entry.getKey().getAddr2());
                        Operand op3 = new Operand(entry.getKey().getAddr3());

                        String array_base_add_reg = this.rb.regBank.get("TEMPS").getReg();
                        String array_index_add_reg = this.rb.regBank.get("TEMPS").getReg();
                        String final_array_address = this.rb.regBank.get("TEMPS").getReg();

                        res += "la  " + array_base_add_reg  + ",  " + arrName + "\n";
                        res += naiveLoad(op2);
                        res += "mul  " + array_index_add_reg + ",  " + op2.getValReg() + ", 4\n";
                        res += "add  " + final_array_address + ",  " + array_base_add_reg + ", " + array_index_add_reg + "\n"; 
                        res += naiveLoad(op3); 
                        res += "sw  " + op3.getValReg() + ", 0(" + final_array_address + ")\n"; 

                        this.rb.regBank.get("TEMPS").freeReg(array_base_add_reg);
                        this.rb.regBank.get("TEMPS").freeReg(array_index_add_reg);
                        this.rb.regBank.get("TEMPS").freeReg(final_array_address);

                        freeRegs(op2); freeRegs(op3);
                    }       
                }
                else if(isRelationalOp(entry.getKey().getOp())){
                    Operand op1 = new Operand(entry.getKey().getAddr1());
                    Operand op2 = new Operand(entry.getKey().getAddr2());

                    res += naiveLoad(op1);
                    res += naiveLoad(op2);
                    
                    String inst = entry.getKey().getOp();
                    if(inst.equals("breq")){
                        inst = "beq";
                    }
                    else if(inst.equals("brneq")){
                        inst = "bne";
                    }
                    else if(inst.equals("brgt")){
                        inst = "bgt";
                    }
                    else if(inst.equals("brlt")){
                        inst = "blt";
                    }
                    else if(inst.equals("brgeq")){
                        inst = "bge";
                    }
                    else if(inst.equals("brleq")){
                        inst = "ble";
                    }

                    res += inst + "  " + op1.getValReg()  + ",  "
                                + op2.getValReg() + ",  "
                                + entry.getKey().getAddr3() + "\n"; 
                    
                    /*Free*/
                    freeRegs(op1); freeRegs(op2);
                }
            }
        } 
        return res;
    }

    private String callerBegin(Quad q){
        String res = "";
        //push existing args registers into stack
        for (int i = 0; i < 4; i++){
            res += "sw $a" + i + ", -" + (i+1) * 4 + "($sp)\n";
        }
        res += "addi $sp, $sp, -16\n";

        //push $t0-$t9 into stack
        for (int i = 0; i < 10; i++) {
            res += "sw $t" + i + ", -" + (i+1) * 4 + "($sp)\n";
        }
        res += "addi $sp, $sp, -40\n";

        //args for function to be called
        String[] params = q.getParams();
        List<Operand> ops = new LinkedList<Operand>();
        for (int i = 0; i < 4 && i < params.length; i++) {
            Operand p = new Operand(params[i]);
            res += naiveLoad(p);
            ops.add(p);
        }
        for (int i = 0; i < ops.size(); i++){
            res += "move $a" + i + ", " + ops.get(i).getValReg() + "\n";
            //ops.get(i).setValReg("$a" + i);
            naiveStore(ops.get(i));
            freeRegs(ops.get(i));
        }
        int argsInStack = Math.max(params.length - 4, 0);
        //push extra args in stack
        for (int i = 0; i < argsInStack; i++){
            Operand p = new Operand(params[i+4]);
            res += naiveLoad(p);
            res += "sw " + p.getValReg() + ", -" + 4*(i+1) + "($sp)\n";
            freeRegs(p);
        }

        res += "addi $sp, $sp, -" + (argsInStack * 4) + "\n";
        return res;
    }

    private String callerEnd(Quad q){
        String res = "";
        String[] params = q.getParams();
        int argsInStack = Math.max(params.length - 4, 0);
        res += "addi $sp, $sp, " + (argsInStack * 4) + "\n"; //pop extra args off
        res += "addi $sp, $sp, 40\n";
        for (int i = 0; i < 10; i++) {
            res += "lw $t" + i + ", -" + (i+1) * 4 + "($sp)\n";
        }
        
        if (q.getOp().equals("callr")) {
            //load return value
            String returnName = q.getAddr1();
            Operand o = new Operand(returnName);
            res += naiveLoad(o);
            res += "move " + o.getValReg() + ", $v0\n";
            res += naiveStore(o);
            freeRegs(o);
        }
        //restore args registers from stack
        res += "addi $sp, $sp, 16\n";
        for (int i = 0; i < 4; i++){
            res += "lw $a" + i + ", -" + (i+1) * 4 + "($sp)\n";
        }
        return res;
    }

    private String calleeBegin(String functionName) {
        TigerSymbol temp = scope.lookupSymbol(functionName);
        TigerUserFunction function = (TigerUserFunction)temp;
        StringBuilder res = new StringBuilder();
        res.append("sw $ra, -4($sp)\n");
        res.append("addi $sp, $sp, -4\n");
        List<String> params = function.getParameterNames();
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                paramNamesToNumbers.put(currentFunction + "_" + params.get(i), i);
            }
        }
        return res.toString();
    }

    private String calleeEnd(String functionName) {
        paramNamesToNumbers.clear();
        StringBuilder res = new StringBuilder();
        TigerSymbol temp = scope.lookupSymbol(functionName);
        TigerUserFunction function = (TigerUserFunction)temp;
        res.append("lw $ra, 0($sp)\n");
        res.append("addi $sp, $sp, 4\n");
        return res.toString();
    }

    private boolean isArrayLS(String op){
        return op.equals("array_load") ||
               op.equals("array_store");
    }

    private boolean isArithmeticOp(String op){
        return op.equals("add") ||
               op.equals("sub") ||
               op.equals("mult") ||
               op.equals("div") ||
               op.equals("and") ||
               op.equals("or");
    }

    private boolean isRelationalOp(String op){
        return op.equals("breq") ||
               op.equals("brneq") || 
               op.equals("brlt") || 
               op.equals("brgt") || 
               op.equals("brgeq") || 
               op.equals("brleq");
    }

    private boolean isLabel(String op){
        return op.matches("L\\d*:");     
    }

    private boolean isFunction(String op) {
        return op.matches("[^L][0-9a-zA-Z]*:");
    }
    
    public static boolean isNumeric(String str){
        return isFixedpt(str) || isInt(str);  //match a number with optional '-' and decimal.
    }

    public static boolean isFixedpt(String str){
        return str.matches("-?\\d+.\\d+");
    }   

    public static boolean isInt(String str){
        return str.matches("-?\\d+");
    }

    private String naiveLoad(Operand o){
        String registerType = getRegisterType(o);
        String varName = currentFunction + "_" + o.getName();
        if (paramNamesToNumbers.containsKey(varName)) {
            int paramNum = paramNamesToNumbers.get(varName);
            String res = "";
            String valueReg = this.rb.regBank.get(registerType).getReg();
            String addReg = this.rb.regBank.get(registerType).getReg();
            res += "la " + addReg + ", itemp\n";
            res += "lw " + valueReg + ", 0(" + addReg + ")\n"; 
            if (paramNum < 4) {
                res += "move " + valueReg + ", $a" + paramNum + "\n";
            } else {
                int offsetFromSp = (paramNamesToNumbers.size() - paramNum);
                res += "lw " + valueReg + ", " + offsetFromSp*4 + "($sp)\n";
            }
            o.setValReg(valueReg);
            o.setAddReg(addReg);
            return res;
        }
        else if(isNumeric(o.getName())){
            String valReg = this.rb.regBank.get(registerType).getReg();
            String res = "";
            res += "li  " + valReg + ", " + o.getName() + "\n";
            o.setValReg(valReg);
            return res;
        }
        else if(isTemp(o.getName())){
            int offset = getTempNum(o.getName());
            String res = "";
            String addReg = this.rb.regBank.get(registerType).getReg();
            String valueReg = this.rb.regBank.get(registerType).getReg();
            res += "la  " + addReg + ", itemp\n";
            res += "lw  " + valueReg + ",  " +  Integer.toString(offset) + "(" + addReg + ")\n";
            o.setAddReg(addReg);
            o.setValReg(valueReg);
            return res;
        }
        else{
            String loadMips = "";
            String addReg = this.rb.regBank.get(registerType).getReg();
            String valueReg = this.rb.regBank.get(registerType).getReg();
            loadMips += "la  " + addReg + ",  " + varName + "\n";
            loadMips += "lw  " + valueReg + ",  " + "0(" + addReg + ")\n";
            o.setAddReg(addReg);
            o.setValReg(valueReg);
            return loadMips;
        }
    }

    private int getTempNum(String temp){
        String tnum = temp.substring(1);
        Integer i = Integer.parseInt(tnum);
        return i * 4;
    }

    private String getRegisterType(Operand o){
        if(getType(o.getName()).equals("int"))
            return "TEMPS";
        else return "FLOAT_TEMPS";
    }

    private void freeRegs(Operand o){
        String registerType = getRegisterType(o);
        this.rb.regBank.get(registerType).freeReg(o.getValReg());
        if(!isNumeric(o.getName()))
            this.rb.regBank.get(registerType).freeReg(o.getAddReg());
    }

    private String naiveStore(Operand o){
        String storeMips = "";
        int offset = 0;
        if(isTemp(o.getName())){
           offset = getTempNum(o.getName());
        }
        storeMips += "sw " +  o.getValReg() + ",  "+ offset +"(" + o.getAddReg() + ")\n"; 
        return storeMips;
    }

    public String genDataSection(Map<Quad, Boolean> ir){
        Set<String> variables = new HashSet<String>();
        String dataSection = ".data\n"; 
        String currentProc = "main";
        for(Map.Entry<Quad, Boolean> entry: ir.entrySet()){
            String opName = entry.getKey().getOp();
            if(opName.equals("assign") && !isTemp(entry.getKey().getAddr1())){
                variables.add(currentProc + "_" + entry.getKey().getAddr1());
            } else if (isFunction(opName)) {
                currentProc = opName.substring(0, opName.length()-1);
            }
        }

        currentProc = "main";
        for(Map.Entry<Quad, Boolean> entry: ir.entrySet()){
            String opName = entry.getKey().getOp();
            if(opName.equals("assign")){
                String varName = currentProc + "_" + entry.getKey().getAddr1();
                if(variables.contains(varName)){
                    if(entry.getKey().getTotalOperands() == 3){
                        dataSection += varName + ":\t" + ".word\t" + 
                            entry.getKey().getAddr3() + ":" + entry.getKey().getAddr2() + "\n";  
                    }
                    else {
                        dataSection += varName + ":\t" + ".word\t" + entry.getKey().getAddr2() + "\n";  
                    }
                    variables.remove(varName);
                    ir.put(entry.getKey(), true);
                }
            } else if (isFunction(opName)){
                currentProc = opName.substring(0, opName.length()-1);
            }
        }

        return dataSection;
    }

    private String addTempData(){
        return "itemp:  .word  1000\n";
    }
 
    private boolean isTemp(String var){
        Pattern p = Pattern.compile("t\\d*");
        Matcher m = p.matcher(var);
        return m.matches();
    }

    private String storeRaForMain(){
        String res = "";
        res += "sw $ra, -4($sp)\n";
        res += "addi $sp, $sp, -4\n";
        return res;
    }


    public String getMIPSCode(List<Quad> ir){

        /*All instructions not/"false" processed*/
        Map<Quad, Boolean> irCode = new LinkedHashMap<Quad, Boolean>();
        for(Quad q: ir){
            irCode.put(q, false);
        }

        String mipsCode = "";
        mipsCode += genDataSection(irCode);
        mipsCode += addTempData();
        mipsCode += textSegment;
        mipsCode += mainSegment;
        mipsCode += storeRaForMain();
        mipsCode += naiveRegAllocation(irCode);
        mipsCode += calleeEnd("main");
        mipsCode += "jr $ra\n";
        return mipsCode; 
    }
    
}

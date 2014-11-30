import java.util.*;
import java.util.regex.*;

public class MIPSGenerator{
    private List<Quad> mipsCode;
    private final MIPSRegisterBank rb;  
    private TigerScope scope;

    private final String dataSegment = ".data\n";
    private final String textSegment = ".text\n";
    private final String mainSegment = ".globl main\nmain:\n";
    private final String exitProgram = "li $v0, 10\nsyscall\n";

    private Map<String, String> tempRegMap;

    public MIPSGenerator(TigerScope scope){
        this.mipsCode = new ArrayList<Quad>();
        this.rb = MIPSRegisterBank.getMIPSRegisterBank();
        this.scope = scope;
        this.tempRegMap = new HashMap<String, String>();
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
                else if(entry.getKey().getOp().equals("call")){
                    if(entry.getKey().getAddr1().equals("printi")){
                        res += "li $v0 1\n";
                        res += "lw $a0 " + entry.getKey().getParam() + "\n"; 
                        res += "syscall" + "\n"; 
                        res += "li $v0 4\n";
                        res += "la $a0 newline\n";
                        res += "syscall"  + "\n";
                    }
                }
                else if(isLabel(entry.getKey().getOp())){
                    res += entry.getKey().getOp() + "\n";
                }
                else if(entry.getKey().getOp().equals("goto")){
                    res += "j " + entry.getKey().getAddr1() + "\n";
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

        if(isNumeric(o.getName())){
            String valReg = this.rb.regBank.get(registerType).getReg();
            String res = "";
            res += "li  " + valReg + ", " + o.getName() + "\n";
            o.setValReg(valReg);
            return res;
        }
        if(isTemp(o.getName())){
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
            loadMips += "la  " + addReg + ",  " + o.getName() + "\n";
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
        for(Map.Entry<Quad, Boolean> entry: ir.entrySet()){
            if(entry.getKey().getOp().equals("assign") && !isTemp(entry.getKey().getAddr1())){
                variables.add(entry.getKey().getAddr1());
            }
        }

        for(Map.Entry<Quad, Boolean> entry: ir.entrySet()){
            if(entry.getKey().getOp().equals("assign")){
                if(variables.contains(entry.getKey().getAddr1())){
                    dataSection += entry.getKey().getAddr1() + ":\t" + ".word\t" + entry.getKey().getAddr2() + "\n";  
                    variables.remove(entry.getKey().getAddr1());
                    ir.put(entry.getKey(), true);
                }
            }
        }

        return dataSection;
    }

    private String addTempData(){
        return "itemp:  .word  1000\n";
    }
   
    private String addNewline(){
        return "newline:  .asciiz \"\\n\"\n";
    }
 
    private boolean isTemp(String var){
        Pattern p = Pattern.compile("t\\d*");
        Matcher m = p.matcher(var);
        return m.matches();
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
       mipsCode += addNewline();
       mipsCode += textSegment;
       mipsCode += mainSegment;
       mipsCode += naiveRegAllocation(irCode);
       mipsCode += exitProgram;
       return mipsCode; 
    }
    
}

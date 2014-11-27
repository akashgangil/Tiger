import java.util.*;

public class MIPSGenerator{
    private List<Quad> mipsCode;
    private final MIPSRegisterBank rb;  
    private TigerScope scope;

    private final String dataSegment = ".data\n";
    private final String textSegment = ".text\n";
    private final String mainSegment = ".globl main\nmain:\n";
    private final String exitProgram = "li $v0, 10\nsyscall\n";

    public MIPSGenerator(TigerScope scope){
        this.mipsCode = new ArrayList<Quad>();
        this.rb = MIPSRegisterBank.getMIPSRegisterBank();
        this.scope = scope;
    }

    private String naiveRegAllocation(Map<Quad, Boolean> ir){
        String res = "";

        for(Map.Entry<Quad, Boolean> entry:  ir.entrySet()){
            if(!entry.getValue()){
                if(entry.getKey().getOp().equals("assign")){
                    Operand o = new Operand(entry.getKey().getAddr1());
                    res += naiveLoad(o, false);

                    String dest = "";
                    Operand temp = Operand.tempReg.get(entry.getKey().getAddr2());
                    String inst = "";
                    if(temp != null){
                        dest = temp.getValReg();
                        inst = "add ";
                    }
                    else{
                        dest = entry.getKey().getAddr2();
                        inst = "addi ";
                    }

                    res += inst
                         + o.getValReg() + ", "  
                         + this.rb.regBank.get("ZERO").getReg() + ", "  
                         + dest + "\n";
                    res += naiveStore(o.getValReg(), o.getAddReg() );
                    this.rb.regBank.get("TEMPS").freeReg(o.getValReg());
                    this.rb.regBank.get("TEMPS").freeReg(o.getAddReg());
                    Operand.free(o.getName());
                }
                else if(isArithmeticOp(entry.getKey().getOp())){
                    Operand o1, o2, o3, temp;

                    temp = Operand.tempReg.get(entry.getKey().getAddr1());
                    if(temp != null){
                        o1 = temp;
                    }
                    else{ 
                        o1 = new Operand(entry.getKey().getAddr1());
                        res += naiveLoad(o1, false);
                    }
                    
                    temp = Operand.tempReg.get(entry.getKey().getAddr1());
                    if(temp != null){
                        o2 = temp;
                    }
                    else{ 
                        o2 = new Operand(entry.getKey().getAddr2());
                        res += naiveLoad(o2, false);
                    }
                    
                    temp = Operand.tempReg.get(entry.getKey().getAddr1());
                    if(temp != null){
                        o3 = temp;
                    }
                    else{ 
                        o3 = new Operand(entry.getKey().getAddr3());
                        res += naiveLoad(o3, true);
                    }
                    
                    res += entry.getKey().getOp() + "  " + o3.getValReg() + ", "  
                           + o1.getValReg() + ", " + o2.getValReg() + "\n"; 
                    this.rb.regBank.get("TEMPS").freeReg(o3.getValReg());
                    this.rb.regBank.get("TEMPS").freeReg(o3.getAddReg());
                    this.rb.regBank.get("TEMPS").freeReg(o1.getAddReg());
                    this.rb.regBank.get("TEMPS").freeReg(o1.getAddReg());
                    this.rb.regBank.get("TEMPS").freeReg(o2.getAddReg());
                    this.rb.regBank.get("TEMPS").freeReg(o2.getAddReg());
                    Operand.free(o1.getName());
                    Operand.free(o2.getName());
                }
                else if(entry.getKey().getOp().equals("call")){
                    if(entry.getKey().getAddr1().equals("printi")){
                        res += "li $v0 1\n";
                        res += "lw $a0 " + entry.getKey().getParam() + "\n"; 
                        res += "syscall" + "\n"; 
                    }
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

    private String naiveLoad(Operand o, boolean isTemp){
        String loadMips = "";
        String addReg = "";
        if(!isTemp) 
            addReg = this.rb.regBank.get("TEMPS").getReg();
        String valueReg = this.rb.regBank.get("TEMPS").getReg();
        if(!isTemp){
            loadMips += "la  " + addReg + ",  " + o.getName() + "\n";
            loadMips += "lw  " + valueReg + ",  " + "0(" + addReg + ")\n";
        }
        o.setAddReg(addReg);
        o.setValReg(valueReg);
        return loadMips;
    }

    private String naiveStore(String valReg, String reg){
        String storeMips = "";
        storeMips += "sw " +  valReg + ",  0(" + reg + ")\n"; 
        return storeMips;
    }

    public String genDataSection(Map<Quad, Boolean> ir){
        Set<String> variables = new HashSet<String>();
        String dataSection = ".data\n"; 
        for(Map.Entry<Quad, Boolean> entry: ir.entrySet()){
            if(entry.getKey().getOp().equals("assign")){
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

    public String getMIPSCode(List<Quad> ir){

       /*All instructions not/"false" processed*/
       Map<Quad, Boolean> irCode = new LinkedHashMap<Quad, Boolean>();
       for(Quad q: ir){
            irCode.put(q, false);
       }
    

       String mipsCode = "";
       mipsCode += genDataSection(irCode);
       mipsCode += textSegment;
       mipsCode += mainSegment;
       mipsCode += naiveRegAllocation(irCode);
       mipsCode += exitProgram;
       return mipsCode; 
    }
}

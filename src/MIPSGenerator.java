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
                    res += naiveLoad(o);    
                    res += "addi "
                         + o.getValReg() + " "  
                         + this.rb.regBank.get("ZERO").getReg() + " "  
                         + entry.getKey().getAddr2() + "\n";
                    res += naiveStore(o.getValReg(), o.getAddReg() );
                    this.rb.regBank.get("TEMPS").freeReg(o.getValReg());
                    this.rb.regBank.get("TEMPS").freeReg(o.getAddReg());
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

    private String naiveLoad(Operand o){
        String loadMips = "";
        String addReg = this.rb.regBank.get("TEMPS").getReg();
        String valueReg = this.rb.regBank.get("TEMPS").getReg();
        loadMips += "la  " + addReg + ",  " + o.getName() + "\n";
        loadMips += "lw  " + valueReg + ",  " + "0(" + addReg + ")\n";
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

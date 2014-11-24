import java.util.*;

public class MIPSGenerator{
    private List<Quad> mipsCode;

    private final String dataSegment = ".data\n";
    private final String textSegment = ".text\n";
    private final String exitProgram = "li $v0, 10\nsyscall\n";
    private final MIPSRegisterBank rb;  

    public MIPSGenerator(){
        this.mipsCode = new ArrayList<Quad>();
        this.rb = MIPSRegisterBank.getMIPSRegisterBank();
    }

    private String naiveAllocation(List<Quad> ir){
        System.out.println("here1");
        String res = "";
        for(Quad q: ir)
        if(q.getOp().equals("assign")){
          res += "addi " + this.rb.regBank.get("TEMPS").getReg() + " "  + this.rb.regBank.get("ZERO").getReg() + " "  + q.getAddr2() + "\n";
        }    
        System.out.println("here3");
        return res;
    }

    public String getMIPSCode(List<Quad> ir){

       String mipsCode = "";
       mipsCode += dataSegment;

       mipsCode += textSegment;

       mipsCode += naiveAllocation(ir);

       mipsCode += exitProgram;
       return mipsCode; 
    }
}

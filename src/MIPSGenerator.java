import java.util.*;

public class MIPSGenerator{
    private List<Quad> mipsCode;

    private final String dataSegment = ".data\n";
    private final String textSegment = ".text\n";
    private final String exitProgram = "li $v0, 10\nsyscall\n";

    public MIPSGenerator(){
        this.mipsCode = new ArrayList<Quad>();
    }

    private void naiveAllocation(){

    }

    public String getMIPSCode(List<Quad> ir){
       String mipsCode = "";
       mipsCode += dataSegment;

       mipsCode += textSegment;

       mipsCode += exitProgram;
       return mipsCode; 
    }
}

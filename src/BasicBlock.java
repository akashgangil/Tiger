import java.util.*;

public class BasicBlock{

    private List<Quad> basicBlock;

    public BasicBlock(){
        this.basicBlock = new ArrayList<Quad>();
    }

    public void addQuad(Quad ir){
        this.basicBlock.add(ir);
    }

    public List<Quad> getBasicBlock(){
        return basicBlock; 
    }

    public String toString(){
        String res = "";
        res += "BLOCK\n";
        for(Quad quad : basicBlock){
            res += quad.toString() + "\n";
        }
        return res;
    }

}

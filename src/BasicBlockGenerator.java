import java.util.*;

public class BasicBlockGenerator{
    
    private List<BasicBlock> basicBlockList;

    private List<String> leaderOpCodes = Arrays.asList("brleq", "brgeq", "brlt", "brgt", "brneq", "breq");
    private List<Integer> leaderIndex;

    public BasicBlockGenerator(){
        this.basicBlockList = new ArrayList<BasicBlock>();
        this.leaderIndex = new ArrayList<Integer>();
    }

    public List<BasicBlock> findBasicBlocks(List<Quad> irCode){
        BasicBlock b = getNewBasicBlock();
        boolean inblock = false; 
        for(int i = 0; i < irCode.size(); ++i){
            if(isLeader(irCode.get(i), i, irCode.size())){
                if(i == 0){
                    b.addQuad(irCode.get(i));
                }
                else{
                    basicBlockList.add(b);
                    b = getNewBasicBlock();
                    b.addQuad(irCode.get(i));
                }
            }
            else{
                b.addQuad(irCode.get(i));
            }
        }
        basicBlockList.add(b);

        return this.basicBlockList;
    }

    private BasicBlock getNewBasicBlock(){
        return new BasicBlock();
    }

    public boolean isLeader(Quad ir, int index, int total){
        /*Branch Targets Label or goto*/
        if(leaderIndex.contains(index))
            return true;

        if(this.leaderOpCodes.contains(ir.getOp())) 
            leaderIndex.add(index + 1);

        if(index == 0 || ir.getOp().matches("^L\\d*:$"))
            return true;

        if(ir.getOp().equals("goto"))
            return true;
            
        return false;
    } 
}

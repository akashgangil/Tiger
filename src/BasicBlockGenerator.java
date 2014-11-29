import java.util.*;

public class BasicBlockGenerator {
    
    private List<Quad> ir;

    public BasicBlockGenerator(List<Quad> ir) {
        this.ir = ir;
    }
    
    public LinkedList<BasicBlock> getBasicBlocks() {
        HashMap<String, BasicBlock> labels = new HashMap<String, BasicBlock>();
        LinkedList<BasicBlock> basicBlocks = new LinkedList<BasicBlock>();
        
        BasicBlock currentBlock = null;
        for (int idx = 0; idx < ir.size(); idx += 1) {
            Quad quad = ir.get(idx);
            String target = quad.getTarget();
            String label = quad.getLabel();
            if (target != null) {
                currentBlock.addQuad(quad);
                
                BasicBlock targetBlock = labels.get(label);
                if (targetBlock == null) {
                    targetBlock = getNewBasicBlock();
                    basicBlocks.add(targetBlock);
                    labels.put(target, targetBlock);
                }
                targetBlock.addParent(currentBlock);
                currentBlock.addChild(targetBlock);
                
                if (quad.canFallthrough()) {
                    // this starts a new block
                    BasicBlock nextBlock = getNewBasicBlock();
                    currentBlock.next = nextBlock;
                    nextBlock.prev = currentBlock;
                    
                    basicBlocks.add(nextBlock);
                    nextBlock.addChild(currentBlock);
                    nextBlock.addParent(currentBlock);
                    
                    currentBlock = nextBlock;
                }
            } else if (label != null) {
                BasicBlock nextBlock = labels.get(label);
                if (nextBlock == null) {
                    nextBlock = getNewBasicBlock();
                    basicBlocks.add(nextBlock);
                    labels.put(label, nextBlock);
                }
                
                currentBlock.addChild(nextBlock);
                nextBlock.addParent(currentBlock);
                currentBlock.next = nextBlock;
                nextBlock.prev = currentBlock;
                
                currentBlock = nextBlock;
                
                currentBlock.addQuad(quad);
            } else {
                if (currentBlock == null) {
                    currentBlock = getNewBasicBlock();
                    basicBlocks.add(currentBlock);
                }
                currentBlock.addQuad(quad);
            }
        }
        
        return basicBlocks;
    }
    
    public LinkedList<BasicBlock> getExtendedBlocks() {
        LinkedList<BasicBlock> blocks = getBasicBlocks();
        
        while (true) {
            boolean merged = false;
            
            LinkedList<BasicBlock> blocksCopy = new LinkedList<BasicBlock>(blocks);

            for (BasicBlock block : blocks) {
                List<BasicBlock> parents = block.getParents();
                if (parents.size() == 1) {
                    BasicBlock parent = parents.get(0);
                    if (parent.next == null || parent.next == block) {
                        blocksCopy.remove(block);
                        parent.append(block);
                        merged = true;
                    }
                }
            }
            
            blocks = blocksCopy;
            
            if (!merged) {
                break;
            }
        }
        
        return blocks;
    }
    
    private BasicBlock getNewBasicBlock() {
        return new BasicBlock();
    }
    
}

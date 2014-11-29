import java.util.*;

public class BasicBlock {

    private boolean isLabel;
    private List<Quad> quads;
    private List<BasicBlock> parents;
    private List<BasicBlock> children;
    public BasicBlock prev;
    public BasicBlock next;
    
    public BasicBlock() {
        quads = new ArrayList<Quad>();
        parents = new ArrayList<BasicBlock>();
        children = new ArrayList<BasicBlock>();
        
        isLabel = false;
    }
    
    public void append(BasicBlock block) {
        if (block == null) {
            return;
        }
        
        if (block == next) {
            next = null;
        }
        
        for (Quad quad : block.quads) {
            addQuad(quad);
        }
    }
    
    public void addParent(BasicBlock parent) {
        parents.add(parent);
    }
    
    public void addChild(BasicBlock child) {
        children.add(child);
    }
    
    public List<BasicBlock> getParents() {
        return parents;
    }
    
    public List<BasicBlock> getChildren() {
        return children;
    }

    public void addQuad(Quad ir){
        quads.add(ir);
    }

    public void setIsLabel() {
        isLabel = true;
    }

    public boolean isLabel() {
        return isLabel;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Block [" + hashCode() + "](" + children.size() + ":" + parents.size() + ") {\n");
        for (Quad quad : quads) {
            str.append("\t" + quad + "\n");
        }
        str.append("}\n");
        return str.toString();
    }
}

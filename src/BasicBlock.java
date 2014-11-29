import java.util.*;
import java.util.regex.*;

public class BasicBlock {

    private List<Quad> quads;
    private List<BasicBlock> parents;
    private List<BasicBlock> children;
    public BasicBlock prev;
    public BasicBlock next;
    
    public BasicBlock() {
        quads = new ArrayList<Quad>();
        parents = new ArrayList<BasicBlock>();
        children = new ArrayList<BasicBlock>();
    }
    
    public void append(BasicBlock block) {
        if (block == null) {
            return;
        }
        
        if (block == next) {
            next = block.next;
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

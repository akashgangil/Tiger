import java.util.*;

public class LivenessAnalyzer {
    
    public static List<Interval> analyze(List<Quad> ir, List<BasicBlock> blocks) {
        @SuppressWarnings("unchecked")
        List<String>[] ins = (List<String>[]) new LinkedList[ir.size()];
        @SuppressWarnings("unchecked")
        List<String>[] outs = (List<String>[]) new LinkedList[ir.size()];
        
        // Do the liveness
        while (true) {
            boolean propagated = false;
            
            // Instructions
            for (int idx = 0; idx < ir.size(); idx += 1) {
                Quad quad = ir.get(idx);
                List<String> in = ins[idx];
                List<String> out = outs[idx];
                
                List<String> copy = new LinkedList<String>(in);
                
                in.clear();
                in.addAll(out);
                in.removeAll(quad.defs());
                in.addAll(quad.uses());
                
                if (!in.equals(copy)) {
                    propagated = true;
                }
            }
            
            // Propagate between blocks
            for (BasicBlock block : blocks) {
                List<String> out = outs[block.end()];
                for (BasicBlock child : block.getChildren()) {
                    List<String> in = ins[child.start()];
                    
                    for (String var : in) {
                        if (!out.contains(var)) {
                            out.add(var);
                        }
                    }
                }
            }
            
            if (!propagated) break;
        }
        
        // Create intervals
        List<Interval> all = new LinkedList<Interval>();
        HashMap<String, Interval> current = new HashMap<String, Interval>();
        
        for (int idx = 0; idx < ir.size(); idx += 1) {
            List<String> in = ins[idx];
            List<String> out = outs[idx];
            
            List<String> lost = new LinkedList<String>(in);
            List<String> gained = new LinkedList<String>(out);
            
            lost.removeAll(out);
            gained.removeAll(in);
            
            for (String var : lost) {
                Interval i = current.remove(var);
                i.end = idx;
            }
            
            for (String var : in) {
                Interval i = new Interval();
                i.var = var;
                i.start = idx;
                all.add(i);
                current.put(var, i);
            }
        }
        
        return all;
    }
    
}
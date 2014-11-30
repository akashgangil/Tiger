import java.util.*;
import java.util.regex.*;

public class RegisterGraph {
    
    public class RegisterColoring {
        public HashMap<String, List<String>> registers;
        public List<String> spills;
    }
    
    private List<String> ints = Arrays.asList("$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$t8", "$t9");
    private List<String> floats = Arrays.asList("$f4", "$f5", "$f6", "$f7", "$f8", "$f9", "f10", "$f16", "$f17", "$f18");
    
    private List<Interval> intIntervals;
    private List<Interval> intSpills;
    
    private List<Interval> floatIntervals;
    
    public RegisterGraph() {
        intIntervals = new LinkedList<Interval>();
        floatIntervals = new LinkedList<Interval>();
    }
    
    public void addIntInterval(Interval i) {
        intIntervals.add(i);
    }
    
    public void addFloatInterval(Interval i) {
        floatIntervals.add(i);
    }
    
    private RegisterColoring color(List<String> colors, int colorLimit, List<Interval> intervals) {
        int iMax = 0;
        for (Interval i : intervals) {
            iMax = Math.max(iMax, i.end);
        }

        HashMap<String, List<String>> iGraph = new HashMap<String, List<String>>();
        @SuppressWarnings("unchecked")
        List<String>[] iVars = (LinkedList<String>[]) new LinkedList[iMax];

        // Set up the intervals in an array
        for (Interval i : intervals) {
            iGraph.put(i.var, new LinkedList<String>());
            for (int idx = i.start; idx <= i.end; idx += 1) {
                if (!iVars[idx].contains(i)) {
                    iVars[idx].add(i.var);
                }
            }
        }
        
        // Construct the graph
        for (int idx = 0; idx < iMax; idx += 1) {
            List<String> vars = iVars[idx];
            for (String vari : vars) {
                for (String varj : vars) {
                    if (vari == varj) continue;
                    
                    List<String> neighbors = iGraph.get(vari);
                    if (!neighbors.contains(varj)) {
                        neighbors.add(varj);
                        iGraph.put(vari, neighbors);
                    }
                }
            }
        }
        
        // Color the graph
        LinkedList<String> stack = new LinkedList<String>();
        
        HashMap<String, List<String>> registers = new HashMap<String, List<String>>();
        LinkedList<String> spills = new LinkedList<String>();
        
        HashMap<String, List<String>> iGraphScratch = new HashMap<String, List<String>>(iGraph);
        while (true) {
            List<String> remove = new LinkedList<String>();
            
            for (String var : iGraphScratch.keySet()) {
                List<String> neighbors = iGraphScratch.get(var);
                if (neighbors.size() < colorLimit) {
                    remove.add(var);
                    stack.addLast(var);
                }
            }
            
            if (remove.size() == 0) {
                String maxVar = null;
                int max = 0;
                for (String var : iGraphScratch.keySet()) { 
                    int neighbors = iGraphScratch.get(var).size();
                    if (neighbors > max) {
                        max = neighbors;
                        remove.clear();
                        remove.add(var);
                    }
                }
                
                spills.add(maxVar);
            }
            
            if (remove.size() == 0) {
                break;
            }
            
            for (String vari : remove) {
                iGraphScratch.remove(vari);
                for (String varj : iGraphScratch.keySet()) {
                    List<String> neighbors = iGraphScratch.get(varj);
                    neighbors.remove(vari);
                }
            }
        }
        
        for (String spill : spills) {
            // Actually remove the spills
            iGraph.remove(spill);
        }
        
        while (!stack.isEmpty()) {
            String var = stack.pollLast();
            boolean colored = false;
            for (int color = 0; color < colorLimit; color += 1) {
                String register = ints.get(color);
                boolean valid = true;
                for (String neighbor : iGraph.get(var)) {
                    if (registers.get(register).contains(neighbor)) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    // found a color
                    colored = true;
                    List<String> sharedWith = registers.get(register);
                    sharedWith.add(var);
                    registers.put(register, sharedWith);
                }
            }
            
            if (!colored) {
                System.out.println("ERROR: Register coloring failed ... ");
                System.exit(1);
            }
        }
        
        RegisterColoring coloring = new RegisterColoring();
        coloring.registers = registers;
        coloring.spills = spills;
        
        return coloring;
    }
    
    public RegisterColoring intColoring(int colorLimit) {
        return color(ints, colorLimit, intIntervals);
    }
    
    public RegisterColoring floatColoring(int colorLimit) {
        return color(floats, colorLimit, floatIntervals);
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        return str.toString();
    }
    
}
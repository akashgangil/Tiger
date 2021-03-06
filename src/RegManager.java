import java.util.*;

public class RegManager{
    Set<String> inUse;
    Set<String> free; 
    boolean limited;

    public RegManager(List<String> regList, boolean limited) {
           this.free = new HashSet<String>();
           for(String reg :regList){
                this.free.add(reg);
           }
           this.inUse = new HashSet<String>(); 
           this.limited = limited;
    }

    public String getReg(){
        if(!this.limited) return this.free.iterator().next();

        if(this.free.isEmpty()) return null;
            
        Iterator<String> iterator = this.free.iterator();
        String reg = "";

        while(iterator.hasNext()){
            reg = iterator.next();
            if(reg != null && !reg.isEmpty()) break;   
        }
        
   
        this.inUse.add(reg);
        this.free.remove(reg);
        return reg;
    }

    public void freeReg(String reg){
      this.inUse.remove(reg);
      this.free.add(reg);  
    }
    
}

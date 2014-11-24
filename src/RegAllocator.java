import java.util.*;

public class RegAllocator{
    Set<String> inUse;
    Set<String> free; 

    public RegAllocator(List<String> regList) {
           this.free = new HashSet<String>();
           for(String reg :regList){
                this.free.add("reg");
           }
           this.inUse = new HashSet<String>(); 
    }

    public String getReg(){
        if(this.free.isEmpty()) return null;
       
        String reg =  this.free.iterator().next();
        this.inUse.add(reg);
        return reg;
    }

    public void freeReg(String reg){
      this.inUse.remove(reg);
      this.free.add(reg);  
    }
    
}

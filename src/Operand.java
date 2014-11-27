import java.util.*;

public class Operand{
    String name;
    String addressRegister;
    String valueRegister;

    public static Map<String, Operand> tempReg = new HashMap<String, Operand>();

    public Operand(String name){
        this.name = name;
        tempReg.put(this.name, this);
    }

    public String getName(){
        return name;
    }

    public String getAddReg(){
        return this.addressRegister;
    }

    public String getValReg(){
        return this.valueRegister;
    }

    public void setAddReg(String reg){
        this.addressRegister = reg;
    }
    
    public void setValReg(String reg){
        this.valueRegister = reg;
    }

    public static void free(String name){
        tempReg.remove(name);
    }


}

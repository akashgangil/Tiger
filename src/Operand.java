public class Operand{
    String name;
    String addressRegister;
    String valueRegister;

    public Operand(String name){
        this.name = name;
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


}

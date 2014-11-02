public class TigerVariable extends TigerSymbol {
    private TigerType type;
    
    public TigerVariable(String name, TigerType type) {
        this.name = name;
        this.type = type;
    }
    
    public String toString() {
        return name + " : " + "TigerVariable<" + type + ">";
    }
}
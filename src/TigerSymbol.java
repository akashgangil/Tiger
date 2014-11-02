public class TigerSymbol extends TigerAstNode {
    protected String name;
    
    public TigerSymbol(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name + " : TigerSymbol";
    }
}


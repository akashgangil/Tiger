import org.antlr.runtime.tree.*;

public class TigerType extends TigerSymbol {
    private static TigerType Int;
    private static TigerType FixedPt;
    
    private TigerType baseType;
    private int width;
    private int height;

    static {
        TigerType.Int = new TigerType("int");
        TigerType.FixedPt = new TigerType("fixedpt");
    }
    
    public static TigerType Int() {
        return Int;
    }
    
    public static TigerType FixedPt() {
        return FixedPt;
    }
    
    protected TigerType(String name) {
        super(name);
    }
    
    public TigerType(CommonTree typeNode, TigerScope scope) throws Exception {
        super(typeNode.getChild(0).getText());
        this.baseType = scope.lookupSymbol(typeNode.getChild(1).getText(), TigerType.class);
        this.width = (typeNode.getChild(2) == null) ? 0 : Integer.parseInt(typeNode.getChild(2).getText());
        this.height = (typeNode.getChild(2) == null) ? 0 : Integer.parseInt(typeNode.getChild(2).getText());
        
        if (!this.baseType.isBaseType()) {
            throw new Exception("base type required. found: " + this.baseType);
        }
    }
    
    public boolean isBaseType() {
        return (this == TigerType.Int || this == TigerType.FixedPt);
    }
    
    public String toString() {
        if (this == TigerType.Int || this == TigerType.FixedPt) {
            return name + " : TigerBaseType";
        }
        return name + " : " + "TigerType<" + baseType + ">[" + width + "]" + "[" + height + "]";
    }
}

import org.antlr.runtime.tree.*;

public class TigerType extends TigerSymbol {
    private static TigerType Int;
    private static TigerType FixedPt;
    
    private TigerType baseType;
    private int width;
    private int height;

    static {
        TigerType.Int = new TigerType();
        TigerType.Int.name = "int";
        
        TigerType.FixedPt = new TigerType();
        TigerType.FixedPt.name = "fixedpt";
    }
    
    public static TigerType Int() {
        return Int;
    }
    
    public static TigerType FixedPt() {
        return FixedPt;
    }
    
    public static TigerType fromAstNode(CommonTree typeNode, TigerScope scope) throws Exception {
        String name = typeNode.getChild(0).getText();
        TigerType baseType = scope.lookupSymbol(typeNode.getChild(1).getText(), TigerType.class);
        int width = (typeNode.getChild(2) == null) ? 0 : Integer.parseInt(typeNode.getChild(2).getText());
        int height = (typeNode.getChild(2) == null) ? 0 : Integer.parseInt(typeNode.getChild(2).getText());
        
        if (!baseType.isBaseType()) {
            throw new Exception("base type required. found: " + baseType);
        }
        
        TigerType type = new TigerType();
        type.name = name;
        type.baseType = baseType;
        type.width = width;
        type.height = height;
        
        return type;
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

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
        String name = TigerSemanticError.notReservedName((CommonTree)typeNode.getChild(0));
        if (name == null) {
            return null;
        }
        
        CommonTree baseTypeTree = (CommonTree)typeNode.getChild(1);
        TigerType baseType = TigerSemanticError.type(baseTypeTree, scope);
        if (baseType == null) {
            return null;
        } else if (!baseType.isBaseType()) {
            TigerSemanticError.baseTypeRequired(baseTypeTree);
            return null;
        }
        
        int width = (typeNode.getChild(2) == null) ? 0 : Integer.parseInt(typeNode.getChild(2).getText());
        int height = (typeNode.getChild(3) == null) ? 0 : Integer.parseInt(typeNode.getChild(3).getText());

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
    
    public TigerType getBaseType() {
        return baseType;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
    
    public String toString() {
        if (this == TigerType.Int || this == TigerType.FixedPt) {
            return name + " : TigerBaseType";
        }
        StringBuilder str = new StringBuilder(name + " : " + "TigerType<" + baseType + ">");
        if (width != 0) {
            str.append("[" + width + "]");
            if (height != 0) {
                str.append("[" + height + "]");
            }
        }
        
        return str.toString();
    }
}

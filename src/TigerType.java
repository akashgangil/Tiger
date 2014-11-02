import org.antlr.runtime.tree.*;

public class TigerType extends TigerSymbol {
    private TigerBaseType baseType;
    private int width;
    private int height;

    public TigerType(String name, TigerBaseType baseType, int width, int height) {
        super(name);
        this.baseType = baseType;
        this.width = width;
        this.height = height;
    }
    
    public TigerType(CommonTree typeNode, TigerScope scope) throws Exception {
        super(typeNode.getChild(0).getText());
        this.baseType = scope.lookupSymbol(typeNode.getChild(1).getText(), TigerBaseType.class);
        this.width = (typeNode.getChild(2) == null) ? 0 : Integer.parseInt(typeNode.getChild(2).getText());
        this.height = (typeNode.getChild(2) == null) ? 0 : Integer.parseInt(typeNode.getChild(2).getText());
    }
    
    public String toString() {
        return name + " : " + "TigerType<" + baseType + "[" + width + "]" + "[" + height + "]>";
    }
}

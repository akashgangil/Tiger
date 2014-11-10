import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerReference extends TigerExpression {
    private TigerVariable var;
    private TigerExpression width;
    private TigerExpression height;
    
    private static TigerReference commonInit(TigerVariable var, CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerExpression width = null;
        TigerExpression height = null;
        
        if (var == null) {
            return null;
        }
        
        CommonTree widthTree = (CommonTree)expressionTree.getChild(1);
        CommonTree heightTree = (CommonTree)expressionTree.getChild(2);
        
        
        if (widthTree != null) {
            width = TigerExpression.fromAstNode(widthTree, scope);
            if (width == null) {
                return null;
            } else if (!TigerSemanticError.assertTypesMatch(widthTree, TigerType.Int(), width.type)) {
                return null;
            }
        
            if (width.staticValue() != null) {
                int staticWidth = width.staticValue().intValue();
                if (staticWidth < 0 || staticWidth >= var.getType().getWidth()) {
                    TigerSemanticError.indexOutOfBounds(widthTree, staticWidth, var.getType().getWidth());
                    return null;
                }
            }
        
            if (heightTree != null) {
                height = TigerExpression.fromAstNode(heightTree, scope);
                if (height == null) {
                    return null;
                } else if (!TigerSemanticError.assertTypesMatch(heightTree, TigerType.Int(), height.type)) {
                    return null;
                }
                
                if (height.staticValue() != null) {
                    int staticHeight = height.staticValue().intValue();
                    if (staticHeight < 0 || staticHeight >= var.getType().getHeight()) {
                        TigerSemanticError.indexOutOfBounds(heightTree, staticHeight, var.getType().getHeight());
                        return null;
                    }
                }
            }
        }
        
        TigerReference reference = new TigerReference();
        reference.var = var;
        reference.width = width;
        reference.height = height;
        if (width != null) {
            // reference dereferences type
            reference.type = var.getType().getBaseType();
        } else {
            reference.type = var.getType();
        }
        
        return reference;
    }
    
    public static TigerReference forAssignment(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerVariable var = TigerSemanticError.variableForAssignment((CommonTree)expressionTree.getChild(0), scope);
        return commonInit(var, expressionTree, scope);
    }
    
    public static TigerReference fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerVariable var = TigerSemanticError.variable((CommonTree)expressionTree.getChild(0), scope);
        return commonInit(var, expressionTree, scope);
    }
}
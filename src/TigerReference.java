import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerReference extends TigerExpression {
    private TigerVariable var;
    private TigerExpression width;
    private TigerExpression height;
    
    public static TigerReference fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerVariable var = TigerSemanticError.variable((CommonTree)expressionTree.getChild(0), scope);
        TigerExpression width = null;
        TigerExpression height = null;
        
        if (var == null) {
            return null;
        }
        
        if (expressionTree.getChild(1) != null) {
            CommonTree widthTree = (CommonTree)expressionTree.getChild(1);
            width = TigerExpression.fromAstNode(widthTree, scope);
            if (width == null) {
                return null;
            } else if (!TigerSemanticError.assertTypesMatch(widthTree, TigerType.Int(), width.type)) {
                return null;
            }
        }
        
        if (expressionTree.getChild(2) != null) {
            CommonTree heightTree = (CommonTree)expressionTree.getChild(2);
            height = TigerExpression.fromAstNode(heightTree, scope);
            if (height == null) {
                return null;
            } else if (!TigerSemanticError.assertTypesMatch(heightTree, TigerType.Int(), height.type)) {
                return null;
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
}
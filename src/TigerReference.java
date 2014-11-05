import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerReference extends TigerExpression {
    private TigerVariable var;
    private TigerExpression width;
    private TigerExpression height;
    
    public static TigerReference fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        String name = expressionTree.getChild(0).getText();

        TigerReference reference = new TigerReference();

        reference.var = scope.lookupSymbol(name, TigerVariable.class);
        if (expressionTree.getChild(1) != null) {
            reference.width = TigerExpression.fromAstNode((CommonTree)expressionTree.getChild(1), scope);
        }
        if (expressionTree.getChild(2) != null) {
            reference.height = TigerExpression.fromAstNode((CommonTree)expressionTree.getChild(2), scope);
        }
        
        // TODO: width.type == Int && height.type == Int
        
        return reference;
    }
}
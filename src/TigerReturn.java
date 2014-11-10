import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerReturn extends TigerStatement {
    private TigerExpression returnExpression;

    public static TigerReturn fromAstNode(CommonTree returnTree, TigerScope scope) throws Exception {
        if ("return".equals(returnTree.getText())) {
            returnTree = (CommonTree)returnTree.getChild(0);
        }
        TigerExpression returnExpression = TigerExpression.fromAstNode(returnTree, scope);
        if (returnExpression == null) {
            return null;
        }
        
        TigerUserFunction function = scope.getFunction();
        TigerType returnType = function.getReturnType();
        if (returnType == null) {
            TigerSemanticError.noReturnExpected(returnTree);
            return null;
        } else if (!TigerSemanticError.assertTypesMatch(returnTree, returnType, returnExpression.type)) {
            return null;
        } else {
            function.setHasReturned();
        }
        
        TigerReturn returnStatement = new TigerReturn();
        returnStatement.returnExpression = returnExpression;
           
        return returnStatement;
    }
}
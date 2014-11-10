import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerInvocation extends TigerExpression {
    private TigerFunction function;
    private List<TigerExpression> expressions;

    public static TigerInvocation fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerFunction function = TigerSemanticError.function((CommonTree)expressionTree.getChild(0), scope);
        if (function == null) {
            return null;
        }

        List<TigerExpression> expressions = new LinkedList<TigerExpression>();
        CommonTree paramTree = (CommonTree)expressionTree.getChild(1);
        if (paramTree.getChildCount() == function.getParameterTypes().size()) {
            for (int idx = 0; idx < paramTree.getChildCount(); idx += 1) {
                CommonTree tree = (CommonTree)paramTree.getChild(idx);
                TigerType expectedType = function.getParameterTypes().get(idx);
                TigerExpression expression = TigerExpression.fromAstNode(tree, scope);
                if (expression == null) {
                    return null;
                }
                if (!TigerSemanticError.assertTypesMatch(tree, expectedType, expression.type)) {
                    return null;
                }

                expressions.add(expression);
            }
        } else {
            LinkedList<TigerType> foundTypes = new LinkedList<TigerType>();
            for (int idx = 0; idx < paramTree.getChildCount(); idx++) {
                CommonTree tree = (CommonTree)paramTree.getChild(idx);
                TigerExpression expression = TigerExpression.fromAstNode(tree, scope);
                if (expression == null) {
                    return null;
                }
                foundTypes.add(expression.type);
            }

            TigerSemanticError.functionSignatureMismatch((CommonTree)expressionTree.getChild(0), foundTypes, function.getParameterTypes());
            return null;
        }

        TigerType returnType = function.getReturnType();

        TigerInvocation invocation = new TigerInvocation();
        invocation.function = function;
        invocation.expressions = expressions;
        invocation.type = returnType;

        return invocation;
    }
}

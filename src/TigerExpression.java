import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerExpression extends TigerStatement {
    protected TigerType type;
    
    public static TigerExpression fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerExpression expression = null;
        switch (expressionTree.getText()) {
            case "REFERENCE":
                expression = TigerReference.fromAstNode(expressionTree, scope);
                break;
            case "CONSTANT":
                expression = TigerConstant.fromAstNode(expressionTree, scope);
                break;
            case "INVOKE":
                expression = TigerInvocation.fromAstNode(expressionTree, scope);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "=":
            case "<>":
            case "<":
            case ">":
            case "<=":
            case ">=":
            case "&":
            case "|":
                expression = TigerOperation.fromAstNode(expressionTree, scope);
                break;
            default:
                throw new Exception("Unrecognized expression type: " + expressionTree.getText());
        }
        
        return expression;
    }
    
    public Float staticValue() {
        return null;
    }
}
import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerInvocation extends TigerExpression {
    private TigerFunction function;
    private List<TigerReference> parameters;
    
    public static TigerInvocation fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {        
        // verify the function exists
        // TODO: match the parameter count and parameter types
        // set the expression type to the return type of the function
        
        String functionName = expressionTree.getChild(0).getText();
        CommonTree paramTree = (CommonTree)expressionTree.getChild(1);
        
        TigerFunction function = scope.lookupSymbol(functionName, TigerFunction.class);
        TigerType returnType = function.getReturnType();
        
        TigerInvocation invocation = new TigerInvocation();
        invocation.function = function;
        invocation.type = returnType;
        
        return invocation;
    }
}
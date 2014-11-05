import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerOperation extends TigerExpression {
    private TigerExpression lhs;
    private TigerExpression rhs;
    
    public static TigerOperation fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerOperation operation = new TigerOperation();
        return operation;
    }
}
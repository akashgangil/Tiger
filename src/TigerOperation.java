import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerOperation extends TigerExpression {
    private TigerExpression lhs;
    private TigerExpression rhs;
    
    public static TigerOperation fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerOperation operation = new TigerOperation();
        
        operation.lhs = TigerExpression.fromAstNode((CommonTree)expressionTree.getChild(0), scope);
        operation.rhs = TigerExpression.fromAstNode((CommonTree)expressionTree.getChild(1), scope);
        
        // TODO lhs.type = rhs.type ==>> this.type
        
        return operation;
    }
}
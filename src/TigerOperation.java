import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerOperation extends TigerExpression {
    private String op;
    private TigerExpression lhs;
    private TigerExpression rhs;
    
    public static TigerOperation fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerOperation operation = new TigerOperation();
        
        TigerExpression lhs = TigerExpression.fromAstNode((CommonTree)expressionTree.getChild(0), scope);
        TigerExpression rhs = TigerExpression.fromAstNode((CommonTree)expressionTree.getChild(1), scope);
        
        if (lhs == null || rhs == null) {
            return null;
        } else if (lhs.type.isBaseType() && rhs.type.isBaseType()) {
            if (lhs.type == TigerType.FixedPt() || rhs.type == TigerType.FixedPt()) {
                operation.type = TigerType.FixedPt();
            } else {
                operation.type = TigerType.Int();
            }
        } else if (lhs.type != rhs.type){
            TigerSemanticError.typeMismatch((CommonTree)expressionTree.getChild(0), lhs.type, rhs.type);
            return null;
        } else {
            operation.type = lhs.type;
        }
        
        operation.op = expressionTree.getText();
        operation.lhs = lhs;
        operation.rhs = rhs;
        
        return operation;
    }
}
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
        
        if (lhs == null || rhs == null || lhs.type == null || rhs.type == null) {
            return null;
        } else if (lhs.type.isBaseType() && rhs.type.isBaseType()) {
            if (lhs.type == TigerType.FixedPt() || rhs.type == TigerType.FixedPt()) {
                operation.type = TigerType.FixedPt();
            } else {
                operation.type = TigerType.Int();
            }
        } else if (lhs.type != rhs.type){
            TigerSemanticError.typeMismatch((CommonTree)expressionTree.getChild(0), rhs.type, lhs.type);
            return null;
        } else {
            operation.type = lhs.type;
        }
        
        operation.op = expressionTree.getText();
        operation.lhs = lhs;
        operation.rhs = rhs;
        
        switch (operation.op) {
            case "=":
            case "<>":
            case "<":
            case ">":
            case "<=":
            case ">=":
                // convert to boolean type
                operation.type = TigerType.Boolean();
                break;
        }
        
        return operation;
    }
}
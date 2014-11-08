import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerWhile extends TigerStatement {
    private TigerExpression condition;
    private List<TigerStatement> statements;
    
    public static TigerWhile fromAstNode(CommonTree whileTree, TigerScope scope) throws Exception {        
        List<TigerStatement> statements = new LinkedList<TigerStatement>();
        
        CommonTree conditionTree = (CommonTree)whileTree.getChild(0);
        TigerExpression condition = TigerExpression.fromAstNode(conditionTree, scope);
        if (condition == null || !TigerSemanticError.assertTypesMatch(conditionTree, TigerType.Boolean(), condition.type)) {
            return null;
        }
        
        CommonTree statementstTree = (CommonTree)whileTree.getChild(1);
        if (statementstTree.getChildren() != null) {
            for (Object child : statementstTree.getChildren()) {
                CommonTree statementTree = (CommonTree)child;
                TigerStatement statement = TigerStatement.fromAstNode(statementTree, scope);
                statements.add(statement);
            }
        }
        
        TigerWhile whileStatement = new TigerWhile();
        whileStatement.condition = condition;
        whileStatement.statements = statements;
        
        return whileStatement;
    }
}
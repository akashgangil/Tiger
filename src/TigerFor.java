import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerFor extends TigerStatement {
    private TigerExpression rangeFrom;
    private TigerExpression rangeTo;
    private List<TigerStatement> statements;
    
    public static TigerFor fromAstNode(CommonTree forTree, TigerScope scope) throws Exception {        
        List<TigerStatement> statements = new LinkedList<TigerStatement>();
        
        TigerExpression from = TigerExpression.fromAstNode((CommonTree)forTree.getChild(0), scope);
        TigerExpression to = TigerExpression.fromAstNode((CommonTree)forTree.getChild(1), scope);

        // TODO: from.type == Int && to.type == Int
        
        CommonTree statementstTree = (CommonTree)forTree.getChild(2);
        if (statementstTree.getChildren() != null) {
            for (Object child : statementstTree.getChildren()) {
                CommonTree statementTree = (CommonTree)child;
                TigerStatement statement = TigerStatement.fromAstNode(statementTree, scope);
                statements.add(statement);
            }
        }
        
        TigerFor forStatement = new TigerFor();
        forStatement.statements = statements;
        forStatement.rangeFrom = from;
        forStatement.rangeTo = to;
        
        return forStatement;
    }
}
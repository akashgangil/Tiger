import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerWhile extends TigerStatement {
    private List<TigerStatement> statements;
    
    public static TigerWhile fromAstNode(CommonTree whileTree, TigerScope scope) throws Exception {        
        List<TigerStatement> statements = new LinkedList<TigerStatement>();
        
        CommonTree statementstTree = (CommonTree)whileTree.getChild(1);
        if (statementstTree.getChildren() != null) {
            for (Object child : statementstTree.getChildren()) {
                CommonTree statementTree = (CommonTree)child;
                TigerStatement statement = TigerStatement.fromAstNode(statementTree, scope);
                statements.add(statement);
            }
        }
        
        TigerWhile whileStatement = new TigerWhile();
        whileStatement.statements = statements;
        
        return whileStatement;
    }
}
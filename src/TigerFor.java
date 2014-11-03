import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerFor extends TigerStatement {
    private List<TigerStatement> statements;
    
    public static TigerFor fromAstNode(CommonTree forTree, TigerScope scope) throws Exception {        
        List<TigerStatement> statements = new LinkedList<TigerStatement>();
        
        // child 0 - range from
        // child 1 - range to
        // child 2 - statements
        
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
        
        return forStatement;
    }
}
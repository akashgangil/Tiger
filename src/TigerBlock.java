import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerBlock extends TigerStatement {
    private TigerScope scope;
    private List<TigerStatement> statements;
    
    public static TigerBlock fromAstNode(CommonTree blockTree, TigerScope parentScope) throws Exception {
        TigerScope scope = new TigerScope(parentScope);
        scope.label = "Scope : Block";
        
        List<TigerStatement> statements = new LinkedList<TigerStatement>();
        
        CommonTree typesTree = (CommonTree)blockTree.getChild(0);
        CommonTree varsTree = (CommonTree)blockTree.getChild(1);
        CommonTree statementsTree = (CommonTree)blockTree.getChild(2);
        
        if (typesTree.getChildren() != null) {
            for (Object child : typesTree.getChildren()) {
                TigerType type = TigerType.fromAstNode((CommonTree)child, scope);
                scope.defineSymbol(type);
            }
        }
        
        if (varsTree.getChildren() != null) {
            for (Object child : varsTree.getChildren()) {
                List<TigerVariable> vars = TigerVariable.fromAstNode((CommonTree)child, scope);
                for (TigerVariable var : vars) {
                    scope.defineSymbol(var);
                }
            }
        }
        
        if (statementsTree.getChildren() != null) {
            for (Object child : statementsTree.getChildren()) {
                TigerStatement statement = TigerStatement.fromAstNode((CommonTree)child, scope);
                statements.add(statement);
            }
        }
        
        TigerBlock block = new TigerBlock();
        block.scope = scope;
        block.statements = statements;
        
        parentScope.addChildScope(scope);
        
        return block;
    }
    
}
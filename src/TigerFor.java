import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerFor extends TigerStatement {
    private TigerScope scope;
    private TigerVariable rangeVariable;
    private TigerExpression rangeFrom;
    private TigerExpression rangeTo;
    private List<TigerStatement> statements;
    
    public static TigerFor fromAstNode(CommonTree forTree, TigerScope parentScope) throws Exception {        
        List<TigerStatement> statements = new LinkedList<TigerStatement>();
        
        String indexVariableName = TigerSemanticError.notReservedName((CommonTree)forTree.getChild(0));
        if (indexVariableName == null) {
            return null;
        }
        
        TigerVariable rangeVariable = new TigerVariable(indexVariableName, TigerType.Int());
        
        CommonTree fromTree = (CommonTree)forTree.getChild(1);
        CommonTree toTree = (CommonTree)forTree.getChild(2);
        
        TigerExpression from = TigerExpression.fromAstNode(fromTree, parentScope);
        TigerExpression to = TigerExpression.fromAstNode(toTree, parentScope);

        if (!TigerSemanticError.assertTypesMatch(fromTree, TigerType.Int(), from.type) 
        || !TigerSemanticError.assertTypesMatch(toTree, TigerType.Int(), to.type)) {
            return null;
        }

        TigerScope scope = new TigerScope(parentScope);
        scope.defineSymbol(rangeVariable);

        CommonTree statementstTree = (CommonTree)forTree.getChild(0);
        if (statementstTree.getChildren() != null) {
            for (Object child : statementstTree.getChildren()) {
                CommonTree statementTree = (CommonTree)child;
                TigerStatement statement = TigerStatement.fromAstNode(statementTree, scope);
                statements.add(statement);
            }
        }
        
        TigerFor forStatement = new TigerFor();
        forStatement.statements = statements;
        forStatement.scope = scope;
        forStatement.rangeVariable = rangeVariable;
        forStatement.rangeFrom = from;
        forStatement.rangeTo = to;
        
        return forStatement;
    }
}
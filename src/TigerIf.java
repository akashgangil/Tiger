import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerIf extends TigerStatement {
    private TigerExpression condition;
    private List<TigerStatement> ifTrueStatements;
    private List<TigerStatement> ifFalseStatements;
    
    public static TigerIf fromAstNode(CommonTree ifTree, TigerScope scope) throws Exception {        
        List<TigerStatement> ifTrueStatements = new LinkedList<TigerStatement>();
        List<TigerStatement> ifFalseStatements = new LinkedList<TigerStatement>();
        
        TigerExpression condition = TigerExpression.fromAstNode((CommonTree)ifTree.getChild(0), scope);
        // TODO: condition.type = boolean
        
        CommonTree ifTrueTree = (CommonTree)ifTree.getChild(1);
        if (ifTrueTree.getChildren() != null) {
            for (Object child : ifTrueTree.getChildren()) {
                CommonTree statementTree = (CommonTree)child;
                TigerStatement statement = TigerStatement.fromAstNode(statementTree, scope);
                ifTrueStatements.add(statement);
            }
        }
        
        CommonTree ifFalseTree = (CommonTree)ifTree.getChild(2);
        if (ifFalseTree.getChildren() != null) {
            for (Object child : ifFalseTree.getChildren()) {
                CommonTree statementTree = (CommonTree)child;
                TigerStatement block = TigerStatement.fromAstNode(statementTree, scope);
                ifFalseStatements.add(block);
            }
        }
        
        TigerIf ifStatement = new TigerIf();
        ifStatement.condition = condition;
        ifStatement.ifTrueStatements = ifTrueStatements;
        ifStatement.ifFalseStatements = ifFalseStatements;
        
        return ifStatement;
    }
}
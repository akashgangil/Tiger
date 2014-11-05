import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerAssign extends TigerStatement {
    private TigerReference lhs;
    private TigerExpression rhs;
    
    public static TigerAssign fromAstNode(CommonTree ifTree, TigerScope scope) throws Exception {        
        TigerAssign assignStatement = new TigerAssign();
        
        CommonTree lhsTree = (CommonTree)ifTree.getChild(0);
        TigerReference lhs = TigerReference.fromAstNode(lhsTree, scope);
        
        CommonTree rhsTree = (CommonTree)ifTree.getChild(1);
        TigerExpression rhs = TigerExpression.fromAstNode(rhsTree, scope);

        // TODO: verify lhs.type == rhs.type
        
        return assignStatement;
    }
}
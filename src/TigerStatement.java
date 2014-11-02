import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerStatement extends TigerAstNode {
    
    public static TigerStatement fromAstNode(CommonTree statementTree, TigerScope scope) throws Exception {
        TigerStatement statement = null;
        switch (statementTree.getText()) {
            case "BLOCK":
                statement = TigerBlock.fromAstNode(statementTree, scope);
                break;
            default:
            break;
        }
        
        return statement;
    }
    
}
import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerStatement extends TigerAstNode {
    
    public static TigerStatement fromAstNode(CommonTree statementTree, TigerScope scope) throws Exception {
        TigerStatement statement = null;
        switch (statementTree.getText()) {
            case "if":
            case "for":
            case "while":
            case ":=":
            case "INVOKE":
            case "break":
            case "return":
                break;
            case "BLOCK":
                statement = TigerBlock.fromAstNode(statementTree, scope);
                break;
            default:
                throw new Exception("Unrecognized statement type: " + statementTree.getText());
        }
        
        return statement;
    }
    
}
import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerStatement extends TigerAstNode {
    
    public static TigerStatement fromAstNode(CommonTree statementTree, TigerScope scope) throws Exception {
        TigerStatement statement = null;
        switch (statementTree.getText()) {
            case "if":
                statement = TigerIf.fromAstNode(statementTree, scope);
                break;
            case "for":
                statement = TigerFor.fromAstNode(statementTree, scope);
                break;
            case "while":
                statement = TigerWhile.fromAstNode(statementTree, scope);
                break;
            case ":=":
            case "INVOKE":
            case "break":
                statement = TigerBreak.fromAstNode(statementTree, scope);
                break;
            case "return":
                statement = TigerReturn.fromAstNode(statementTree, scope);
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
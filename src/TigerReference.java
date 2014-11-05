import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerReference extends TigerExpression {
    private TigerVariable var;
    private int width;
    private int height;
    
    public static TigerReference fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerReference reference = new TigerReference();
        return reference;
    }
}
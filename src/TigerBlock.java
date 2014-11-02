import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerBlock {
    private TigerScope scope;
    
    public static TigerBlock fromAstNode(CommonTree blockTree, TigerScope parentScope) throws Exception {
        TigerScope scope = new TigerScope(parentScope);
        scope.label = "Scope : Block";
        CommonTree typesTree = (CommonTree)blockTree.getChild(0);
        CommonTree varsTree = (CommonTree)blockTree.getChild(1);
        
        if (typesTree.getChildren() != null) {
            for (Object child : typesTree.getChildren()) {
                TigerType type = TigerType.fromAstNode((CommonTree)child, scope);
                scope.defineSymbol(type);
            }
        }
        
        if (varsTree.getChildren() != null) {
            for (Object child : varsTree.getChildren()) {
                //TigerFunction function = TigerVariable.fromAstNode((CommonTree)child, new TigerScope(globalScope));
                //globalScope.defineSymbol(function);
            }
        }
        
        TigerBlock block = new TigerBlock();
        block.scope = scope;
        
        return block;
    }
    
}
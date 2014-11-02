import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerProgram extends TigerAstNode {
    private TigerScope globalScope;
    
    public TigerProgram(CommonTree root) throws Exception {
        globalScope = new TigerScope();
        
        CommonTree typesTree = (CommonTree)root.getChild(0);
        CommonTree funcsTree = (CommonTree)root.getChild(1);
        
        for (Object child : typesTree.getChildren()) {
            TigerType type = new TigerType((CommonTree)child, globalScope);
            globalScope.defineSymbol(type);
        }
        
        for (Object child : funcsTree.getChildren()) {
            TigerFunction function = new TigerFunction((CommonTree)child, new TigerScope(globalScope, "function"));
            globalScope.defineSymbol(function);
        }
    }
    
    public TigerScope getGlobalScope() {
        return globalScope;
    }
}

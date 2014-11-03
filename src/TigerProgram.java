import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerProgram extends TigerAstNode {
    private TigerScope globalScope;
    
    public TigerProgram(CommonTree root) throws Exception {
        globalScope = new TigerScope();
        
        CommonTree typesTree = (CommonTree)root.getChild(0);
        CommonTree funcsTree = (CommonTree)root.getChild(1);
        
        if(typesTree != null && typesTree.getChildren() != null){
            for (Object child : typesTree.getChildren()) {
                TigerType type = TigerType.fromAstNode((CommonTree)child, globalScope);
                globalScope.defineSymbol(type);
            }
        }

        if(funcsTree != null && funcsTree.getChildren() != null){    
            for (Object child : funcsTree.getChildren()) {
                TigerFunction function = TigerFunction.fromAstNode((CommonTree)child, globalScope);
                globalScope.defineSymbol(function);
            }
        }
    }
    
    public TigerScope getGlobalScope() {
        return globalScope;
    }
}

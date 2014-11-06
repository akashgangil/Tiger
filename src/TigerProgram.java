import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerProgram extends TigerAstNode {
    private TigerScope globalScope;
    public static List<TigerIR> IRCode = new ArrayList<TigerIR>();
    public TigerProgram(CommonTree root) throws Exception {
        globalScope = new TigerScope();
        
        CommonTree typesTree = (CommonTree)root.getChild(0);
        CommonTree funcsTree = (CommonTree)root.getChild(1);
        
        if (typesTree != null && typesTree.getChildren() != null){
            for (Object child : typesTree.getChildren()) {
                TigerType type = TigerType.fromAstNode((CommonTree)child, globalScope);
                globalScope.defineSymbol(type);
            }
        }

        if (funcsTree != null && funcsTree.getChildren() != null){    
            for (Object child : funcsTree.getChildren()) {
                TigerUserFunction function = TigerUserFunction.prototypeFromAstNode((CommonTree)child, globalScope);
                globalScope.defineSymbol(function);
            }
        }
        
        if (funcsTree != null && funcsTree.getChildren() != null){    
            for (Object child : funcsTree.getChildren()) {
                CommonTree functionTree = (CommonTree)child;
                String functionName = functionTree.getChild(1).getText();
                TigerUserFunction function = globalScope.lookupSymbol(functionName, TigerUserFunction.class);
                function.setDefinition(functionTree, globalScope);
                IRCode.add(function.getIR());
            }
        }
    }
    
    public TigerScope getGlobalScope() {
        return globalScope;
    }
}

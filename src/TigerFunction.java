import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerFunction extends TigerSymbol {
    private TigerScope scope;
    private TigerType returnType;
    private List<TigerType> parameterTypes;
    private List<TigerBlock> blocks;
    
    public static TigerFunction fromAstNode(CommonTree functionNode, TigerScope parentScope) throws Exception {
        String functionName = functionNode.getChild(1).getText();        
        if( !functionName.equals("main") && TigerSymbol.reservedSymbolNames.contains(functionName)){
            System.out.println("Error Reserved keyword for function name");
        }
        
        List<TigerType> parameterTypes = new LinkedList<TigerType>();
        TigerType returnType = null;
        TigerScope scope = new TigerScope(parentScope);
        List<TigerBlock> blocks = new LinkedList<TigerBlock>();
        
        String returnTypeName = functionNode.getChild(0).getText();
        if (!returnTypeName.equals("void")) {
            returnType = scope.lookupSymbol(returnTypeName, TigerType.class);
        }
        
        CommonTree treeParams = (CommonTree)functionNode.getChild(2);
        if (treeParams.getChildren() != null) {
            for (Object child : treeParams.getChildren()) {
                CommonTree paramTree = (CommonTree)child;
                String paramName = paramTree.getChild(0).getText();
                String paramTypeName = paramTree.getChild(1).getText();
                TigerType paramType = scope.lookupSymbol(paramTypeName, TigerType.class);
                TigerVariable param = new TigerVariable(paramName, paramType);
                
                scope.defineSymbol(param);
                parameterTypes.add(paramType);
            }
        }
        
        CommonTree treeBlocks = (CommonTree)functionNode.getChild(3);
        if (treeBlocks.getChildren() != null) {
            for (Object child : treeBlocks.getChildren()) {
                CommonTree blockTree = (CommonTree)child;
                TigerBlock block = TigerBlock.fromAstNode(blockTree, scope);
                blocks.add(block);
            }
        }
        
        scope.label = "Scope : " + functionName;
        
        TigerFunction function = new TigerFunction();
        function.name = functionName;
        function.returnType = returnType;
        function.parameterTypes = parameterTypes;
        function.scope = scope;
        function.blocks = blocks;
        
        return function;
    }
    
    public TigerType getReturnType() {
        return returnType;
    }
    
    public List<TigerType> getParameterTypes() {
        return parameterTypes;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name + " : " + "TigerFunction<(");
        for (int idx = 0; idx < parameterTypes.size(); idx += 1) {
            TigerType type = parameterTypes.get(idx);
            str.append(type);
            if (idx != (parameterTypes.size() - 1)) {
                str.append(", ");
            }
        }
        if (returnType == null) {
            str.append(") -> (void)>");
        } else {
            str.append(") -> ("+ returnType + ")>");
        }
        
        return str.toString();
    }
}

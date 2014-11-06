import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerUserFunction extends TigerFunction {
    private TigerScope scope;
    private TigerType returnType;
    private List<TigerType> parameterTypes;
    private List<TigerBlock> blocks;
    private List<String> parameterNames; 

    public static TigerUserFunction prototypeFromAstNode(CommonTree functionNode, TigerScope parentScope) throws Exception {
        

        String functionName = functionNode.getChild(1).getText();        

        if( !functionName.equals(TigerOps.MAIN) && TigerSymbol.reservedSymbolNames.contains(functionName)){
            TigerSemanticError.globalList.add(new TigerReservedSymbolError(((CommonTree)functionNode).getLine(), functionName)); 
        }
        
        List<TigerType> parameterTypes = new LinkedList<TigerType>();
        List<String> parameterNames = new LinkedList<String>();
        TigerType returnType = null;
        TigerScope scope = new TigerScope(parentScope);

        String returnTypeName = functionNode.getChild(0).getText();
        if (!returnTypeName.equals(TigerOps.VOID)) {
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
                parameterNames.add(paramName);
                parameterTypes.add(paramType);
            }
        }
        
        scope.label = "Scope : " + functionName;
        
        TigerUserFunction function = new TigerUserFunction();
        function.name = functionName;
        function.returnType = returnType;
        function.parameterTypes = parameterTypes;
        function.scope = scope;
        function.parameterNames = parameterNames;
        return function;
    }
    
    public void setDefinition(CommonTree functionNode, TigerScope parentScope) throws Exception {
        List<TigerBlock> blocks = new LinkedList<TigerBlock>();
        
        CommonTree treeBlocks = (CommonTree)functionNode.getChild(3);
        if (treeBlocks.getChildren() != null) {
            for (Object child : treeBlocks.getChildren()) {
                CommonTree blockTree = (CommonTree)child;
                TigerBlock block = TigerBlock.fromAstNode(blockTree, scope);
                blocks.add(block);
            }
        }
        
        this.blocks = blocks;
    }
    
    public String getIR(CommonTree functionNode){
        IRGenerator irGen = new IRGenerator();
        String ir = irGen.generateFunc(functionNode);
        return ir;
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

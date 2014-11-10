import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerUserFunction extends TigerFunction {
    private TigerScope scope;
    private List<TigerBlock> blocks;
    private List<String> parameterNames;
    private boolean hasReturned;

    public static TigerUserFunction prototypeFromAstNode(CommonTree functionNode, TigerScope parentScope) throws Exception {
        String functionName = TigerSemanticError.notReservedFunctionName((CommonTree)functionNode.getChild(1));
        if (functionName == null) {
            return null;
        }

        List<TigerType> parameterTypes = new LinkedList<TigerType>();
        List<String> parameterNames = new LinkedList<String>();
        TigerType returnType = null;
        TigerScope scope = new TigerScope(parentScope);

        String returnTypeName = functionNode.getChild(0).getText();
        if (!returnTypeName.equals(TigerOps.VOID)) {
            returnType = TigerSemanticError.type((CommonTree)functionNode.getChild(0), scope);
            if (returnType == null) {
                return null;
            }
        }

        CommonTree treeParams = (CommonTree)functionNode.getChild(2);
        if (treeParams.getChildren() != null) {
            for (Object child : treeParams.getChildren()) {
                CommonTree paramTree = (CommonTree)child;

                String name = paramTree.getChild(0).getText();
                TigerType type = TigerSemanticError.type((CommonTree)paramTree.getChild(1), scope);
                if (type == null) {
                    return null;
                }

                TigerVariable param = new TigerVariable(name, type, true);

                scope.defineSymbol(param);

                parameterNames.add(name);
                parameterTypes.add(type);
            }
        }

        scope.label = "Scope : " + functionName;

        TigerUserFunction function = new TigerUserFunction();
        function.name = functionName;
        function.returnType = returnType;
        function.parameterTypes = parameterTypes;
        function.scope = scope;
        function.parameterNames = parameterNames;

        scope.setFunction(function);
        parentScope.addChildScope(scope);

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

        if (returnType != null && !hasReturned) {
            TigerSemanticError.returnExpected(functionNode);
        }

        this.blocks = blocks;
    }

    public void setHasReturned() {
        hasReturned = true;
    }

}

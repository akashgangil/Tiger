import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerFunction extends TigerSymbol {
    private TigerScope scope;
    private TigerType returnType;
    private List<TigerType> parameterTypes;
    private List<TigerBlock> blocks;
    
    public TigerFunction(String name, TigerType returnType, List<TigerType> parameterTypes) {
        super(name);
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
    }
    
    public TigerFunction(CommonTree functionNode, TigerScope scope) throws Exception {
        super(functionNode.getChild(1).getText());
        this.scope = scope;
        parameterTypes = new LinkedList<TigerType>();
        blocks = new LinkedList<TigerBlock>();
        
        String returnTypeName = functionNode.getChild(0).getText();
        if (!returnTypeName.equals("void")) {
            returnType = scope.lookupSymbol(returnTypeName, TigerType.class);
        }
        
        CommonTree treeParams = (CommonTree)functionNode.getChild(2);
        if (treeParams.getChildren() != null) {
            for (Object child : treeParams.getChildren()) {
                CommonTree paramTree = (CommonTree)child;
                String name = paramTree.getChild(0).getText();
                String typeName = paramTree.getChild(1).getText();
                TigerType type = scope.lookupSymbol(typeName, TigerType.class);
                TigerVariable param = new TigerVariable(name, type);
                
                scope.defineSymbol(param);
                parameterTypes.add(type);
            }
        }
        
        CommonTree treeBlocks = (CommonTree)functionNode.getChild(3);
        if (treeBlocks.getChildren() != null) {
            for (Object child : treeBlocks.getChildren()) {
                CommonTree blockTree = (CommonTree)child;
                TigerBlock block = new TigerBlock(blockTree, new TigerScope(scope, "block"));
                blocks.add(block);
            }
        }
    }
    
    public TigerType getReturnType() {
        return returnType;
    }
    
    public List<TigerType> getParameterTypes() {
        return parameterTypes;
    }
    
    public String toString() {
        return name + " : " + "TigerFunction<" + "()" + " -> "+ returnType + ">";
    }
}
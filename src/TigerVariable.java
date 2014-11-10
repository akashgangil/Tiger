import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerVariable extends TigerSymbol {
    private TigerType type;
    private boolean initialized;
    
    public static List<TigerVariable> fromAstNode(CommonTree variableNode, TigerScope scope) throws Exception {
        List<String> ids = new LinkedList<String>();
        
        CommonTree idsNode = (CommonTree)variableNode.getChild(0);
        if (idsNode != null) {
            for (Object idNode : idsNode.getChildren()) {
                String idName = TigerSemanticError.notReservedName((CommonTree)idNode);
                if (idName == null) {
                    continue;
                }
                
                ids.add(idName);
            }
        }
        
        if (ids.isEmpty()) {
            TigerSemanticError.idExpected(idsNode);
            return null;
        }

        TigerType type = TigerSemanticError.type((CommonTree)variableNode.getChild(1), scope);
        if (type == null) {
            return null;
        }
        
        boolean initialized = false;
        CommonTree initTree = (CommonTree)variableNode.getChild(2);
        if (initTree != null) {
            TigerConstant init = TigerConstant.fromAstNode(initTree, scope);
            // one place casting is allowed ...
            if (!type.isBaseType() && !TigerSemanticError.assertTypesMatch(initTree, type.getBaseType(), init.type)) {
                return null;
            } else if (type.isBaseType() && !TigerSemanticError.assertTypesMatch(initTree, type, init.type)) {
                return null;
            }
            
            initialized = true;
        }
        
        List<TigerVariable> variables = new LinkedList<TigerVariable>();
        for (String id : ids) {
            variables.add(new TigerVariable(id, type, initialized));
        }
        
        return variables;
    }
    
    public TigerVariable(String name, TigerType type, boolean initialized) {
        this.name = name;
        this.type = type;
        this.initialized = initialized;
    }
    
    public TigerType getType() {
        return type;
    }
    
    public boolean initialized() {
        return initialized;
    }
    
    public void ignoreInitialized() {
        initialized = true;
    }
    
    public String toString() {
        return name + " : " + "TigerVariable<" + type + ">";
    }
}

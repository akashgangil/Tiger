import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerVariable extends TigerSymbol {
    private TigerType type;
    
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
        
        List<TigerVariable> variables = new LinkedList<TigerVariable>();
        for (String id : ids) {
            variables.add(new TigerVariable(id, type));
        }
        
        return variables;
    }
    
    public TigerVariable(String name, TigerType type) {
        this.name = name;
        this.type = type;
    }
    
    public TigerType getType() {
        return type;
    }
    
    public String toString() {
        return name + " : " + "TigerVariable<" + type + ">";
    }
}

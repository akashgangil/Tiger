import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerVariable extends TigerSymbol {
    private TigerType type;
    
    public static List<TigerVariable> fromAstNode(CommonTree variableNode, TigerScope scope) throws Exception {
        List<String> ids = new LinkedList<String>();
        CommonTree idsNode = (CommonTree)variableNode.getChild(0);
        for (Object idNode : idsNode.getChildren()) {
            ids.add(((CommonTree)idNode).getText());
        }
        
        String typeName = variableNode.getChild(1).getText();
        TigerType type = scope.lookupSymbol(typeName, TigerType.class);
        
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
    
    public String toString() {
        return name + " : " + "TigerVariable<" + type + ">";
    }
}
import java.util.*;

public class TigerFunction extends TigerSymbol {
    protected TigerType returnType;
    protected List<TigerType> parameterTypes;

    public TigerType getReturnType() {
        return returnType;
    }

    public List<TigerType> getParameterTypes() {
        return parameterTypes;
    }
    

    protected String label() {
        return "TigerFunction";
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name + " : " + label() + "<(");
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

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
}

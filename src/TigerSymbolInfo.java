import java.util.*;

public class TigerSymbolInfo{

    public enum ASTTokens {VAR, FUNCTION, TYPE}

    private String value;
    private ASTTokens type;
    private String declaringProc;
    private List<TigerSymbolInfo> next;

    public TigerSymbolInfo(ASTTokens type, String declaringProc){
        this.type = type;
        this.declaringProc = declaringProc;
        this.next = Collections.emptyList();
    }

    public String toString(){
        return "[Type: " +
            type + "], [DP: " +
            declaringProc + "], Chain: " +
            next + "], ";
    }

    //We will chain if we can same names
    public void chainSymbol(TigerSymbolInfo chainElement){
        next.add(chainElement);
    }

    public void setValue(String value){
        this.value = value;
    }
}


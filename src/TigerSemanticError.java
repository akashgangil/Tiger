import java.util.List;
import java.util.ArrayList;

public class TigerSemanticError{
    String errorMsg;
    String faultyToken;
    int lineNumber;

    public static List<TigerSemanticError> globalList = new ArrayList<TigerSemanticError>();    
    
    public TigerSemanticError(String errorMsg, String faultyToken, int lineNumber){
        this.errorMsg = errorMsg;
        this.lineNumber = lineNumber;
        this.faultyToken = faultyToken;
    }    

    public String toString(){
            return "Semantic Error: " + errorMsg + " at Line: " + lineNumber + " due to Token: " + faultyToken + "\n";
    }
    
    public static String getAll(){
        String errorMsg = "";
        for(TigerSemanticError e: globalList){
            errorMsg += e.toString();
        }
        return errorMsg;
    }

}

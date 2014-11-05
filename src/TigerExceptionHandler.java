import java.util.List;
import java.util.Collections;

public class TigerExceptionHandler{
    String errorMsg;
    String faultyToken;
    int lineNumber;

    public static List<TigerExceptionHandler> exceptionList = Collections.emptyList();    
    
    public void TigerExceptionHandler(String errorMsg, String faultyToken, int lineNumber){
        this.errorMsg = errorMsg;
        this.lineNumber = lineNumber;
        this.faultyToken = faultyToken;
    }    

    public String toString(){
            return "Semantic Error: at Line: " + lineNumber + " Error Type: " + errorMsg + " due to " + faultyToken;
    }
}

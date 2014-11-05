public class TigerReservedSymbolError extends TigerSemanticError{
    private static String errorMsg = "Error using a reserved grammar symbol";

    public TigerReservedSymbolError(int lineNumber, String faultyToken){ 
        super(errorMsg, faultyToken, lineNumber);
    }
}

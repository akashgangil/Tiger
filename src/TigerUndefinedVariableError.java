public class TigerUndefinedVariableError extends TigerSemanticError{
    private static String errorMsg = "Error as the variable is UNDEFINED";
    private String kind;

    public TigerUndefinedVariableError(int lineNumber, String faultyToken, String kind){
        super(errorMsg, faultyToken, lineNumber);
        this.kind = kind;
    }

    public String toString(){
        return super.toString() + " " + kind;
    }
}

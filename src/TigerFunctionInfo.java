import java.util.*;

public class TigerFunctionInfo extends TigerSymbolInfo{
    private String returnType;
    private int numArgs;
    private List<TigerArg> argList;

    public TigerFunctionInfo(String returnType, int numArgs,
            List<TigerArg> argList){
        super(ASTTokens.FUNCTION, TigerUtil.CURRENT_PROC_NAME);
        setReturnType(returnType);
        setNumArgs(numArgs);
        setArgList(argList);
    }

    private void setReturnType(String returnType){
        this.returnType = returnType;
    }

    private void setNumArgs(int numArgs){
        this.numArgs = numArgs;
    }

    private void setArgList(List<TigerArg> argList){
        this.argList = argList;
    }

    public String toString(){
        return super.toString() + " [RT: " +
            returnType + " ], [NumArgs: " +
            numArgs + " ], [ArgList: " +
            argList + " ]";
    }
}


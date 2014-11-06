import java.util.*;

public class TigerFunctionIR extends TigerIR{
    private String callCode;
    private String functionName;
    private List<String> parameters = new ArrayList<String>();

    public void setCallCode(String callCode){
        this.callCode = callCode;
    }

    public void setFunctionName(String fName){
        this.functionName = fName;
    }

    public void addParameter(String param){
        this.parameters.add(param);
    }

    public String parameterIR(){
        String res = "";
        if(parameters.isEmpty());
        else{
            for(String s: parameters){
                res += ", " + s;
            }
        }

        return res;
    }

    public String toString(){
        return callCode + ", " + functionName + parameterIR();
    }
}

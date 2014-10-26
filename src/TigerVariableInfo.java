public class TigerVariableInfo extends TigerSymbolInfo{
    private String dataType;
    private int value; //since we have only int and fixedpt as possible datatypes

    public TigerVariableInfo(String dataType, int value){
        super(ASTTokens.VAR, TigerUtil.CURRENT_PROC_NAME);
        setValue(value);
        setDataType(dataType);
    }

    private void setValue(int value){
        this.value = value;
    }

    private void setDataType(String dataType){
        this.dataType = dataType;
    }

    public String toString(){
        return super.toString() + " [DataType: " +
            dataType + "], [Value: " +
            value;
    }
}


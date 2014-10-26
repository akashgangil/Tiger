

public class TigerDataTypeInfo extends TigerSymbolInfo{
    private boolean isAggregate;
    private String baseDataType;
    private int dim1;
    private int dim2;

    public TigerDataTypeInfo(boolean isAggregate, String baseDataType, int dim1, int dim2){
        super(ASTTokens.TYPE, TigerUtil.CURRENT_PROC_NAME);
        setIsAggregate(isAggregate);
        setBaseDataType(baseDataType);
        setDimension1(dim1);
        setDimension2(dim2);
    }

    private void setIsAggregate(boolean isAggregate){
        this.isAggregate = isAggregate;
    }

    private void setBaseDataType(String baseDataType){
        this.baseDataType = baseDataType;
    }

    private void setDimension1(int dim1){
        this.dim1 = dim1;
    }

    private void setDimension2(int dim2){
        this.dim2 = dim2;
    }

    public String toString(){
        return super.toString() + " [isAggregate: " + isAggregate
            + " ], [baseDataType: " + baseDataType + " ], [Dim1: " +
            dim1 + " ], [Dim2: " + dim2 + "] ";
    }
}


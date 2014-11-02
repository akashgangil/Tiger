public class TigerBaseType extends TigerSymbol {
    private static TigerBaseType Int;
    private static TigerBaseType FixedPt;

    static {
        TigerBaseType.Int = new TigerBaseType("int");
        TigerBaseType.FixedPt = new TigerBaseType("fixedpt");
    }
    
    private TigerBaseType(String name) {
        super(name);
    }

    public static TigerBaseType Int() {
        return Int;
    }
    
    public static TigerBaseType FixedPt() {
        return FixedPt;
    }
    
    public String toString() {
        return "TigerBaseType : " + name;
    }
}
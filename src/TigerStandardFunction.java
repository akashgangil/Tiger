public class TigerStandardFunction extends TigerFunction {
    public static TigerStandardFunction print;
    public static TigerStandardFunction printi;
    public static TigerStandardFunction flush;
    public static TigerStandardFunction getchar;
    public static TigerStandardFunction ord;
    public static TigerStandardFunction chr;
    public static TigerStandardFunction size;
    public static TigerStandardFunction substring;
    public static TigerStandardFunction concat;
    public static TigerStandardFunction not;
    public static TigerStandardFunction exit;
    
    static {
        print = new TigerStandardFunction("print");
        printi = new TigerStandardFunction("printi");
        flush = new TigerStandardFunction("flush");
        getchar = new TigerStandardFunction("getchar");
        ord = new TigerStandardFunction("ord");
        chr = new TigerStandardFunction("chr");
        size = new TigerStandardFunction("size");
        substring = new TigerStandardFunction("substring");
        concat = new TigerStandardFunction("concat");
        not = new TigerStandardFunction("not");
        exit = new TigerStandardFunction("exit");
    }

    private TigerStandardFunction(String name) {
        this.name = name;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name + " : " + "TigerStandardFunction<(");
        str.append(") -> ()>");
        
        return str.toString();
    }
}
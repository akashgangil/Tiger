import java.util.Arrays;
import java.util.LinkedList;

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
        printi = new TigerStandardFunction("printi", null, TigerType.Int);
        flush = new TigerStandardFunction("flush");
        getchar = new TigerStandardFunction("getchar");
        ord = new TigerStandardFunction("ord", TigerType.Int);
        chr = new TigerStandardFunction("chr", null, TigerType.Int);
        size = new TigerStandardFunction("size", TigerType.Int);
        substring = new TigerStandardFunction("substring");
        concat = new TigerStandardFunction("concat");
        not = new TigerStandardFunction("not", TigerType.Int, TigerType.Int);
        exit = new TigerStandardFunction("exit", null, TigerType.Int);
    }

    private TigerStandardFunction(String name) {
        this(name, null);
    }

    private TigerStandardFunction(String name, TigerType returnType) {
        this(name, returnType, (TigerType[])null);
    }

    private TigerStandardFunction(String name, TigerType returnType, TigerType... parameterTypes) {
        this.name = name;
        this.returnType = returnType;
        if (parameterTypes != null) {
            this.parameterTypes = Arrays.asList(parameterTypes);
        } else {
            this.parameterTypes = new LinkedList<TigerType>();
        }
    }

    protected String label() {
        return "TigerStandardFunction";
    }
}

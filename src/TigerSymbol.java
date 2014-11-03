import java.util.List;
import java.util.Arrays;

public class TigerSymbol extends TigerAstNode {
    protected String name;
    
    protected TigerSymbol() {
    }
    
    public String getName() {
        return name;
    }

    public static List<String> reservedSymbolNames = Arrays.asList(
        "print", "printi", "flush", "getchar", "ord", "chr", "size", "substring", "concat", "not", "exit",
        "function", "begin", "end", "void", "main", "type", "array", "of", "int", "fixedpt", "var", "if",
        "then", "endif", "else", "while", "do", "enddo", "for", "id", "to", "do", "break", "return"
    );
}


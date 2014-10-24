import java.util.*;

public class TigerScope {
    private TigerScope parentScope;
    private HashMap<String, TigerSymbol> symbols;

    public TigerScope() {
        this(null);
    }

    public TigerScope(TigerScope parentScope) {
        this.parentScope = parentScope;
        symbols = new HashMap<String, TigerSymbol>();
    }

    public boolean defineSymbol(TigerSymbol symbol) {
        String symbolName = symbol.getName();
        TigerSymbol existing = symbols.get(symbolName);
        if (existing != null) {
            return false;
        }
        symbols.put(symbolName, symbol); 
        return true;
    }

    public TigerSymbol lookupSymbol(String name) {
        TigerSymbol symbol = symbols.get(name);
        if (name == null && parentScope != null) {
            symbol = parentScope.lookupSymbol(name);
        }
        return symbol;
    }
}

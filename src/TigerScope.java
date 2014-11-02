import java.util.*;

public class TigerScope {
    private String context;
    private TigerScope parentScope;
    private List<TigerScope> childScopes;
    private HashMap<String, TigerSymbol> symbols;

    public TigerScope() {
        this(null, "Global");
    }

    public TigerScope(TigerScope parentScope, String context) {
        this.context = context;
        this.parentScope = parentScope;
        childScopes = new LinkedList<TigerScope>();
        symbols = new HashMap<String, TigerSymbol>();
        
        if (parentScope != null) {
            parentScope.addChildScope(this);
        }
    }

    private void addChildScope(TigerScope childScope) {
        childScopes.add(childScope);
    }
    
    public boolean defineSymbol(TigerSymbol symbol) {
        String symbolName = symbol.getName();
        TigerSymbol existing = lookupSymbol(symbolName);
        if (existing != null) {
            return false;
        }
        symbols.put(symbolName, symbol); 
        return true;
    }

    @SuppressWarnings("unchecked")
    public <T extends TigerSymbol> T lookupSymbol(String name, Class<T> kind) throws Exception {
        TigerSymbol symbol = lookupSymbol(name);
        if (symbol == null) {
            throw new Exception(kind.getName() + "undefined: " + name);
        } else if (!kind.isAssignableFrom(symbol.getClass())) {
            throw new Exception(kind.getName() + "required. found: " + symbol);
        }
        return (T)symbol;
    }

    public TigerSymbol lookupSymbol(String name) {
        if (name.equals("int")) {
            return TigerBaseType.Int();
        } else if (name.equals("fixedpt")) {
            return TigerBaseType.FixedPt();
        }
        TigerSymbol symbol = symbols.get(name);
        if (name == null && parentScope != null) {
            symbol = parentScope.lookupSymbol(name);
        }
        return symbol;
    }
    
    public String toString(int level) {
        StringBuilder str = new StringBuilder();
        StringBuilder indent = new StringBuilder();
        for (int l = 0; l < level; l += 1) {
            indent.append("\t");
        }
        
        str.append(indent + context + " {");
        for (Map.Entry<String, TigerSymbol> entry : symbols.entrySet()) {
            str.append(indent + entry.getKey() + "\t" + entry.getValue() + "\n");
        }
        for (TigerScope childScope : childScopes) {
            str.append(childScope.toString(level + 1));
        }
        str.append(indent + "}");
        
        return str.toString();
    }
    
    public String toString() {
        return toString(0);
    }
}

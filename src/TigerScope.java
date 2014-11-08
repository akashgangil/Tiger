import java.util.*;

public class TigerScope {
    public String label;
    private TigerScope parentScope;
    public List<TigerScope> childScopes;
    private HashMap<String, TigerSymbol> symbols;

    public TigerScope() {
        this(null);
    }

    public TigerScope(TigerScope parentScope) {
        label = "Scope";
        this.parentScope = parentScope;
        childScopes = new LinkedList<TigerScope>();
        symbols = new HashMap<String, TigerSymbol>();
        
        if (parentScope == null) {
            // define global built ins
            defineSymbol(TigerType.Int());
            defineSymbol(TigerType.FixedPt());
            defineSymbol(TigerStandardFunction.print);
            defineSymbol(TigerStandardFunction.printi);
            defineSymbol(TigerStandardFunction.flush);
            defineSymbol(TigerStandardFunction.getchar);
            defineSymbol(TigerStandardFunction.ord);
            defineSymbol(TigerStandardFunction.chr);
            defineSymbol(TigerStandardFunction.size);
            defineSymbol(TigerStandardFunction.substring);
            defineSymbol(TigerStandardFunction.concat);
            defineSymbol(TigerStandardFunction.not);
            defineSymbol(TigerStandardFunction.exit);
        }
    }

    public void addChildScope(TigerScope childScope) {
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

    public TigerSymbol lookupSymbol(String name) {
        TigerSymbol symbol = symbols.get(name);
        if (symbol == null && parentScope != null) {
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
        
        str.append(indent + label + " {\n");
        for (Map.Entry<String, TigerSymbol> entry : symbols.entrySet()) {
            str.append(indent + "\t" + entry.getValue() + "\n");
        }
        for (TigerScope childScope : childScopes) {
            str.append(childScope.toString(level + 1));
        }
        str.append(indent + "}\n");
        
        return str.toString();
    }
    
    public String toString() {
        return toString(0);
    }
}

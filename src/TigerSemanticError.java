import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.antlr.runtime.tree.*;

public class TigerSemanticError {
    private static List<TigerSemanticError> errors = new ArrayList<TigerSemanticError>();
    private static String[] source;
    public static List<String> reservedNames = Arrays.asList(
        "print", "printi", "flush", "getchar", "ord", "chr", "size", "substring", "concat", "not", "exit",
        "function", "begin", "end", "void", "main", "type", "array", "of", "int", "fixedpt", "var", "if",
        "then", "endif", "else", "while", "do", "enddo", "for", "id", "to", "do", "break", "return"
    );
    
    private CommonTree origin;
    private String message;
    private int line;
    private int character;
    
    public static void setSource(String[] source) {
        TigerSemanticError.source = source;
    }
    
    public static List<TigerSemanticError> getErrors() {
        // Do not modify the error list directly
        return Collections.unmodifiableList(errors);
    }

    public static TigerFunction function(CommonTree origin, TigerScope scope) {
        TigerSymbol symbol = scope.lookupSymbol(origin.getText());
        if (verifySymbol(origin, symbol, TigerFunction.class)) {
            return (TigerFunction)symbol;
        } else {
            return null;
        }
    }

    public static TigerVariable variable(CommonTree origin, TigerScope scope) {
        TigerSymbol symbol = scope.lookupSymbol(origin.getText());
        if (verifySymbol(origin, symbol, TigerVariable.class)) {
            return (TigerVariable)symbol;
        } else {
            return null;
        }
    }

    public static TigerType type(CommonTree origin, TigerScope scope) {
        TigerSymbol symbol = scope.lookupSymbol(origin.getText());
        if (verifySymbol(origin, symbol, TigerType.class)) {
            return (TigerType)symbol;
        } else {
            return null;
        }
    }

    public static boolean assertTypesMatch(CommonTree origin, TigerType expected, TigerType found) {
        if (expected == found) {
            return true;
        } else if (expected == TigerType.FixedPt() && found == TigerType.Int()) {
            return true;
        } else {
            typeMismatch(origin, expected, found);
            return false;
        }
    }

    public static <T extends TigerSymbol> boolean verifySymbol(CommonTree origin, TigerSymbol symbol, Class<T> type) {
        if (symbol == null) {
            undefinedSymbol(origin);
            return false;
        } else if (!type.isAssignableFrom(symbol.getClass())) {
            errors.add(new TigerSemanticError(origin, "\n\tExpected " + type + "\n\tfound " + symbol.getClass()));
            return false;
        } else {
            return true;
        }
    }
    
    public static String notReservedName(CommonTree origin) {
        String name = origin.getText();
        if (reservedNames.contains(name)) {
            reservedSymbol(origin);
            return null;
        } else {
            return name;
        }
    }
    
    public static String notReservedFunctionName(CommonTree origin) {
        String name = origin.getText();
        if (!name.equals(TigerOps.MAIN) && reservedNames.contains(name)) {
            reservedSymbol(origin);
            return null;
        } else {
            return name;
        }
    }
    
    private static void undefinedSymbol(CommonTree origin) {
        errors.add(new TigerSemanticError(origin, "Undefined symbol: " + origin.getText()));
    }
    
    public static void typeMismatch(CommonTree origin, TigerType expected, TigerType found) {
        if (found == null) {
            errors.add(new TigerSemanticError(origin, "\n\tExpected: " + expected + "\n\tFound: void"));
        } else { 
            errors.add(new TigerSemanticError(origin, "\n\tExpected: " + expected + "\n\tFound: " + found));
        }
    }
    
    private static void reservedSymbol(CommonTree origin) {
        errors.add(new TigerSemanticError(origin, "Reserved symbol: " + origin.getText()));
    }
    
    public static void idExpected(CommonTree origin) {
        errors.add(new TigerSemanticError(origin, "id expected."));
    }
    
    public static void typeExpected(CommonTree origin) {
        errors.add(new TigerSemanticError(origin, "\n\tExpected: type\n\tFound: void"));
    }
    
    public static void baseTypeRequired(CommonTree origin) {
        errors.add(new TigerSemanticError(origin, "Base type expected."));
    }
    
    private TigerSemanticError(CommonTree origin, String message) {
        this.origin = origin;
        this.message = message;
        
        line = origin.getLine();
        character = origin.getCharPositionInLine() + 1; // always seems to be 1 off???
    }

    public String toString(){
        StringBuilder str = new StringBuilder("line: " + line + ":" + character + ": error: " + message);
        if (source != null) {
            str.append("\n");
            String sourceLine = source[line - 1];
            sourceLine = sourceLine.replaceAll("\\s", " ");
            str.append(sourceLine + "\n");
            for (int i = 0; i < character - 1; i += 1) {
                str.append(" ");
            }
            str.append("^\n");
        }
        return str.toString();
    }
}

import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerProgram extends TigerAstNode {
    private TigerScope globalScope;
    
    public TigerProgram(CommonTree root) {
        globalScope = new TigerScope();
        
        // Types
        // Funcs
    }
    
    public TigerScope getGlobalScope() {
        return globalScope;
    }
}
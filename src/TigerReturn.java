import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerReturn extends TigerStatement {
    public static TigerReturn fromAstNode(CommonTree returnTree, TigerScope scope) throws Exception {        
        return new TigerReturn();
    }
}
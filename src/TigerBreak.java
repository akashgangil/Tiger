import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerBreak extends TigerStatement {
    public static TigerBreak fromAstNode(CommonTree breakTree, TigerScope scope) throws Exception {        
        return new TigerBreak();
    }
}
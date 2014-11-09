import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerConstant extends TigerExpression {
    public static TigerConstant fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerConstant constant = new TigerConstant();
        
        String stringValue = expressionTree.getChild(0).getText();
        float value = Float.parseFloat(stringValue);
        
        if (!stringValue.contains(".")) {
            constant.type = TigerType.Int();
        } else {
            constant.type = TigerType.FixedPt();
        }
        
        return constant;
    }
}
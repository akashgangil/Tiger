import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerConstant extends TigerExpression {
    public static TigerConstant fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerConstant constant = new TigerConstant();
        
        String stringValue = expressionTree.getText();  
        if (stringValue.equals("CONSTANT")) {
            stringValue = expressionTree.getChild(0).getText();  
        }
        
        if (!stringValue.contains(".")) {
            constant.type = TigerType.Int();
        } else {
            constant.type = TigerType.FixedPt();
        }
        
        return constant;
    }
}
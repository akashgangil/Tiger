import java.util.*;
import org.antlr.runtime.tree.*;

public class TigerConstant extends TigerExpression {
    private Float value;
    
    public static TigerConstant fromAstNode(CommonTree expressionTree, TigerScope scope) throws Exception {
        TigerConstant constant = new TigerConstant();
        
        String stringValue = expressionTree.getText();  
        if (stringValue.equals("CONSTANT")) {
            stringValue = expressionTree.getChild(0).getText();  
        } 
        
        constant.value = Float.parseFloat(stringValue);
        
        if (!stringValue.contains(".")) {
            constant.type = TigerType.Int();
        } else {
            constant.type = TigerType.FixedPt();
        }
        
        return constant;
    }
    
    public Float staticValue() {
        return value;
    }
}
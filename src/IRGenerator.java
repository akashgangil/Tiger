import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import org.antlr.runtime.tree.*;

public class IRGenerator {

    private int numOfTemps;
    private int numOfLabels;
    private TigerScope scope;
    
    private List<Quad> IRCode;

    public IRGenerator(TigerScope scope){
        this.scope = scope;
        this.IRCode = new ArrayList<Quad>(); 
    }

    private String end = "";

    private void addIR(Quad quad){
        this.IRCode.add(quad);
    }

    public List<Quad> getIR(){
        return this.IRCode;
    }

    public String generate(CommonTree node) {
        try {
            List children = node.getChildren();
            switch (node.getText()) {
                case "+":
                    return binaryOp("add", children);
                case "-":
                    return binaryOp("sub", children);
                case "*":
                    return binaryOp("mult", children);
                case "/":
                    return binaryOp("div", children);
                case "&":
                    return booleanOp(node);
                case "|":
                    return booleanOp(node);
                case "<":
                    return comparisonOp(node);
                case ">":
                    return comparisonOp(node);
                case "<=":
                    return comparisonOp(node);
                case ">=":
                    return comparisonOp(node);
                case "=":
                    return comparisonOp(node);
                case "<>":
                    return comparisonOp(node);
                case ":=":
                       return assignOp(children);
                case "STATEMENTS":
                       if (children != null) {
                           int length = children.size();
                           for (int i = 0; i < length; i++){
                               generate((CommonTree)children.get(i));
                           }
                       }
                       return null;
                case "REFERENCE":
                       return reference(children);
                case "INVOKE":
                       if(node.getParent().getText().equals("STATEMENTS")){
                           return invoke(children, true, null);
                       }
                       else{
                           CommonTree temp = node;
                           if(temp.getParent().getText().equals(":=")){
                               return invoke(children, false, temp.getParent().getChild(0).getChild(0).getText());
                           }
                           else return invoke(children, false, null);
                       }
                case "CONSTANT":
                       return constant(children);
                case "while":
                       return generateWhile(children);
                case "for":
                       return generateFor(children);
                case "if":
                       return generateIf(children);
                case "FUNC":
                       return generateFunc(node);
                case "FUNCS":
                       CommonTree main = null;
                       for (Object child : children) {
                           CommonTree curr = (CommonTree)child;
                           if (((CommonTree)curr.getChildren().get(1)).getText().equals("main")) {
                               main = curr;
                           }
                       }
                       generateMain(main.getChildren());

                       for (Object child : children) {
                           CommonTree curr = (CommonTree)child;
                           if (!((CommonTree)curr.getChildren().get(1)).getText().equals("main")) {
                               generate((CommonTree)child);
                           }
                       }

                       return null;
                case "BLOCK":
                       CommonTree vars = (CommonTree)children.get(1);
                       CommonTree stmts = (CommonTree)children.get(2);
                       generate(vars);
                       generate(stmts);
                       return null;
                case "BLOCKS":
                       for (Object child : children) {
                           generate((CommonTree)child);
                           //System.out.println(((CommonTree)child).getText());
                       }
                       return null;
                case "PROGRAM":
                       program(children);
                       return null;
                case "return":
                       return generateReturn(children);
                case "VARS":
                       if (children != null && children.size() > 0) {
                           for (Object child : children) {
                               generate((CommonTree)child);
                           }
                       }
                       return null;

                case "break":
                       emit("goto", end, null, null);

                case "var":
                       /*We generate IR only if the variable is initialized*/
                       if(children != null && children.size() > 1){
                           String type = ((CommonTree)children.get(1)).getText();
                           String value = "undefined garbage";
                           if(children.size() > 2)
                               value = ((CommonTree)children.get(2)).getText();
                           
                           CommonTree ids = (CommonTree)children.get(0);
                           if(type.equals("int") || type.equals("fixedpt")){
                               for(Object child: ids.getChildren()){
                                   String varName = ((CommonTree)child).getText();
                                   emit("assign", varName, value);
                               }
                           } /*Else its a user defined type and needs to be handled appropriately*/
                           else{
                               /*First check in the local scope*/
                               int foundLocalType = 0;
                               CommonTree temp = node;
                               while(!((CommonTree)temp.getParent()).getText().equals("BLOCKS")){
                                   temp = (CommonTree)temp.getParent();
                               }
                               CommonTree typesNode = (CommonTree)temp.getChild(0);
                               int size = -1;
                               if(typesNode.getChildren() != null){
                                   for(Object child : typesNode.getChildren()){
                                       CommonTree childNode = (CommonTree)child;
                                       if(childNode.getChild(0).getText().equals(type)){
                                           foundLocalType = 1;
                                           if(childNode.getChildren().size() == 3){
                                               size = Integer.parseInt(childNode.getChild(2).getText());
                                           }
                                           else if(childNode.getChildren().size() == 4){
                                               size = Integer.parseInt(childNode.getChild(2).getText())
                                                   * Integer.parseInt(childNode.getChild(3).getText());
                                           }
                                       }
                                   }
                               }
                               if(foundLocalType == 1){
                                   if(size == -1){
                                       for(Object child: ids.getChildren()){
                                           String varName = ((CommonTree)child).getText();
                                           emit("assign", varName, value);
                                       }
                                   }
                                   else{
                                       for(Object child: ids.getChildren()){
                                           String varName = ((CommonTree)child).getText();
                                           emit("assign", varName, size+"", value);
                                       }
                                   }
                               }
                               else{
                                   /*All user defined types are declared in global scope in Tiger*/
                                   TigerType userDefinedType = (TigerType)scope.childScopes.get(0).lookupSymbol(type);
                                   /*Base Type*/
                                   int width = userDefinedType.getWidth();
                                   int height = userDefinedType.getHeight();
                                   if(userDefinedType != null && width == 0 && height == 0){
                                       for(Object child: ids.getChildren()){
                                           String varName = ((CommonTree)child).getText();
                                           emit("assign", varName, value);
                                       }
                                   }/*1-D or 2-D array*/
                                   else {
                                       size = -1;
                                       if(width == 0) size = height;
                                       else if(height == 0) size = width;
                                       else size = height * width;

                                       for(Object child: ids.getChildren()){
                                           String varName = ((CommonTree)child).getText();
                                           emit("assign", varName, size + "", value);
                                       }
                                   }
                               }
                           }
                       }
                default:
                       return null;
            }
        } catch (Exception ex) {
            System.err.print(node.getText() + " <- ");
            throw ex;
        }
    }

    private String binaryOp(String opName, List children) {
        String left = generate((CommonTree)children.get(0));
        String right = generate((CommonTree)children.get(1));
        String t1 = newTemp();
        emit(opName, left, right, t1);
        return t1;
    }

    private String assignOp(List children) {
        String right = generate((CommonTree)children.get(1));
        CommonTree leftNode = (CommonTree)children.get(0);
        /*Array and variables are handled with different opcodes*/
        if(leftNode.getText().equals("REFERENCE") && leftNode.getChildren().size() > 1){
            if(leftNode.getChildren().size() == 2){
                String arrayName = ((CommonTree)leftNode.getChild(0)).getText();
                /*Since the index can be an expression*/
                String arrayIndex = generate((CommonTree)leftNode.getChild(1));
                emit("array_store", arrayName, arrayIndex, right);
                return arrayName;
            }
            else if(leftNode.getChildren().size() == 3){
                String arrayName = ((CommonTree)leftNode.getChild(0)).getText();
                /*Since the index can be an expression*/
                String arrayIndexRow = generate((CommonTree)leftNode.getChild(1));
                String arrayIndexColumn = generate((CommonTree)leftNode.getChild(2));
                String arrayType =  getType((CommonTree)leftNode.getChild(0));
                String size = getSize((CommonTree)(leftNode.getChild(0)), arrayType);
                String offset = arrayIndexing(arrayIndexRow, arrayIndexColumn, size);
                emit("array_store", arrayName, offset, right);
                return arrayName;
            }
            return "t"; // I dont know why but t would look good in case this ever comes here
        }
        else{
            String left = generate((CommonTree)children.get(0));
            if(!((CommonTree)children.get(1)).getText().equals("INVOKE"))
                emit("assign", left, right);
            return left;
        }
    }

    private String reference(List children) {
        int length = children.size();
        switch (length) {
            case 1:
                return ((CommonTree)children.get(0)).getText();
            case 2:
                return array(children);
            case 3:
                return array2d(children);
        }
        return null;
    }

    private String array(List children) {
        String r = newTemp();
        String a = ((CommonTree)children.get(0)).getText(); //array
        String o = generate((CommonTree)children.get(1)); //offset
        emit("array_load", r, a, o);
        return r;
    }

    private String array2d(List children) {
        //TODO: get size of array from symbol table and multiply offset
        String r = newTemp();
        String a = ((CommonTree)children.get(0)).getText();

        String arrayType =  getType((CommonTree)children.get(0));
        String size = getSize((CommonTree)children.get(0), arrayType);

        String o1 = generate((CommonTree)children.get(1));
        String o2 = generate((CommonTree)children.get(2));
        String offset = arrayIndexing(o1, o2, size);
        emit("array_load", r, a, offset);
        return r;
    }

    private String getSize(CommonTree node, String typeName){
        CommonTree temp = node;
        int found = 0;
        while(true){
            while(!temp.getText().equals("BLOCK")){
                temp = (CommonTree)temp.getParent();
            }
            CommonTree typesNode = (CommonTree)temp.getChild(0);
            if(typesNode.getChildren() != null && typesNode.getChildren().size() != 0){
                for(Object typeNode: typesNode.getChildren()){
                    String type = ((CommonTree)(((CommonTree)typeNode).getChild(0))).getText();
                    if(type.equals(typeName)){
                        return ((CommonTree)(((CommonTree)typeNode).getChild(3))).getText();
                    }
                }
            }
            temp = (CommonTree) temp.getParent();
            if(temp.getText().equals("BLOCKS")) break;
        }
        /*If we reach here then search in global scope*/
        TigerType userDefinedType = (TigerType)scope.childScopes.get(0).lookupSymbol(typeName);
        return userDefinedType.getHeight() + "";

    }


    private String getType(CommonTree node){
        CommonTree temp = node;
        String varName = node.getText();
        int found = 0;
        while(true){
            while(!temp.getText().equals("BLOCK")){
                temp = (CommonTree)temp.getParent();
            }
            String typeName = "";
            CommonTree varsNode = (CommonTree)temp.getChild(1);
            if(varsNode.getChildren() != null && varsNode.getChildren().size() != 0){
                for(Object var: varsNode.getChildren()){
                    if(((CommonTree)var).getChild(0) != null){
                        if(((CommonTree)(((CommonTree)var).getChild(0))).getChildren() != null){
                            for(Object varId: ((CommonTree)(((CommonTree)var).getChild(0))).getChildren()){
                                String name = ((CommonTree)varId).getText();
                                if(name.equals(varName)){
                                    typeName = ((CommonTree)(((CommonTree)var).getChild(1))).getText();
                                    found = 1;
                                    return typeName;
                                }
                            }
                        }
                    }
                }
            }
            temp = (CommonTree) temp.getParent();
            if(temp.getText().equals("BLOCKS")){
                /*Only place left to check is function param*/
                CommonTree functionNode = (CommonTree)temp.getParent();
                CommonTree paramsNode = (CommonTree)functionNode.getChild(2);
                if(paramsNode.getChildren() != null){
                    for(Object param: paramsNode.getChildren()){
                        CommonTree paramNode = (CommonTree) param;
                        if(((CommonTree)paramNode.getChild(0)).getText().equals(varName)){
                            return ((CommonTree)(paramNode.getChild(1))).getText();
                        }
                    }
                }
                /*If not here then return null*/
                return null;
            }
        }
    }

    private String constant(List children) {
        return ((CommonTree)children.get(0)).getText();
    }

    private String invoke(List children, boolean call, String temp) {
        String a = ((CommonTree)children.get(0)).getText();
        ArrayList<String> params = null;
        boolean returnsValue = false; //TODO: get this from the symbol table
        if (children.size() > 1) {
            params = new ArrayList<String>();
            CommonTree exprs = (CommonTree)children.get(1);
            List exprChildren = exprs.getChildren();
            if (exprChildren != null){
                int length = exprChildren.size();
                for (int i = 0; i < length; i++) {
                    String ti = generate((CommonTree)exprChildren.get(i));
                    params.add(ti);
                }
            }
        }
        if(call){
            emit("call", a, null, null, params);
        }
        else{
            if(temp == null) temp = newTemp();
            emit("callr", temp, a, null, params);
        }
        return temp;
    }

    private String generateIf(List children) {
        String e = newLabel();
        CommonTree opNode = (CommonTree)children.get(0);
        String t = generate(opNode);
        emit("breq", t, 0 + "", e);
        generate((CommonTree)children.get(1));

        emit(e + ":", null, null, null);
        if (children.size() > 2) {
            generate((CommonTree)children.get(2));
        }

        return null;
    }

    public String generateMain(List children) {
        generate((CommonTree)children.get(3));
        return null;
    }

    public String generateFunc(CommonTree node){
        List children = node.getChildren();
        String returnType = ((CommonTree)children.get(0)).getText();
        String name = ((CommonTree)children.get(1)).getText();
        emit(name + ":", null, null, null);
        generate((CommonTree)children.get(3));
        return null;
    }

    private String generateWhile(List children) {
        end = newLabel();
        String t = newLabel();
        emit(t + ":", null, null, null);
        CommonTree opNode = (CommonTree)children.get(0);
        String t1 = generate(opNode);
        emit("breq", t1, 0 + "", end);
        //String branchOp = getBranchOp(opNode);
        //emit("goto", t, null, null);
        //CommonTree left = (CommonTree)opNode.getChildren().get(0);
        //CommonTree right = (CommonTree)opNode.getChildren().get(1);
        //String t2 = generate(left);
        //String t3 = generate(right);
        //emit(branchOp, t2, t3, end);

        CommonTree stmts = (CommonTree)children.get(1);
        generate(stmts);
        emit("goto", t, null, null);
        emit(end + ":", null, null, null);
        return null;
    }

    private String generateFor(List children) {
        String top = newLabel();
        end = newLabel();
        String var = ((CommonTree)children.get(0)).getText();
        String lower = generate((CommonTree)children.get(1));
        String upper = generate((CommonTree)children.get(2));
        emit("assign", var, lower);
        emit(top + ":", null, null, null);
        emit("brgt", var, upper, end);
        generate((CommonTree)children.get(3));
        emit("add", 1 + "", var, var);
        emit("goto", top, null, null);
        emit(end + ":", null, null, null);
        return null;
    }

    private String booleanOp(CommonTree node) {
        List children = node.getChildren();
        CommonTree leftNode = (CommonTree)children.get(0);
        CommonTree rightNode = (CommonTree)children.get(1);

        if (node.getText().equals("|")){
            String e = newLabel();
            String r = newTemp();
            String t1 = generate(leftNode);
            emit("assign", r, t1);
            emit("brneq", t1, 0 + "", e);
            String t2 = generate(rightNode);
            emit("assign", r, t2);
            emit(e + ":", null, null);
            return r;
        } else if (node.getText().equals("&")) {
            String e = newLabel();
            String r = newTemp();
            String t1 = generate(leftNode);
            emit("assign", r, t1);
            emit("breq", t1, 0 + "", e);
            String t2 = generate(rightNode);
            emit("assign", r, t2);
            emit(e + ":", null, null);
            return r;
        }

        return null;
    }

    private String comparisonOp(CommonTree node){
        List children = node.getChildren();
        CommonTree leftNode = (CommonTree)children.get(0);
        CommonTree rightNode = (CommonTree)children.get(1);

        String t1 = generate(leftNode);
        String t2 = generate(rightNode);

        String result = newTemp();
        String trueLabel = newLabel();
        String falseLabel = newLabel();
        String e = newLabel();
        emit("sub", t2, t1, result);
        boolean isOr = node.getParent().getText().equals("|");
         if (isOr) {
            switch (node.getText()) {
                case "<":
                    emit("brleq", result, 0 + "", falseLabel);
                    break;
                case ">":
                    emit("brgeq", result, 0 + "", falseLabel);
                    break;
                case "<=":
                    emit("brlt", result, 0 + "", falseLabel);
                    break;
                case ">=":
                    emit("brgt", result, 0 + "", falseLabel);
                    break;
                case "=":
                    emit("brneq", result, 0 + "", falseLabel);
                    break;
                case "<>":
                    emit("breq", result, 0 + "", falseLabel);
                    break;
            }
        } else {
            String branchOp = getBranchOp(node);
            emit(branchOp, 0 + "", result, falseLabel);
        }

        emit(trueLabel + ":", null, null);
        emit("assign", result, 1 + "");
        emit("goto", e, null, null);
        emit(falseLabel + ":", null, null);
        emit("assign", result, 0 + "");
        emit(e + ":", null, null);
        return result;
    }

    private String program(List children) {
        return generate((CommonTree)children.get(1));
    }

    private String generateReturn(List children) {
        String t0 = generate((CommonTree)children.get(0));
        emit("return", t0, null, null);
        return null;
    }

    private String getBranchOp(CommonTree opNode) {
        String op = opNode.getText();
        String branchOp = null;
        switch (op) {
            case "=":
                branchOp = "brneq";
                break;
            case "<>":
                branchOp = "breq";
                break;
            case ">=":
                branchOp = "brlt";
                break;
            case "<=":
                branchOp = "brgt";
                break;
            case "<":
                branchOp = "brgeq";
                break;
            case ">":
                branchOp = "brleq";
                break;
            default:
                break;
        }
        return branchOp;
    }

    private String newTemp() {
        return "t" + numOfTemps++;
    }

    private String newLabel() {
        return "L" + numOfLabels++;
    }

    private String arrayIndexing(String i, String j, String columnSize){
        String rowLine = newTemp();
        String ele = newTemp();
        emit("mult", i, columnSize, rowLine);
        emit("add", j, rowLine, ele);
        return ele;
    }

    private void emit(String op, String x, String y) {
        emit(op, x, y, null);
    }

    private void emit(String op, String x, String y, String z) {
        emit(op, x, y , z, null);
    }

    private void emit(String op, String x, String y, String z, List<String> params) {
        Quad quad = new Quad(op, x, y, z, params);
        addIR(quad);
    }
}

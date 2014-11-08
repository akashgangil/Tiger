import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import org.antlr.runtime.tree.*;

public class IRGenerator {

    private int numOfTemps;
    private int numOfLabels;
    private TigerScope scope;

    public IRGenerator(TigerScope scope){
        this.scope = scope;
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
                    return binaryOp("and", children);
                case "|":
                    return binaryOp("or", children);
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
                    return invoke(children);
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
                case "var": 
                    /*We generate IR only if the variable is initialized*/
                    if(children != null && children.size() > 2){
                        String type = ((CommonTree)children.get(1)).getText();
                        String value = ((CommonTree)children.get(2)).getText();
                        CommonTree ids = (CommonTree)children.get(0);
                        if(type.equals("int") || type.equals("fixedpt")){
                            for(Object child: ids.getChildren()){
                                String varName = ((CommonTree)child).getText();
                                emit("assign", varName, value);
                            }
                        } /*Else its a user defined type and needs to be handled appropriately*/
                        else{
                            /*All user defined types are declared in global scope in Tiger*/
                            TigerType userDefinedType = (TigerType)scope.childScopes.get(0).lookupSymbol(type);
                            int width = userDefinedType.getWidth(); int height = userDefinedType.getHeight();
                            /*Base Type*/
                            if(type != null && width == 0 && height == 0){
                                for(Object child: ids.getChildren()){
                                    String varName = ((CommonTree)child).getText();
                                    emit("assign", varName, value);
                                }
                            }/*1-D or 2-D array*/
                            else if(type != null){
                                int size = -1;
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
        String left = generate((CommonTree)children.get(0));
        String right = generate((CommonTree)children.get(1));
        int size = -1; //TODO: get size from type table
        emit("assign", left, right);
        return left;
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
        //emit("add", a, o, a); // we dont need array offsetting
        emit("array_load", r, a, o);
        return r;
    }

    private String array2d(List children) {
        //TODO: get size of array from symbol table and multiply offset
        String r = newTemp();
        String a = generate((CommonTree)children.get(0));
        String o1 = generate((CommonTree)children.get(1));
        String o2 = generate((CommonTree)children.get(2));

        //emit("array_load", a, r);
        return r;
    }

    private String constant(List children) {
        return ((CommonTree)children.get(0)).getText();
    }

    private String invoke(List children) {
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
        if (returnsValue) {
            emit("callr", a, null, null, params);
        } else {
            emit("call", a, null, null, params);
        }
        return a;
    }

    private String generateIf(List children) {
        String e = newLabel();
        CommonTree opNode = (CommonTree)children.get(0);
        String t = generate(opNode);
        String branchOp = getBranchOp(opNode);
        String left = generate((CommonTree)opNode.getChildren().get(0));
        String right = generate((CommonTree)opNode.getChildren().get(1));
        emit(branchOp, left, right, e);

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
        if (returnType.equals("void")) {
            emit("return", null, null, null);
        } else {
            //handled inside the function
        }
        return null;
    }

    private String generateWhile(List children) {
        String e = newLabel();
        String t = newLabel();
        emit(t + ":", null, null, null);
        CommonTree opNode = (CommonTree)children.get(0);
        String t1 = generate(opNode);
        String branchOp = getBranchOp(opNode);

        CommonTree left = (CommonTree)opNode.getChildren().get(0);
        CommonTree right = (CommonTree)opNode.getChildren().get(1);
        String t2 = generate(left);
        String t3 = generate(right);
        emit(branchOp, t2, t3, e);

        CommonTree stmts = (CommonTree)children.get(1);
        generate(stmts);
        emit("goto", t, null, null);
        emit(e + ":", null, null, null);
        return null;
    }

    private String generateFor(List children) {
        String top = newLabel();
        String end = newLabel();
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

    private void emit(String op, String x, String y) {
        emit(op, x, y, null);
    }

    private void emit(String op, String x, String y, String z) {
        emit(op, x, y , z, null);
    }

    private void emit(String op, String x, String y, String z, List<String> params) {
        Quad quad = new Quad(op, x, y, z, params);
        System.out.println(quad);
    }
}

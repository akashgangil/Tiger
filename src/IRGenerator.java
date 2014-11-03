import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import org.antlr.runtime.tree.*;

public class IRGenerator {

    private int numOfTemps;
    private int numOfLabels;

    public String generate(CommonTree node) {
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
                int length = children.size();
                for (int i = 0; i < length; i++){
                    generate((CommonTree)children.get(i));
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
            default:
                return null;
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
        emit("assign", left, right);
        return left;
    }

    private String reference(List children) {
        int length = children.size();
        switch (length) {
            case 1:
                return generate((CommonTree)children.get(0));
            case 2:
                return array(children);
            case 3:
                return array2d(children);
        }
        return null;
    }

    private String array(List children) {
        String r = newTemp();
        String a = generate((CommonTree)children.get(0)); //array
        String o = generate((CommonTree)children.get(1)); //offset
        emit("+", a, o, a);
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
        String a = generate((CommonTree)children.get(0));
        ArrayList<String> params = null;

        if (children.size() > 1) {
            params = new ArrayList<String>();
            CommonTree exprs = (CommonTree)children.get(1);
            List exprChildren = exprs.getChildren();
            int length = exprChildren.size();
            for (int i = 0; i < length; i++) {
                String ti = generate((CommonTree)exprChildren.get(i));
                params.add(ti);
            }
        }

        String t1 = newTemp();
        emit("call", a, t1, null, params);
        return t1;
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
        String firstBound = generate((CommonTree)children.get(0));
        String secondBound = generate((CommonTree)children.get(1));
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

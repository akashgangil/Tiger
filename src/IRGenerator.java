import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import org.antlr.runtime.tree.*;

public class IRGenerator {

    private int numOfTemps;

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
        //figure out how to get multiplier of the offset
        String r = newTemp();
        String a = generate((CommonTree)children.get(0)); //array
        String o = generate((CommonTree)children.get(1)); //offset
        emit("+", a, o, a);
        emit("array_load", r, a, o);
        return r;
    }

    private String array2d(List children) {
        //fix this
        String r = newTemp();
        String a = generate((CommonTree)children.get(0));
        String o1 = generate((CommonTree)children.get(1));
        String o2 = generate((CommonTree)children.get(2));

        emit("array_load", a, r);
        return r;
    }

    private String constant(List children) {
        return ((CommonTree)children.get(0)).getText();
    }

    private String invoke(List children) {
        String a = generate((CommonTree)children.get(0));
        int length = children.size();
        ArrayList<String> params = new ArrayList<String>();
        for (int i = 1; i < length; i++) {
            String ti = generate((CommonTree)children.get(i));
            params.add(ti);
        }
        String t1 = newTemp();

        emit("call", a, null, t1, params);
        return t1;
    }

    private String newTemp() {
        return "t" + numOfTemps++;
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

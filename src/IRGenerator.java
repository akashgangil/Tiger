import java.util.LinkedList;
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

            default:
                return null;
        }
    }

    private String binaryOp(String opName, List children) {
        String left = generate((CommonTree)children.get(0));
        String right = generate((CommonTree)children.get(1));
        String label = newTemp();
        emit(opName, left, right, label);
        return label;
    }

    private String assignOp(List children) {
        String left = generate((CommonTree)children.get(0));
        String right = generate((CommonTree)children.get(1));
        emit("assign", left, right);
        return left;
    }

    private String newTemp() {
        return "t" + numOfTemps++;
    }

    private void emit(String op, String left, String right) {
        emit(op, left, right, null);
    }

    private void emit(String op, String left, String right, String result) {
        emit(op, left, right, result, (String[])null);
    }

    private void emit(String op, String left, String right, String result, String... params) {
        Quad quad = new Quad(op, left, right, result, params);
        System.out.println(quad);
    }
}

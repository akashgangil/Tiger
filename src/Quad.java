import java.util.List;

public class Quad {

    private String op;
    private String addr1, addr2, addr3;
    private List<String> params;

    public Quad(String o, String a, String b, String c, List<String> p) {
        op = o;
        addr1 = a;
        addr2 = b;
        addr3 = c;
        params = p;
    }

    public String getOp() {
        return this.op;
    }

    public String getAddr1() {
        return this.addr1;
    }
    
    public String getAddr2() {
        return this.addr2;
    }
    
    public String getAddr3() {
        return this.addr3;
    }
    
    public String getParam() {
        return params.get(0);
    }
    
    public String getTarget() {
        switch (op) {
            case "goto": return addr1;
            case "breq":
            case "brneq":
            case "brlt":
            case "brgt":
            case "brgeq":
            case "brleq": return addr3;
            default:
            return null;
        }
    }
    
    public String getLabel() {
        if (isLabel()) {
            return op.substring(0, op.length() - 1);
        } else {
            return null;
        }
    }

    public boolean isLabel() {
        return op.matches("^L\\d*:$");
    }

    public boolean canFallthrough() {
        switch (op) {
            case "goto": return false;
            case "breq":
            case "brneq":
            case "brlt":
            case "brgt":
            case "brgeq":
            case "brleq": return true;
            default:
            return false;
        }
    }

    public String toString(){
        String s = "";
        if (op != null) s += op.toString();
        if (addr1 != null) s += ", " + addr1.toString();
        if (addr2 != null) s += ", " + addr2.toString();
        if (addr3 != null) s += ", " + addr3.toString();
        if (params != null){
            for(String t : params){
                if (t != null) s += ", " + t.toString();
            }
        }

        return s;
    }
}

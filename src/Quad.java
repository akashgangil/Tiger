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

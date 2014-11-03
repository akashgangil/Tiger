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
        s += op.toString();
        s += ", " + addr1.toString();
        s += ", " + addr2.toString();
        s += ", " + addr3.toString();
        if (params != null){
            for(String t : params){
                s += ", " + t.toString();
            }
        }

        return s;
    }
}

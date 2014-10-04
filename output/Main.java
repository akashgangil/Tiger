import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.nio.charset.*;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Main {
	private static String readFile(String path, Charset encoding) 
	  throws Exception 
	{
	  byte[] encoded = Files.readAllBytes(Paths.get(path));
	  return new String(encoded, encoding);
	}
	
    public static void main(String[] args) throws Exception {
		try {
			String src = readFile("input.tiger", StandardCharsets.UTF_8);
    	    tigerLexer lexer     = new tigerLexer(new ANTLRStringStream(src));
    	    tigerParser parser   = new tigerParser(new CommonTokenStream(lexer));
    	    CommonTree tree      = (CommonTree)(parser.tiger_program().getTree());
    	    DOTTreeGenerator gen = new DOTTreeGenerator();
    	    StringTemplate st    = gen.toDOT(tree);
    	    System.out.println(st);
		} catch (Exception e) {
			System.out.println("exception");
		}
    }
}

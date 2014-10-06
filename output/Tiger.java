import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.runtime.Token.*;

import java.nio.charset.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;


public class Tiger {
    private static String readFile(String path, Charset encoding) throws Exception {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    private static void writeDotFile(String fileName, String outputString, Charset encoding) throws Exception {
        Path file = Paths.get(fileName);

        try (BufferedWriter writer = Files.newBufferedWriter(file, encoding)) {
            writer.write(outputString, 0, outputString.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    public static void main(String[] args) {
        try {
            String[] file_tokens = args[0].split("\\.(?=[^\\.]+$)");
            String src = readFile(args[0], StandardCharsets.UTF_8);
            TigerLexer lexer = new TigerLexer(new ANTLRStringStream(src));
            TigerParser parser = new TigerParser(new CommonTokenStream(lexer));
            
            /*To print lexer symbols of the program*/
            TigerLexer lexer1 = new TigerLexer(new ANTLRStringStream(src));
            CommonTokenStream cts = new CommonTokenStream(lexer1);
            
            int i = 1;
            Token to = cts.LT(i);
            while(to.getType() != -1){
                System.out.print(TigerParser.tokenNames[to.getType()] + " ");
                if(to.getType() == -1) break;
                to = cts.LT(++i);
            }
            System.out.println();

            CommonTree tree = (CommonTree)(parser.tiger_program().getTree());
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(tree);
            writeDotFile(file_tokens[0]+".dot", st.toString(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

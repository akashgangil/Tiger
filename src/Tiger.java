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
    private static String readFile(String path) throws Exception {
        String contents = null;
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            contents = new String(encoded, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        return contents;
    }

    private static void writeDotFile(TigerParser parser, TigerOptions options) throws RecognitionException {
        CommonTree tree = (CommonTree)(parser.tiger_program().getTree());
        DOTTreeGenerator gen = new DOTTreeGenerator();
        String output = gen.toDOT(tree).toString();

        Path file = Paths.get(options.dotFilename);
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            writer.write(output);
        } catch (IOException ioe) {
            System.err.println(ioe);
            System.exit(1);
        }
    }

    public static class TigerOptions {
        public boolean printTokens = false;
        public boolean printSymbolTable = false;
        public boolean help = false;
        public String inputFilename = null;
        public String dotFilename = null;

        public TigerOptions(String[] args) {
            for (int idx = 0; idx < args.length; idx += 1) {
                String arg = args[idx];

                if (arg.equals("--tokens")) {
                    printTokens = true;    
                } else if (arg.equals("--symbol-table")) {
                    printSymbolTable = true;
                } else if (arg.equals("--dot")) {
                    idx += 1;
                    dotFilename = args[idx];
                } else if (args.equals("--help")) {
                    help = true;
                } else {
                    inputFilename = arg;
                }
            }
        }
    }

    public static void usage(int status) {
        System.out.println("usage: Tiger [options] <input file>");
        System.out.println("\t--tokens\toutput tokens");
        System.out.println("\t--symbol-table\toutput symbol table");
        System.out.println("\t--help\tthis help message");

        System.exit(status);
    }

    public static void main(String[] args) {
        TigerOptions options = new TigerOptions(args);

        if (options.inputFilename == null) {
            usage(1);
        } else if (options.help) {
            usage(0);
        }

        try {
            String source = readFile(options.inputFilename);
            TigerLexer lexer = new TigerLexer(new ANTLRStringStream(source));
            TigerParser parser = new TigerParser(new CommonTokenStream(lexer));

            if (options.printTokens) {

            }

            if (options.dotFilename != null) {

            }

            if (options.printSymbolTable) {

            }
        } catch (RecognitionException re) {
            System.err.println(re);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}

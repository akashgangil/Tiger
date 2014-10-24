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
            System.out.println(e);
            System.exit(1);
        }
        return contents;
    }

    private static void writeDotFile(TigerParser parser, TigerOptions options) {
        CommonTree tree = (CommonTree)(parser.tiger_program().getTree());
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);

        Path file = Paths.get(options.dotFilename);

        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            writer.write(outputString, 0, outputString.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
            System.exit(1);
        }
    }

    private class TigerOptions {
        boolean printTokens = false;
        boolean printSymbolTable = false;
        string inputFilename = null;
        string dotFilename = null;
    }

    public static void usage(int status) {
        System.out.println("usage: Tiger [options] <input file>");
        System.out.println("\t--tokens\toutput tokens");
        System.out.println("\t--symbol-table\toutput symbol table");
        System.out.println("\t--help\tthis help message");

        System.exit(status);
    }

    public static TigerOptions parseArgs(String[] args) {
        TigerOptions options = new TigerOptions();

        for (int idx = 0; idx < args.length; idx += 1) {
            String arg = args[idx];

            if (arg.equals("--tokens") {
                options.printTokens = true;    
            } else if (arg.equals("--symbol-table") {
                options.printSymbolTable = true;
            } else if (arg.equals("--dot") {
                idx += 1;
                options.dotFilename = args[idx];
            } else if (args.equals("--help") {
                usage(0);
            } else {
                options.inputFilename = arg;
            }
        }

        if (inputFilename == null) {
            usage(1);
        } 

        return options;
    }
 
    public static void main(String[] args) {
        TigerOptions options = parseArgs(args);

        try {
            String src = readFile(options.inputFilename);
            TigerLexer lexer = new TigerLexer(new ANTLRStringStream(src));
            TigerParser parser = new TigerParser(new CommonTokenStream(lexer));

            if (options.printTokens) {
                                  
            }

            if (options.dotFilename != null) {
                
            }

            if (options.printSymbolTable) {
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

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
import java.util.Queue;
import java.util.LinkedList;
import java.util.Hashtable;
import java.util.Collections;
import java.util.List;

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

    private static void writeDotFile(CommonTree tree, TigerOptions options) throws RecognitionException {
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
                } else if (arg.equals("--ast")) {
                    idx += 1;
                    dotFilename = args[idx];
                } else if (arg.equals("--symbol-table")) {
                    printSymbolTable = true;
                } else if (args.equals("--help")) {
                    help = true;
                } else if (arg.indexOf("--") == 0) {
                    usage(1);  
                } else {
                    inputFilename = arg;
                }
            }
        }
    }

    public static void usage(int status) {
        System.out.println("usage: Tiger [options] <input file>");
        System.out.println("\t--tokens\toutput tokens");
        System.out.println("\t--ast <dot output file>\tgenerate ast dot diagram");
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
	        CommonTree tree = (CommonTree)(parser.tiger_program().getTree());

            if (options.printTokens) {
	            TigerLexer lexer1 = new TigerLexer(new ANTLRStringStream(source));
	            CommonTokenStream cts = new CommonTokenStream(lexer1);

	            int i = 1;
	            Token to = cts.LT(i);
	            while(to.getType() != -1){
	                System.out.print(TigerParser.tokenNames[to.getType()] + " ");
	                if(to.getType() == -1) break;
	                to = cts.LT(++i);
	            }

	            System.out.println();
            }

            if (options.dotFilename != null) {
				writeDotFile(tree, options);
            }

            if (options.printSymbolTable) {
	            //run bfs
	            TigerUtil.bfs(tree);
	            //print sample symbol table
	            System.out.println("***Symbol Table***");
	            //printSymbolTable(ht);
			}

			if(parser.getErrors().isEmpty() && lexer.getErrors().isEmpty()){
				System.out.println("***Successful Parse***");
			}
			else{
				if(!parser.getErrors().isEmpty()){
					System.out.println("*** Parser Errors ***"); 
					for(String s : parser.getErrors()) System.out.println(s);
				}

				if(!lexer.getErrors().isEmpty()){
					System.out.println("*** Lexer Errors ***"); 
					for(String s : lexer.getErrors()) System.out.println(s);
				}
			}
		} catch (RecognitionException re) {
			System.err.println(re);
		} catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}

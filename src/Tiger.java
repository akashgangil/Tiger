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

    private static void writeMipsFile(String mipsCode, TigerOptions options){
        Path file = Paths.get(options.inputFilename);
        String fileName = file.getFileName().toString();
        String mipsFileName = fileName.substring(0, fileName.lastIndexOf(".")+1) + "s";
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(mipsFileName), StandardCharsets.UTF_8)){
            writer.write(mipsCode);
        }catch(IOException ioe){
            System.err.println(ioe);
            System.exit(1);
        }
    }


    public static class TigerOptions {
        public boolean printTokens = false;
        public boolean printSymbolTable = false;
        public boolean intermediateRep = false;
        public boolean mips = false;
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
                } else if (arg.equals("--ir")) {
                    intermediateRep = true;
                } else if (args.equals("--help")) {
                    help = true;
                } else if (arg.equals("--mips")) {
                    mips = true;
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
        System.out.println("\t--tokens\t\t\toutput tokens");
        System.out.println("\t--ast <dot output file>\t\tgenerate ast dot diagram");
        System.out.println("\t--symbol-table\t\t\toutput symbol table");
        System.out.println("\t--ir\t\t\t\tintermediate representation");
        System.out.println("\t--mips\t\t\t\toutput mips code");
        System.out.println("\t--help\t\t\t\tthis help message");

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
            TigerSemanticError.setSource(source.split("\n"));
            TigerLexer lexer = new TigerLexer(new ANTLRStringStream(source));
            TigerParser parser = new TigerParser(new CommonTokenStream(lexer));
            CommonTree ast = (CommonTree)parser.tiger_program().getTree();

            if (parser.getErrors().isEmpty() && lexer.getErrors().isEmpty()) {
                TigerProgram program = new TigerProgram(ast);
                
                if (options.printTokens) {
                    lexer = new TigerLexer(new ANTLRStringStream(source));
                    CommonTokenStream cts = new CommonTokenStream(lexer);

                    int i = 1;
                    Token to = cts.LT(i);
                    while(to.getType() != -1){
                        System.out.print(TigerParser.tokenNames[to.getType()] + " ");
                        if(to.getType() == -1) break;
                        to = cts.LT(++i);
                    }

                    System.out.println();
                }
                
                if(options.dotFilename != null){
                    writeDotFile(ast, options);
                }
                
                if (!TigerSemanticError.getWarnings().isEmpty()) {
                    for(TigerSemanticError warning : TigerSemanticError.getWarnings()) {
                        System.err.println(warning);
                    }
                }
                
                if (TigerSemanticError.getErrors().isEmpty()) {
                    if (options.printSymbolTable) {
                        System.err.println(program.getGlobalScope());
                    }
                    
                    if (options.intermediateRep || options.mips) {
                        IRGenerator irGen = new IRGenerator(program.getGlobalScope());
                        irGen.generate(ast);
                    
                        if(options.intermediateRep) { 
                            for(Quad ir: irGen.getIR()){
                                System.out.println(ir);
                            }   
                        }

                        BasicBlockGenerator bbg = new BasicBlockGenerator(); 
                        /* Uncomment to print out the basic blocks */
                        /* System.out.println("Basic Blocks");
                        for (BasicBlock b : bbg.findBasicBlocks(irGen.getIR())){
                            System.out.println(b);
                        } */

                        if(options.mips){
                            MIPSGenerator mips = new MIPSGenerator(program.getGlobalScope());
                            String result = mips.getMIPSCode(irGen.getIR());
                            System.out.println(result);
                            writeMipsFile(result, options);
                        }
                    }
                } else {
                    for(TigerSemanticError error : TigerSemanticError.getErrors()) {
                        System.err.println(error);
                    }
                }
            } else {
                for(String error : parser.getErrors()) {
                    System.err.println(error);
                }
                for(String error : lexer.getErrors()) {
                    System.err.println(error);
                }
            }

        } catch (RecognitionException re) {
            System.err.println(re);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

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

    private static int CURRENT_LEXICAL_LEVEL = 0;
    private static String CURRENT_PROC_NAME = "GLOBAL";

    private static String getCurrentProcName(CommonTree node){
        CommonTree temp = node.parent;
        while(temp != null && !temp.getText().equals("FUNC")){
            temp = temp.parent;
        }
        //Since 0 is mandatory return type and 1 is the name
        return temp.getChild(1).getText();
    }

    private static void setCurrentProcName(CommonTree node){
        CURRENT_PROC_NAME = getCurrentProcName(node);
    }

    private enum ASTTokens{
        VAR, FUNCTION, TYPE
    }
    private static class Arg{
        private String name;
        private String type;
        private String value;

        public Arg(String name, String type, String value){
            this.name = name;
            this.type = type;
            this.value = value;
        }

        public String toString(){
            return "Arg: [Name: " + name + " ], [Type: " + type
                   + "], [Value: " + value + "]";
        }
    }
    
    private static class Symbol{
        private String name;

        public Symbol(String name){
            this.name = name;
        }

        public String toString(){
            return "[SymbolName: " + name;
        }
    }

    private static class SymbolInfo{
        private String value;
        private ASTTokens type;
        private String declaringProc;
        private int lexicalLevel;
        private List<SymbolInfo> next;

        public SymbolInfo(ASTTokens type, String declaringProc, int lexicalLevel){
            this.type = type;
            this.declaringProc = declaringProc;
            this.lexicalLevel = lexicalLevel;
            this.next = Collections.emptyList();
        }

        public String toString(){
            return "[Type: " + 
                type + "], [DP: " + 
                declaringProc + "], [LL: " + 
                lexicalLevel + "], Chain: " +
                next + "], ";
        }

        //We will chain if we can same names
        public void chainSymbol(SymbolInfo chainElement){
            next.add(chainElement);
        }

        public void setValue(String value){
            this.value = value;
        }
    }

    //variables VAR
    private static class VariableInfo extends SymbolInfo{
        private String dataType;
        private int value; //since we have only int and fixedpt as possible datatypes

        public VariableInfo(String dataType, int value){
            super(ASTTokens.VAR, CURRENT_PROC_NAME, CURRENT_LEXICAL_LEVEL);
            setValue(value);
            setDataType(dataType);
        }

        private void setValue(int value){
            this.value = value;
        }

        private void setDataType(String dataType){
            this.dataType = dataType;
        }

        public String toString(){
            return super.toString() + " [DataType: " +
                dataType + "], [Value: " +
                value;
        }
    }


    //functions FUNCTION
    private static class FunctionInfo extends SymbolInfo{
        private String returnType;
        private int numArgs;
        private List<Arg> argList;

        public FunctionInfo(String returnType, int numArgs,
                List<Arg> argList){
            super(ASTTokens.FUNCTION, CURRENT_PROC_NAME, CURRENT_LEXICAL_LEVEL);
            setReturnType(returnType);
            setNumArgs(numArgs);
            setArgList(argList);
        }

        private void setReturnType(String returnType){
            this.returnType = returnType;
        }

        private void setNumArgs(int numArgs){
            this.numArgs = numArgs;
        }

        private void setArgList(List<Arg> argList){
            this.argList = argList;
        }

        public String toString(){
            return super.toString() + " [RT: " +
                returnType + " ], [NumArgs: " + 
                numArgs + " ], [ArgList: " +
                argList + " ]";
        }
    }

    //user defined data types TYPES
    private static class DataTypeInfo extends SymbolInfo{
        private boolean isAggregate;
        private String baseDataType;
        private int dim1;
        private int dim2;

        public DataTypeInfo(boolean isAggregate, String baseDataType, int dim1, int dim2){
            super(ASTTokens.TYPE, CURRENT_PROC_NAME, CURRENT_LEXICAL_LEVEL);
            setIsAggregate(isAggregate);
            setBaseDataType(baseDataType);
            setDimension1(dim1);
            setDimension2(dim2);
        }

        private void setIsAggregate(boolean isAggregate){
            this.isAggregate = isAggregate;
        }

        private void setBaseDataType(String baseDataType){
            this.baseDataType = baseDataType;
        }

        private void setDimension1(int dim1){
            this.dim1 = dim1;
        }

        private void setDimension2(int dim2){
            this.dim2 = dim2;
        }

        public String toString(){
            return super.toString() + " [isAggregate: " + isAggregate 
                    + " ], [baseDataType: " + baseDataType + " ], [Dim1: " +
                    dim1 + " ], [Dim2: " + dim2 + "] ";
        }
    }

    private static Hashtable<Symbol, SymbolInfo> ht = new Hashtable<Symbol, SymbolInfo>();
    private static void printSymbolTable(Hashtable<Symbol, SymbolInfo> ht){
        for(Symbol s : ht.keySet()){
            System.out.println(s + " : " + ht.get(s));
        } 
    }


    private static void handleNode(CommonTree node){
        String ASTLabel = node.getText();
        switch(ASTLabel){
            case "PROGRAM": break; //do nothing
            case "TYPES":
                            /*
                             * Process the list of "TYPES"
                             * expects children with label "TYPE"
                             * describing each type
                             */
                            if(node.getChildren() == null) break;
                            
                            setCurrentProcName(node);
                            
                            for(Object children : node.getChildren()){
                                CommonTree child = (CommonTree)children;
                                String name = "null";
                                for(Object sc: child.getChildren()){
                                    CommonTree subChildren = (CommonTree)sc;
                                    if(subChildren.childIndex == 0){
                                        name = subChildren.getText();
                                    }
                                    else if(subChildren.childIndex == 1){
                                        String dataType = subChildren.getText();
                                        if(dataType.equals("int") || dataType.equals("fixedpt")){
                                            ht.put(new Symbol(name), new DataTypeInfo(false, dataType, -1, -1)); 
                                        }
                                        else if(dataType.equals("array")){
                                            if(subChildren.getChildCount() == 3){
                                                int dim1 = Integer.parseInt(subChildren.getChild(0).getText());
                                                int dim2 = Integer.parseInt(subChildren.getChild(1).getText());
                                                String arrayDataType = subChildren.getChild(2).getText();
                                                ht.put(new Symbol(name), new DataTypeInfo(true, arrayDataType, dim1, dim2)); 
                                            }
                                            else if(subChildren.getChildCount() == 2){
                                                int dim1 = Integer.parseInt(subChildren.getChild(0).getText());
                                                String arrayDataType = subChildren.getChild(1).getText();
                                                ht.put(new Symbol(name), new DataTypeInfo(true, arrayDataType, dim1, -1)); 
                                            } 
                                        }
                                    }
                                }                     
                            }
                            break; 

            case "FUNCS": 
                            if(node.getChildren() == null) break; 
                            setCurrentProcName(node);
                            for(Object children: node.getChildren()){
                                CommonTree child = (CommonTree)children;
                                String name = "null";
                                String returnType = "null";
                                int numArgs = 0;
                                List<Arg> argList = Collections.emptyList();
                                for(Object sc:child.getChildren()){
                                    CommonTree subChildren = (CommonTree)sc;
                                   if(subChildren.childIndex == 0){
                                        returnType = subChildren.getText();
                                   }
                                   else if(subChildren.childIndex == 1){
                                        name = subChildren.getText(); 
                                   }
                                   else if(subChildren.childIndex == 2){
                                        if(subChildren.getChildren() == null); 
                                        //TODO params logic
                                   }
                                }
                                ht.put(new Symbol(name), new FunctionInfo(returnType, numArgs, argList ));
                            }
                            break;

            case "PARAMS":  break;

            case "VARS":
                            if(node.getChildren() == null) break;
                            for(Object children: node.getChildren()){
                                CommonTree child = (CommonTree)children;
                                String name = "null";
                                String returnType = "null";

                            }
                            break;

            case "STATEMENTS": break;

            case "BLOCK": break;

            case "FOR": break;

            case "INVOKE": break;

            case "EXPRS": break;

            case "EXPR": break;

            case "REFERENCE":  break;  
            default: break;
        }
    }


    private static void bfs(CommonTree root){
        Queue<CommonTree> q = new LinkedList<CommonTree>();
        q.add(root);

        while(q.peek() != null){
            CommonTree node = (CommonTree)q.remove();
            //System.out.println("Node: "+ node.getText());

            handleNode(node);

            if (node.getChildren() != null) {
                for(Object t: node.getChildren()){
                    if(t != null)
                        q.add((CommonTree)t);
                } 
            }
        }
    }

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
	            bfs(tree);
	            //print sample symbol table
	            System.out.println("***Symbol Table***");
	            printSymbolTable(ht);
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

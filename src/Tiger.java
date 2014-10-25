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
            this.next = Collections.EMPTY_LIST;
        }

        public String toString(){
            return "[Type: " + 
                type + "], [DP: " + 
                declaringProc + "], LL: " + 
                lexicalLevel + "], Chain: " +
                next;
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

        public VariableInfo(String declaringProc, 
                int lexicalLevel, String dataType, int value){
            super(ASTTokens.VAR, declaringProc, lexicalLevel);
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
                argList;
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
        System.out.println(ht); 
    }


    private static void handleNode(CommonTree node){
        String ASTLabel = node.getText();
        switch(ASTLabel){
            case "PROGRAM": break; //do nothing
            case "TYPES":
                            System.out.println("TYPES FOUND!");
                            //Process the list of "TYPES"
                            if(node.getChildren() == null) break;
                            System.out.println("Processing");
                            for(Object children : node.getChildren()){
                                CommonTree child = (CommonTree)children;
                                String type = "UserDefinedDataType";
                                String name = "NoNameDefined";
                                for(Object sc: child.getChildren()){
                                    CommonTree subChildren = (CommonTree)sc;
                                    if(subChildren.childIndex == 0){
                                        name = subChildren.getText();
                                        System.out.println("Child 0 " + name);
                                    }
                                    else if(subChildren.childIndex == 1){
                                        System.out.println("Child 1 ");
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


            case "FUNCTIONS": break;
            case "PARAMS":  break;
            case "VARIABLES": break;
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
        Queue q = new LinkedList();
        q.add(root);

        while(q.peek() != null){
            CommonTree node = (CommonTree)q.remove();
            System.out.println("Node: "+ node.getText());

            handleNode(node);

            if (node.getChildren() != null) {
                for(Object t: node.getChildren()){
                    if(t != null)
                        q.add((CommonTree)t);
                } 
            }
        }
    }

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
            //run bfs
            bfs(tree);
            //print sample symbol table
            System.out.println("Sample Hash Table");
            printSymbolTable(ht);


            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(tree);

            writeDotFile(args[1], st.toString(), StandardCharsets.UTF_8);

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
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

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

    private static class Args{
        String name;
        String type;

        public Args(String name, String type){
            this.name = name;
            this.type = type;
        }
    }

    private static  class Symbol{
        String name;
        String type;
        String declaringProc;//none for global variables
        int lexicalLevel;
        int func_num_args;//only applicable for functions
        List<Args> arg_list;//only applicable for functions
        
        Symbol next;

        public Symbol(String name, String type, String declaringProc, 
                      int lexicalLevel, int func_num_args, List<Args> arg_list){
            this.name = name;
            this.type = type;
            this.declaringProc = declaringProc;
            this.lexicalLevel = lexicalLevel;
            this.func_num_args = func_num_args;
            this.arg_list = arg_list;

            //is null for the first identifier occurence
            this.next = null;

        } 
            
        public String toString(){
            return name + " " + type + " " + declaringProc + " " 
                   + lexicalLevel + " " + func_num_args + " " + arg_list.size();
        }
    }

    private static Hashtable<String, Symbol> ht = new Hashtable<String, Symbol>();
    private static void printSymbolTable(Hashtable<String, Symbol> ht){
        System.out.println(ht); 
    }
    

    private static void bfs(CommonTree root){
        Queue q = new LinkedList();
        q.add(root);

        while(q.peek() != null){
            CommonTree node = (CommonTree)q.remove();
            System.out.println("Node: "+ node.getText());
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
            ht.put("test", new Symbol("test_name", "test_type", "test_proc",
                                      0, 0, Collections.EMPTY_LIST)
            ); 
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

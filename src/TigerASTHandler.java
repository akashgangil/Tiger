import org.antlr.runtime.tree.*;

import java.util.*;


public class TigerASTHandler{


    public static void handleNode(CommonTree node, Hashtable<TigerSymbol, TigerSymbolInfo> ht){
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

                            TigerUtil.setCurrentProcName(node);

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
                                            ht.put(new TigerSymbol(name), new TigerDataTypeInfo(false, dataType, -1, -1)); 
                                        }
                                        else if(dataType.equals("array")){
                                            if(subChildren.getChildCount() == 3){
                                                int dim1 = Integer.parseInt(subChildren.getChild(0).getText());
                                                int dim2 = Integer.parseInt(subChildren.getChild(1).getText());
                                                String arrayDataType = subChildren.getChild(2).getText();
                                                ht.put(new TigerSymbol(name), new TigerDataTypeInfo(true, arrayDataType, dim1, dim2)); 
                                            }
                                            else if(subChildren.getChildCount() == 2){
                                                int dim1 = Integer.parseInt(subChildren.getChild(0).getText());
                                                String arrayDataType = subChildren.getChild(1).getText();
                                                ht.put(new TigerSymbol(name), new TigerDataTypeInfo(true, arrayDataType, dim1, -1)); 
                                            } 
                                        }
                                    }
                                }                     
                            }
                            break; 

            case "FUNCS": 
                            if(node.getChildren() == null) break; 
                            TigerUtil.setCurrentProcName(node);
                            for(Object children: node.getChildren()){
                                CommonTree child = (CommonTree)children;
                                String name = "null";
                                String returnType = "null";
                                int numArgs = 0;
                                List<TigerArg> argList = Collections.emptyList();
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
                                ht.put(new TigerSymbol(name), new TigerFunctionInfo(returnType, numArgs, argList ));
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


}

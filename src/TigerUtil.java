import java.util.Queue;
import java.util.LinkedList;
import org.antlr.runtime.tree.*;

public class TigerUtil{

    public static String CURRENT_PROC_NAME = "GLOBAL";

    public static void bfs(CommonTree root){
        Queue<CommonTree> q = new LinkedList<CommonTree>();
        q.add(root);

        while(q.peek() != null){
            CommonTree node = (CommonTree)q.remove();
            //System.out.println("Node: "+ node.getText());

              //you need to pass in the hashtable as an arg too
//            TigerASTHandler.handleNode(node);

            if (node.getChildren() != null) {
                for(Object t: node.getChildren()){
                    if(t != null)
                        q.add((CommonTree)t);
                }
            }
        }
    }

    public static String getCurrentProcName(CommonTree node){
        CommonTree temp = node.parent;
        while(temp != null && !temp.getText().equals("FUNC")){
            temp = temp.parent;
        }
        //Since 0 is mandatory return type and 1 is the name
        return temp.getChild(1).getText();
    }

    public static int setCurrentProcName(CommonTree node){
        CURRENT_PROC_NAME = getCurrentProcName(node);
        return 1;
    }
}

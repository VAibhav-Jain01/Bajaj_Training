import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Binary_Tree_Right_Side {
       public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        int level=1;
        helper(root,list,level);
        return list;
    }

    public void helper(TreeNode root,List<Integer>list,int level){
               if(root==null){
                return ;
               }
            if(level>list.size()){
                list.add(root.val);
            }
            
            helper(root.right,list,level+1);
            helper(root.left,list,level+1);



    }
}

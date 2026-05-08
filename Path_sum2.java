import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Path_sum2 {
      public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(ans,temp,root,0,targetSum);
        return ans;
    }

    public void helper(List<List<Integer>>ans,List<Integer>temp,TreeNode root,int sum,int targetSum){
      
    if(root==null){
        return ;
    }
    sum+=root.val;
    temp.add(root.val);
    if(root.left==null&& root.right==null&& sum==targetSum){
        ans.add(new ArrayList<>(temp));
    }
    else{
        helper(ans,temp,root.left,sum,targetSum);
        helper(ans,temp,root.right,sum,targetSum);
    }
     temp.remove(temp.size()-1);

    }
}

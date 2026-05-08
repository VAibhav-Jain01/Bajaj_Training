import javax.swing.tree.TreeNode;

public class Diameter_of_Binary_Tree {
      int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
     diameter(root);
     return maxi;    
    
    }

    public int diameter(TreeNode root){
        if(root==null)return 0;

        int lh=diameter(root.left);
        int rh=diameter(root.right);
        maxi=Math.max(maxi,lh+rh);

        return 1+Math.max(lh,rh);
    }
}

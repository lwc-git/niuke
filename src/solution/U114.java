package solution;


import java.util.*;

public class U114 {
    public void flatten(TreeNode root) {
        TreeNode rs = new TreeNode(0);
        TreeNode curr = rs;
        traversal(root,curr);
        root.right = null;
        root.left = null;
        root = rs.right;
    }

    public void traversal(TreeNode root,TreeNode curr){
        curr.left = null;
        curr.right = new TreeNode(root.val);
        curr = curr.right;
        if(root.left!=null) traversal(root.left,curr);
        if(root.right!=null) traversal(root.right,curr);
    }

}

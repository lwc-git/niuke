package solution;

import java.util.ArrayList;
import java.util.List;

public class U94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        ArrayList<Integer> rs = new ArrayList<>();
        traversal(root,rs);
        return rs;

    }

    public void traversal(TreeNode root,List<Integer> rs){
        if(root.left!=null) traversal(root.left,rs);
        rs.add(root.val);
        if(root.right!=null) traversal(root.right,rs);

    }
}

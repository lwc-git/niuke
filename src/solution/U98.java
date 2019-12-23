package solution;

import java.util.ArrayList;
import java.util.List;

public class U98 {
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        else{
            ArrayList<Integer> rs = new ArrayList<>();
            traversal(rs,root);
            for(int i = 0;i<rs.size()-1;i++){
                if(rs.get(i)>=rs.get(i+1)) return false;
            }
            return true;
        }
    }

    public void traversal(List<Integer> rs,TreeNode root){
        if(root.left!=null) traversal(rs,root.left);
        rs.add(root.val);
        if(root.right!=null) traversal(rs,root.right);
    }
}

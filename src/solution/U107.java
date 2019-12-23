package solution;
import java.util.*;

public class U107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> rns = new LinkedList<>();
        List<TreeNode> currentList = new ArrayList<>();
        if(root!=null){
            currentList.add(root);
        }

        while(currentList.size()>0){
            List<TreeNode> nextList = new ArrayList<>();
            List<Integer> rs = new ArrayList<>();
            for(TreeNode currentNode:currentList){
                rs.add(currentNode.val);
                if(currentNode.left!=null) nextList.add(currentNode.left);
                if(currentNode.right!=null) nextList.add(currentNode.right);
            }
            rns.add(0,rs);
            currentList=nextList;
        }

        return rns;
    }
}

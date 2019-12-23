package solution;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class U102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return rs;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            rs.add(subList);
        }
        return rs;
    }
}

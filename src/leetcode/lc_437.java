package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2020/1/3 11:06
 */
public class lc_437 {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return help(root, sum, new ArrayList<>());
    }

    public int help(TreeNode root, int sum, List<Integer> list){
        int res = 0, val = root.val;
        for(int t : list){
            if(t + val == sum) res += 1;
        }
        list.add(val);
        if(val == sum) res += 1;
        if(root.left != null)
            res += help(root.left, sum, new ArrayList<>(list));
        if(root.right != null)
            res += help(root.right, sum, new ArrayList<>(list));
        return res;
    }
}

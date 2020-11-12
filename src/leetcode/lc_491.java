package leetcode;/**
 * @author lwc
 * @date 2020/9/21 14:57
 */

import java.util.*;

/**
 * @ClassName: leetcode.lc_491
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/9/21 14:57
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/9/21      lwc          v1.0.0               修改原因
 */
public class lc_491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        HashSet curSet = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(!curSet.contains(nums[i])){
                curSet.add(nums[i]);
                List<Integer> curList = new ArrayList<>();
                curList.add(nums[i]);
                help(i, curList, resList, nums);
            }
        }
        return resList;
    }

    public void help(int preIndex, List<Integer> curList, List<List<Integer>> resList, int[] nums){
        int preValue = nums[preIndex];
        HashSet curSet = new HashSet();
        for(int i = preIndex + 1; i < nums.length; i++){
            if(nums[i] >= preValue && !curSet.contains(nums[i])){
                curSet.add(nums[i]);
                List nextList = new ArrayList(curList);
                nextList.add(nums[i]);
                resList.add(nextList);
                help(i, nextList, resList, nums);
            }
        }
    }

}

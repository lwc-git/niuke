package leetcode;/**
 * @author lwc
 * @date 2020/10/22 15:56
 */

/**
 * @ClassName: leetcode.lc_494
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/10/22 15:56
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/10/22      lwc          v1.0.0               修改原因
 */
public class lc_494 {
    public int findTargetSumWays(int[] nums, int S) {
        return help(0, 0, S, nums);
    }

    public int help(int total, int index, int S, int[] nums){
        if(index == nums.length){
            if(total == S) return 1;
            else return 0;
        }
        return help(total + nums[index], index + 1, S, nums) + help(total - nums[index], index + 1, S, nums);
    }
}

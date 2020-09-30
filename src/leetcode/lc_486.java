package leetcode;/**
 * @author lwc
 * @date 2020/8/31 15:12
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: leetcode.lc_486
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/8/31 15:12
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/8/31      lwc          v1.0.0               修改原因
 */
public class lc_486 {
    public boolean PredictTheWinner(int[] nums) {
        return think(0, nums.length - 1, nums) >= 0;
    }
    public int think(int start, int end, int[] nums){
        if(start == end){
            return nums[start];
        }
        int startScore = nums[start] - think(start + 1, end, nums);
        int endScore = nums[end] - think(start, end - 1, nums);
        return Math.max(startScore, endScore);
    }
}

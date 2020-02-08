package leetcode;

/**
 * @author lwc
 * @date 2020/2/7 22:09
 */
public class lc_462 {
    public int minMoves2(int[] nums) {
        if(nums.length < 1) return 0;
        int total = 0, res = 0;
        for(int num : nums) total += num;
        int avg = total / nums.length;
        for(int num : nums) res += Math.abs(num - avg);
        return res;
    }
}

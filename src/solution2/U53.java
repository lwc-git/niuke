package solution2;

/**
 * @author lwc
 * @date 2019/10/9 10:07
 */
public class U53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int rs = res;
        for(int i = 1;i < nums.length;i++) {
            res = Math.max(nums[i]+res,nums[i]);
            if(res > rs) rs = res;
        }
        return rs;
    }

}

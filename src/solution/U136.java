package solution;

import java.util.Arrays;

public class U136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i==nums.length-1) return nums[i];
            if(nums[i]==nums[i+1]) i=i+2;
            else return nums[i];
        }
        return -1;
    }
}

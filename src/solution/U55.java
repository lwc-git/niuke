package solution;

public class U55 {
    public boolean canJump(int[] nums) {
        int position = 0;
        return jump(nums,position);

    }

    public boolean jump(int []nums, int position){
        if(position>nums.length-1) return false;
        if(position==nums.length-1) return true;
        int jumpLen = nums[position];
        while(jumpLen>0)
            if(jump(nums,position+(jumpLen--))) return true;
        return false;
    }
}

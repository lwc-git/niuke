package solution;

public class U152 {
    public int maxProduct(int[] nums) {
        int maxValue = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            currentMax = Math.max(currentMax*nums[i],nums[i]);
            currentMin = Math.min(currentMin*nums[i],nums[i]);
            maxValue = Math.max(currentMax,maxValue);
        }
        return maxValue;
    }
}

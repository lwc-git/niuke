package solution;

public class U75 {
    public void sortColors(int[] nums) {
        int left = 0; int right = nums.length-1;
        for(int i = 0;i<nums.length;i++){
            while(nums[i]==2 && i<right) swap(i,right--,nums);
            while(nums[i]==0 && i>left) swap(i,left++,nums);
        }

    }

    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

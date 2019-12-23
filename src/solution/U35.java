package solution;

public class U35 {
    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{2,4,5,6,7},4));
    }

    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length,target);
    }

    public static int binarySearch(int[] nums,int left,int right,int target){
        if(left < right) {
            int mid = (left + right) / 2;
            System.out.println(mid);
            if (nums[mid]== target) return mid;
            else if(nums[mid]<target)
                return binarySearch(nums,mid+1,right,target);
            else
                return binarySearch(nums,left,mid,target);

        }
        return left;
    }

}

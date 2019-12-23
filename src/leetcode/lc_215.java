package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author lwc
 * @date 2019/11/20 20:52
 */
public class lc_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int heap(int[] nums, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int n : nums){
            heap.add(n);
            if(heap.size() > k)
                heap.poll();
        }
        return heap.poll();
    }

    public int fastSelect(int[] nums, int k){
        int left = 0, right = nums.length - 1;
        int mid = -1, pos = nums.length - k;
        while(mid != pos){
            mid = find(left, right, nums);
            if(mid > pos) right = mid - 1;
            else left = mid + 1;
        }
        return nums[mid];
    }

    //left指针先走，还是right指针先走取决于所选的参考目标。这里我们选择left作为参考目标，right指针先走
    public int find(int left, int right, int[] v){
        int mid = left;
        while(left < right) {
            while (left < right && v[right] > v[mid]) right--;
            while (left < right && v[left] <= v[mid]) left++;
            swap(left, right, v);
        }
        swap(mid, left, v);
        return left;
    }
    public void swap(int v1, int v2, int[] v){
        int temp = v[v1];
        v[v1] = v[v2];
        v[v2] = temp;
    }

}

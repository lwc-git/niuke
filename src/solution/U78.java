package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        rs.add(new ArrayList<>());
        getSets(rs,nums);
        return rs;
    }

    public void getSets(List<List<Integer>> rs,int []nums){
        if(nums.length>0) {
            int num = nums[nums.length - 1];
            int length = rs.size();
            for (int i = 0; i < length; i++) {
                List<Integer> list = new ArrayList<>(rs.get(i));
                list.add(num);
                rs.add(list);
            }
            int[] next = Arrays.copyOfRange(nums, 0, nums.length - 1);
            getSets(rs, next);
        }
    }
}

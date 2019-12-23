package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class U46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        getResult(rs,new ArrayList<>(),nums);
        return rs;
    }

    public void getResult(List<List<Integer>> rs,List<Integer> next,int[] nums){
        if(next.size()==nums.length) rs.add(new ArrayList<>(next));
        else{
            for(int i =0;i<nums.length;i++){
                if(next.contains(nums[i])) continue;
                next.add(nums[i]);
                getResult(rs,next,nums);
                next.remove(next.size()-1);
            }
        }
    }

}

package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(candidates);
        getResult(rs,new ArrayList<Integer>(),candidates,target,0);
        return rs;
    }

    public void getResult(List<List<Integer>> result,List<Integer> curr,int[] candidates,int target,int start){
        if(target>0){
            for(int i=start;i<candidates.length;i++){
                curr.add(candidates[i]);
                getResult(result,curr,candidates,target-candidates[i],i);
                curr.remove(curr.size()-1);
            }
        }
        else if(target==0){
            result.add(new ArrayList<>(curr));
        }
    }
}

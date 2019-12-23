package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/17 9:21
 */
public class U77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rs = new ArrayList<>();
        backtrack(rs,new ArrayList<>(),1, n, k);
        return rs;
    }

    public void backtrack(List<List<Integer>> rs, List<Integer> tempList, int start, int n, int k){
        if(tempList.size() == k)
            rs.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i <= n; i++) {
                tempList.add(i);
                backtrack(rs, tempList, i + 1, n, k);
                tempList.remove(tempList.size()-1);
            }
        }
    }

}

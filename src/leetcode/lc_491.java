package leetcode;/**
 * @author lwc
 * @date 2020/9/21 14:57
 */

import java.util.*;

/**
 * @ClassName: leetcode.lc_491
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/9/21 14:57
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/9/21      lwc          v1.0.0               修改原因
 */
public class lc_491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> total = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            List<Integer> t1 = new ArrayList<>();
            t1.add(nums[i]);
            total.add(t1);
            int size = total.size();
            for(int j = 0; j < size; j++){
                List<Integer> t2 = total.get(i);
                for(int k = i + 1; k < nums.length; k++){

                }
            }
        }



        Collections.sort(total, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if(o1.size() != o2.size()) {
                    return o1.size() - o2.size();
                }
                else{
                    for(int i = 0; i < o1.size(); i++){
                        if(o1.get(i) > o2.get(i)) return 1;
                        else if(o1.get(i) < o2.get(i)) return -1;
                    }
                }
                return 0;
            }
        });
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new lc_491().findSubsequences(new int[]{4,6,7,7}));
    }
}

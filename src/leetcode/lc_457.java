package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author lwc
 * @date 2020/2/2 14:42
 */
public class lc_457 {
    public boolean circularArrayLoop(int[] nums) {
        int len = nums.length;
        if(len < 2) {
            return false;
        }
        int cur = 0;
        HashSet<Integer> set = new HashSet<>();
        while(! set.contains(cur)){
            set.add(cur);
            cur = (cur + nums[cur]) % len;
            if(cur < 0) cur += len;
        }
    }
}

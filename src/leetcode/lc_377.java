package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/15 0:09
 */
public class lc_377 {

    public int combinationSum42(int[] nums, int target) {
        Arrays.sort(nums);
        int[] v = new int[target+1];
        v[0] = 1;
        for(int i = 1; i <= target; i++) {
            int res = 0;
            for(int j = 0; j < nums.length && nums[j] <= i; j++){
                res += v[i-nums[j]];
            }
            v[i] = res;
        }
        return v[target];
    }

    public int combinationSum4(int[] nums, int target) {
        Map<String,Integer> map = new HashMap<>();
        map.put("pre", 0);
        backTrack(nums, target, map);
        return map.get(0 + "," + target);
    }

    public int backTrack(int[] nums, int target, Map<String,Integer> map){
        if(target == 0) return 1;
        int pre = map.get("pre");
        String key = pre + "," + target;
        if(!map.containsKey(key)) {
            int res = 0;
            for (int num : nums) {
                if (num == pre) continue;
                for (int j = 1; j <= target / num; j++) {
                    map.put("pre", num);
                    res += backTrack(nums, target - j * num, map);
                    map.put("pre", pre);
                }
            }
            map.put(key, res);
        }
        return map.get(key);
    }
}

package solution;

import java.util.HashMap;
import java.util.Map;

public class U169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            int key = nums[i];
            if(map.containsKey(key)){
                int value = map.get(key);
                map.put(key,value+1);
            }
            else map.put(key,1);
            if(map.get(key)>n/2) return key;
        }
        return -1;
    }
}

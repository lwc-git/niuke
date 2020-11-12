package leetcode;/**
 * @author lwc
 * @date 2020/10/23 11:06
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: leetcode.lc_496
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/10/23 11:06
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/10/23      lwc          v1.0.0               修改原因
 */
public class lc_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) map.put(nums2[i],i);
        int[] v = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int t = -1;
            for(int j = map.get(nums1[i]); j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    t = nums2[j];
                    break;
                }
            }
            v[i] = t;
        }
        return v;
    }
}

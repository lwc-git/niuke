package leetcode;/**
 * @author lwc
 * @date 2020/6/8 11:08
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: leetcode.lc_485
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/6/8 11:08
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/6/8      lwc          v1.0.0               修改原因
 */
public class lc_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0;
        int soFar = 0;
        for(int num : nums){
            if(num == 0){
                soFar = Math.max(soFar, cur);
                cur = 0;
            }
            else{
                cur++;
            }
        }
        soFar = Math.max(soFar, cur);
        return soFar;
    }
}
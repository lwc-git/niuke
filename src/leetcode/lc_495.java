package leetcode;/**
 * @author lwc
 * @date 2020/10/23 10:27
 */

/**
 * @ClassName: leetcode.lc_495
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/10/23 10:27
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/10/23      lwc          v1.0.0               修改原因
 */
public class lc_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int length = timeSeries.length;
        if(length == 0) return 0;
        if(length == 1) return duration;
        int total = 0;
        for(int i = 1; i < length; i++){
            if(timeSeries[i] - timeSeries[i-1] >= duration){
                total += duration;
            }
            else{
                total = total + timeSeries[i] - timeSeries[i-1];
            }
        }
        total += duration;
        return total;
    }
}

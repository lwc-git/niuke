package leetcode;/**
 * @author lwc
 * @date 2020/10/22 15:17
 */

/**
 * @ClassName: leetcode.lc_492
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/10/22 15:17
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/10/22      lwc          v1.0.0               修改原因
 */
public class lc_492 {
    public int[] constructRectangle(int area) {
        int mid = (int)Math.sqrt(area);
        for(int i = mid; i <= area; i++){
            if(area%mid == 0 && mid >= area/mid){
                int[] a = new int[]{mid,area/mid};
                return a;
            }
            else{
                mid++;
            }
        }
        return null;
    }
}

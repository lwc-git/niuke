package leetcode;/**
 * @author lwc
 * @date 2020/6/5 14:49
 */

/**
 * @ClassName: leetcode.lc_480
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/6/5 14:49
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/6/5      lwc          v1.0.0               修改原因
 */
public class lc_480 {
    public String licenseKeyFormatting(String S, int K) {
        S = S.replace("-","");
        S = S.toUpperCase();
        int stLen = S.length()%K == 0 ? K : S.length() - S.length()/K*K;
        StringBuffer str = new StringBuffer(S);
        for(int i = stLen; i < str.length(); i = i+K+1){
            str = str.insert(i,"-");
        }
        return str.toString();
    }
}

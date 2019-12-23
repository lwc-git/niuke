package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/21 11:19
 */
public class lc_132 {
    public int minCut(String s) {
        char[] c = s.toCharArray();
        List<Integer>[] v = new List[26];
        for(int i = 0; i < c.length; i++){
            if(v[c[i] - 'a'] == null)
                v[c[i] - 'a'] = new ArrayList();
            v[c[i] - 'a'].add(i);
        }

        int[] dp = new int[c.length];
        int[][] dp2 = new int[c.length][c.length];
        for(int i = 1; i < c.length; i++){
            int res = dp[i-1] + 1;
            for(int index : v[c[i] - 'a']){
                if(index < i){
                    if(dp2[index][i] == 1 || isPalindrome(c, index, i) == 1){
                        dp2[index][i] = 1;
                        int cur = index > 0 ? dp[index - 1] + 1 : 0;
                        res = Math.min(cur, res);
                        if(res == 0) break;
                    }
                }
                else break;
            }
            dp[i] = res;
        }
        return dp[c.length - 1];
    }

    public int isPalindrome(char[] c, int l, int r){
        for(; l <= r; l++,r--) {
            if (c[l] != c[r]) return 0;
        }
        return 1;
    }
}

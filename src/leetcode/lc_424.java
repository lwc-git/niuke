package leetcode;

/**
 * @author lwc
 * @date 2019/12/26 21:32
 */
public class lc_424 {
    public int characterReplacement(String s, int k) {
        if(s.length() < 1) return 0;
        char[] c = s.toCharArray();
        int max = 1;
        int[] dp = new int[c.length];
        int[] v = new int[c.length];
        for(int i = 1; i < c.length; i++){
            if(i <= k) dp[i] = i + 1;
            else{
                v[i] = help(c, i, k);
                if(c[i] == c[i-1])
                    dp[i] = Math.max(v[i-1] + 1, v[i]);
                else
                    dp[i] = Math.max(1 + help(c, i-1, k-1), v[i]);
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public int help(char[] c, int i, int k){
        char ch = c[i];
        int j = i, m = k;
        for(; j >= 0; j--){
            if(c[j] != ch) m--;
            if(m < 0) break;
        }
        return i - j;
    }

    public static void main(String[] args) {
        System.out.println(new lc_424().characterReplacement("AABABBA",1));
    }
}

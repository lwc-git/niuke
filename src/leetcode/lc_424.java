package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/12/26 21:32
 */
public class lc_424 {
    public int characterReplacement(String s, int k) {
        if(s.length() <= k + 1) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for(char ch : c) map.put(ch, map.getOrDefault(ch, 0) + 1);
        int max = k + 1;
        for(char ch : map.keySet()){
            if(map.get(ch) + k <= max) continue;
            max = Math.max(help(c, ch, k), max);
        }
        return max;
    }

    public int help(char[] c, char ch, int k){
        int left = 0, right = 0, max = 0;
        while(right < c.length){
            while(right < c.length && k >= 0){
                if(c[right++] != ch) k--;
            }
            max = Math.max(max, right - left);
            while(left < c.length && k < 0){
                if(c[left++] != ch) k++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new lc_424().characterReplacement("ABAB",2));
    }
}

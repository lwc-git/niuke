package leetcode;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/12/27 10:02
 */
public class lc_076 {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        int mark = t.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int min = s.length() + 1;
        int left = 0, right = 0;
        int l = 0, r = 0;
        char[] c = s.toCharArray();
        String str = "";
        while(right < c.length){
            while(mark > 0 && right < c.length){
                if(map.containsKey(c[right])){
                    map.put(c[right], map.get(c[right]) - 1);
                    if(map.get(c[right]) >= 0) mark--;
                }
                right++;
            }
            if(mark == 0){
                while(left < c.length){
                    if(map.containsKey(c[left])){
                        map.put(c[left], map.get(c[left]) + 1);
                        if(map.get(c[left]) > 0) break;
                    }
                    left++;
                }
                if(right - left < min){
                    min = right - left;
                    l = left; r = right;
                }
                left++;
                mark++;
            }
        }
        return s.substring(l, r);
    }
}

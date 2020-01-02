package leetcode;

/**
 * @author lwc
 * @date 2020/1/2 16:32
 */
public class lc_434 {
    public int countSegments(String s) {
        if(s.isEmpty()) return 0;
        int count = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] == ' ')
                count++;
        }
        return count + 1;
    }
}

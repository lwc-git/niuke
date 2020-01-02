package leetcode;

/**
 * @author lwc
 * @date 2020/1/2 16:32
 */
public class lc_434 {
    public int countSegments(String s) {
        int count = 0;
        for(char ch : s.toCharArray()){
            if(! Character.isLetter(ch))
                count++;
        }
        return count + 1;
    }
}

package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class U17 {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits.isEmpty()) return result;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.offerLast("");
        for(int i = 0;i<digits.length();i++){
            int n = Character.getNumericValue(digits.charAt(i));
            while(result.peekFirst().length()==i){
                String s = result.pollFirst();
                char[] chars = mapping[n].toCharArray();
                for(char c:chars){
                    result.offerLast(s+c);
                }
            }
        }
        return result;
    }
}

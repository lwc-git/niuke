package solution;

import java.util.Arrays;
import java.util.List;

public class U139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s=="" || s.isEmpty()) return true;
        for(int i = 1;i<=s.length();i++){
            if(wordDict.contains(s.substring(0,i)))
                if(wordBreak(s.substring(i),wordDict)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        U139 u139 = new U139();
        boolean flag = u139.wordBreak("aaaaaaa", Arrays.asList("aaa","aaaa"));
        System.out.println(flag);
    }
}

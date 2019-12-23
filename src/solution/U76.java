package solution;

import java.util.HashMap;
import java.util.Map;

public class U76 {
    public String minWindow(String s, String t) {
        if(s==null || s.isEmpty() || s.length()<t.length()|| t==null || t.isEmpty())
            return "";

        //将t中字符数量记录到map表中
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }

        //双指针，用来对s进行定位
        int p1 = 0,p2 = 0;
        int count = 0,minLength = s.length()+1;
        int left = 0;


        char c;
        while(p1<s.length()){
            c = s.charAt(p1);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)-1);
                if(map.get(c)>=0) count++;
            }
            while(count==t.length()){
                if(p1-p2+1<minLength){
                    left = p2;
                    minLength = p1-p2+1;
                }

                c = s.charAt(p2);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                    if(map.get(c)>0) count--;
                }
                p2++;
            }
            p1++;
        }
        if(minLength>s.length()) return "";

        return s.substring(left,left+minLength);

    }
}

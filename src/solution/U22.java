package solution;

import java.text.AttributedString;
import java.util.*;

public class U22 {
    public static void main(String[] args) {
        U22 u22 = new U22();
        u22.generateParenthesis(3);
    }

    public List<String> generateParenthesis(int n) {
        LinkedList<String> rs = new LinkedList<>();
        LinkedList<List> record = new LinkedList<>();
        rs.offerLast("(");
        record.offerLast(Arrays.asList(1,0));
        for(int i = 1;i<n*2+1;i++){
            while(rs.peekFirst().length()!=i){
                String s = rs.pollFirst();
                List l = record.pollFirst();
                int left = (Integer)l.get(0);
                int right = (Integer)l.get(1);

                if(left<n){
                    rs.offerLast(s+"(");
                    record.offerLast(Arrays.asList(left+1,right));
                }
                if(right<n&&left>right){
                    rs.offerLast(s+")");
                    record.offerLast(Arrays.asList(left,right+1));
                }
            }
        }
        return rs;
    }
}

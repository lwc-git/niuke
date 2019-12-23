package solution;

public class U32 {
    public static void main(String[] args) {
        U32 u32 = new U32();
        u32.longestValidParentheses("(()");
    }

    public int longestValidParentheses(String s) {
        int rs = 0;
        for(int i = 0;i<s.length();i++){
            int length = findParentheses(s,i);
            if(length>=rs) rs = length;
        }
        System.out.println(rs);
        return rs;
    }
    public int findParentheses(String s,int begin){
        int length=0,left=0,right=0;
        for(int i=begin;i<s.length();i++){
            if(s.charAt(i)=='(') left++;
            else
            {
                if(left<=right) return length;
                else right++;
            }
            if(left==right) length=left+right;
        }
        return length;
    }
}

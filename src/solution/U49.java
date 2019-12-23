package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U49 {
    public static void main(String[] args) {
        U49 u49 = new U49();
        u49.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rs = new ArrayList<>();
        List<char[]> chars = new ArrayList<>();
        for(int i = 0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            int getSeq = -1;
            for(int j = 0;j<chars.size();j++){
                if(Arrays.equals(chars.get(j),c)) {
                    getSeq = j;
                    break;
                }
            }
            if(getSeq==-1){
                chars.add(c);
                rs.add(new ArrayList<>(Arrays.asList(strs[i])));
            }
            else rs.get(getSeq).add(strs[i]);
        }
        return rs;
    }
}

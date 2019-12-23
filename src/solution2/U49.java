package solution2;

import java.util.*;

/**
 * @author lwc
 * @date 2019/10/8 10:14
 */
public class U49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> listMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] tempChars = strs[i].toCharArray();
            Arrays.sort(tempChars);
            String str = new String(tempChars);
            if (!listMap.containsKey(str)) listMap.put(str, new ArrayList<>());
            listMap.get(str).add(strs[i]);
        }
        return new ArrayList<>(listMap.values());
    }
}

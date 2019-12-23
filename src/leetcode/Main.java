package leetcode;

import javafx.util.Pair;
import java.util.*;

/**
 * @author lwc
 * @date 2019/12/11 9:14
 */
public class Main {

    static int N, m;
    static int[] v, p;
    static Map<Integer,LinkedList<Integer>> subMap;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt(); m = input.nextInt();
        subMap = new HashMap<>();
        v = new int[m+1]; p = new int[m+1];
        for(int i = 1; i <= m; i++){
            v[i] = input.nextInt();
            p[i] = input.nextInt();
            int q = input.nextInt();
            if(q == 0) subMap.put(i, new LinkedList<>());
            else subMap.get(q).add(i);
        }
        List<Integer> curList = new ArrayList<>(subMap.keySet());
        Map<String,Integer> map = new HashMap<>();
        System.out.println(help(curList, N, m, map, 0));
    }

    public static int help(List<Integer> curList, int money, int count, Map<String,Integer> map, int start) {
        int v1 = 0, v2 = 0;
        int size = curList.size();

        if(start >= size) return 0;
        int mark = curList.get(start);
        String curKey = mark + "," + money + "," + count;
        if (map.containsKey(curKey)) return map.get(curKey);

        if(count > 0) {
            v1 = help(curList, money, count, map, start + 1);
            if (money >= v[mark]) {
                List<Integer> temp = new ArrayList<>(curList);
                List<Integer> sub = subMap.get(mark);
                if (sub != null && sub.size() > 0)
                    temp.addAll(start + 1, sub);
                v2 = v[mark] * p[mark] + help(temp, money - v[mark], count - 1, map, start + 1);
            }
        }
        map.put(curKey, Math.max(v1, v2));
        return Math.max(v1, v2);
    }
}

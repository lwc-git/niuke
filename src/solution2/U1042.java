package solution2;

import java.util.*;

/**
 * @author lwc
 * @date 2019/10/14 17:10
 */
public class U1042 {

    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] v = new int[N];
        int[][] visit = new int[N][5];
        List<Integer>[] array = new List[N];
        for (int i = 0; i < N; i++)
            array[i] = new ArrayList();
        for (int[] path : paths) {
            int x = Math.min(path[0], path[1]) - 1;
            int y = Math.max(path[0], path[1]) - 1;
            array[x].add(y);
        }
        for (int i = 0; i < N; i++) {
            if (v[i] == 0) v[i] = 1;
            int min = 1;
            while (min == v[i]) min++;
            for (int value : array[i]) {
                if (v[value] == 0) v[value] = min;
                if (v[value] == v[i]) {
                    int k = v[value]+1;
                    while (k == v[i] || visit[value][k] != 0) k++;
                    v[value] = k;
                }
                visit[value][v[i]] = 1;
            }
        }
        return v;
    }


}

package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2020/1/10 11:32
 */
public class lc_447 {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j = i+1; j < points[0].length; j++){
                int x2 = points[j][0];
                int y2 = points[j][0];
                int val = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
        

    }
}

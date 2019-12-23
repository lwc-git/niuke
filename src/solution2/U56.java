package solution2;

import java.util.*;

/**
 * @author lwc
 * @date 2019/10/10 9:49
 */
public class U56 {
    public int[][] merge(int[][] intervals) {


        if(intervals.length < 1) return intervals;
        int min = Integer.MAX_VALUE, max = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int v1 = intervals[i][0];
            int v2 = intervals[i][1];
            if(map.containsKey(v1)) map.put(v1,Math.max(v2,map.get(v1)));
            else map.put(v1,v2);
            if(v1 <= min){
                min = v1;
                max = map.get(v1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getKey()<=max) max = Math.max(entry.getValue(),max);
            else {
                list.add(new int[]{min,max});
                min = entry.getKey();
                max = entry.getValue();
            }
        }
        list.add(new int[]{min,max});

        return list.toArray(new int[0][2]);
    }



    public int[][] merger(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort by ascending starting point
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            else {                             // Disjoint intervals, add the new interval to the list
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

}

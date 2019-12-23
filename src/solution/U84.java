package solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class U84 {
    public int largestRectangleArea(int[] heights) {
        return getRectangleArea(0,heights.length,heights);
    }

    int [][]rmq;
    public U84(int []a){
        int n = a.length;
        rmq = new int[n][10];
        for(int i = 0;i<n;i++) rmq[i][0] = i;

        for(int j = 1;(1<<j)<=n;j++){
            for(int i = 0;i+(1<<j)<=n;i++){
                rmq[i][j] = Math.min(a[rmq[i][j-1]],a[rmq[i+(1<<(j-1))][j-1]]);
            }
        }
    }
    int search(int l, int r){
        int k = (int)(Math.log(r-l+1)/Math.log(2));
        return Math.min(rmq[l][k],rmq[r-(1<<k)+1][k]);
    }

    public int getRectangleArea(int start,int end,int[] heights){
        if(end<=start) return 0;
        else{
            int index = search(start,end-1);
            int area = (end-start)*heights[index];
            return Collections.max(Arrays.asList(getRectangleArea(0,index,heights),area,getRectangleArea(index+1,end,heights)));
        }
    }
}

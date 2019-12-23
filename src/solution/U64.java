package solution;

import java.util.*;

public class U64 {
    public static void main(String[] args) {
        U64 u64 = new U64();
        u64.minPathSum(new int[][]{{1,2,5},{3,2,1}});
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int length = m*n-1;
        Deque<List<Integer>> sums = new ArrayDeque<>();
        sums.add(new ArrayList<Integer>(Arrays.asList(0,grid[0][0])));
        int minSum = Integer.MAX_VALUE;

        while(!sums.isEmpty()){
            List<Integer> list = sums.poll();
            int offset = list.get(0);
            int sum = list.get(1);
            if(offset==length) {
                if (sum < minSum) minSum = sum;
            }
            else{
                int i = offset/n,j = offset%n;
                if(j<n-1) sums.offer(new ArrayList<>(Arrays.asList(offset+1,sum+grid[i][j+1])));
                if(i<m-1) sums.offer(new ArrayList<>(Arrays.asList(offset+n,sum+grid[i+1][j])));
            }
        }
        return minSum;
    }
}

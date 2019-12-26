package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/25 10:27
 */
public class lc_417 {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> lst = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0)
            return lst;
        int x = matrix.length, y = matrix[0].length;
        int[][] v1 = new int[x][y];
        int[][] v2 = new int[x][y];
        LinkedList<int[]> queue = new LinkedList<>();

        //太平洋
        for(int i = 0; i < y; i++) queue.push(new int[]{0, i});
        for(int i = 0; i < x; i++) queue.push(new int[]{i, 0});
        help(queue, matrix, v1);

        //大西洋
        for(int i = 0; i < y; i++) queue.push(new int[]{x - 1, i});
        for(int i = 0; i < x; i++) queue.push(new int[]{i, y - 1});
        help(queue, matrix, v2);

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(v1[i][j] == 1 && v2[i][j] == 1)
                    lst.add(Arrays.asList(i, j));
            }
        }
        return lst;
    }

    public void help(LinkedList<int[]> queue, int[][] m, int[][] v){
        while(!queue.isEmpty()){
            int[] temp = queue.pop();
            int i = temp[0], j = temp[1];
            v[i][j] = 1;
            if(i - 1 >= 0 && v[i-1][j] == 0 && m[i-1][j] >= m[i][j])
                queue.push(new int[]{i-1, j});
            if(i + 1 < m.length && v[i+1][j] == 0 && m[i+1][j] >= m[i][j])
                queue.push(new int[]{i+1, j});
            if(j - 1 >= 0 && v[i][j-1] == 0 && m[i][j-1] >= m[i][j])
                queue.push(new int[]{i, j-1});
            if(j + 1 < m[0].length && v[i][j+1] == 0 && m[i][j+1] >= m[i][j])
                queue.push(new int[]{i, j+1});
        }
    }

    public static void main(String[] args) {
        System.out.println(new lc_417().pacificAtlantic(new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        }));
    }
}
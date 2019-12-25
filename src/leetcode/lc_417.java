package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/25 10:27
 */
public class lc_417 {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> lst = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0)
            return lst;
        int x = matrix.length, y = matrix[0].length;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){

            }
        }
        return lst;
    }

    public void lHelp(int[][] m, int x, int y, int[][] v){

    }

    public static void main(String[] args) {
        System.out.println(new lc_417().pacificAtlantic(new int[][]{
                {1,2,3},
                {8,9,4},
                {7,6,5},
        }));
    }
}

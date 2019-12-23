package solution2;

public class U48 {
    public void rotate(int[][] matrix) {
        int x = matrix[0].length;
        int y = matrix.length;
        int [][]v = new int[x][y];

        int i = 0, j = 0;
        while(j < y){
            for(i = 0;i < x; i++){
                v[j][x - i - 1] = matrix[i][j];
            }
            j++;
        }
       matrix = v;
    }




}



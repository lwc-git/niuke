package solution;

import java.util.Queue;
import java.util.Stack;

public class U200 {
    char[][] grid;
    boolean [][]record;
    int n,m;

    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        this.grid = grid;
        n = grid[0].length;
        m = grid.length;
        record = new boolean[m][n];


        int result = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(record[i][j]==false && grid[i][j]=='1'){
                    record[i][j]=true;
                    result+=1;
                    islands(i,j);
                }
            }
        }
        return result;
    }

    public void islands(int i,int j){
        if(i+1<m && record[i+1][j]==false && grid[i+1][j]=='1'){
            record[i+1][j]=true;
            islands(i+1,j);
        }
        if(i-1>=0 && record[i-1][j]==false && grid[i-1][j]=='1'){
            record[i-1][j]=true;
            islands(i-1,j);
        }
        if(j+1<n && record[i][j+1]==false && grid[i][j+1]=='1'){
            record[i][j+1]=true;
            islands(i,j+1);
        }
        if(j-1>=0 && record[i][j-1]==false && grid[i][j-1]=='1'){
            record[i][j-1]=true;
            islands(i,j-1);
        }
    }

    public static void main(String[] args) {
        char[][]grid = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        U200 u200 = new U200();
        System.out.println(u200.numIslands(grid));
    }
}

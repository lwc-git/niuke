package leetcode;

/**
 * @author lwc
 * @date 2019/12/30 16:02
 */
public class lc_427 {
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    };

    public Node construct(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0){
            return null;
        }
        return help(grid, 0, 0, grid.length - 1, grid[0].length - 1);
    }

    public Node help(int[][] grid, int o1, int o2, int x, int y){
        if(same(grid, o1, o2, x, y) == 1){
            return new Node(grid[o1][o2] == 1, true, null, null, null, null);
        }
        int m1 = o1 + x / 2;
        int m2 = o2 + y / 2;
        Node topLeft = help(grid, o1, o2, x / 2, y / 2);
        Node topRight = help(grid, x - x / 2, o2, x / 2, y / 2);
        return null;
    }


    public int same(int[][] v, int o1, int o2, int x, int y){
        int mark = v[o1][o2];
        for(int i = o1; i <= o1 + x; i++){
            for(int j = o2; j <= o2 + y; j++){
                if(v[i][j] != mark){
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new lc_427().construct(new int[][]{
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0},
                {1,1,1,1,0,0,0,0}
        }));
    }
}

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
        return help(grid, 0, grid.length, 0, grid[0].length);
    }

    public Node help(int[][] grid, int tl, int tr, int bl, int br){
        if(tl == tr || bl == br) {
            return null;
        }
        if(tr - tl == 1 && br - bl == 1){
            return new Node(grid[tl][bl] == 1, true,  null, null, null, null);
        }

        int tm = (tr + tl - 1) / 2 + 1;
        int bm = (br + bl - 1) / 2 + 1;

        Node tln = help(grid, tl, tm, bl, bm);
        Node trn = help(grid, tm, tr, bl, bm);
        Node bln = help(grid, tl, tm, bm, br);
        Node brm = help(grid, tm, tr, bm, br);
        Node root = new Node(false, false, tln, trn, bln, brm);
        return root;
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

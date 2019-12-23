package solution;

import java.util.*;

public class U130 {

    public static void main(String[] args) {
        char[][]board = {{'X','X','O','X'},{'X','X','O','X'},{'X','X','O','X'},{'X','X','O','X'}};
        U130 u130 = new U130();
        u130.solve(board);
    }

    public void solve(char[][] board) {
        ArrayList<LinkedList<Integer>> rns = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            LinkedList<Integer> linkedList = new LinkedList<>();
            for(int j=0;j<board[i].length;j++){
                if((i==0||j==0||i==board.length-1||j==board[i].length-1)&& board[i][j]=='O'){
                    linkedList.add(j);
                }
            }
            rns.add(linkedList);
        }

        ArrayList<LinkedList<Integer>> ans = new ArrayList<>();
        ans.addAll(rns);
        for(int i = 0;i<ans.size();i++){
            for(int j = 0;j<ans.get(i).size();j++){
                search(board,i,ans.get(i).get(j),rns);
            }
        }


        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(rns.size()>0 && rns.get(i).size()>0 && rns.get(i).contains(j)) board[i][j]='O';
                else board[i][j] = 'X';
            }
        }
    }

    public void search(char[][]board,int x,int y,ArrayList<LinkedList<Integer>> list){
        if(board[x][y]=='O'&& !list.get(x).contains(y))
            list.get(x).add(y);
        if(x+1<board.length && board[x+1][y]=='O' && !list.get(x+1).contains(y))
            search(board,x+1,y,list);
        if(x-1>=0 && board[x-1][y]=='O' && !list.get(x-1).contains(y))
            search(board,x-1,y,list);
        if(y+1<board[x].length && board[x][y+1]=='O' && !list.get(x).contains(y+1)) {
            search(board, x, y+1, list);
        }
        if(y-1>=0 && board[x][y-1]=='O' && !list.get(x).contains(y-1))
            search(board,x,y-1,list);
    }
}

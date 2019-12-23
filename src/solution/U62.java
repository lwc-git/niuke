package solution;


import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;

public class U62 {
    public static void main(String[] args) {
        U62 u62 = new U62();
        System.out.println(u62.uniquePath(7,3));
    }

    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        if(m>1 && n>1) return uniquePaths(m-1,n)+uniquePaths(m,n-1);
        return -1;
    }

    //Cmn m!/n!*(m-n)!  m消去n，从n+1开始乘 从1开始除， m比m-n多n位，这是控制循环的条件
    public int uniquePath(int m,int n){
        long rns = 1;
        for(int i = m,j=1;i<m+n-1;i++,j++){
            rns*=i;
            rns/=j;
        }
        return (int)rns;
    }
}

package solution2;

/**
 * @author lwc
 * @date 2019/10/9 9:42
 */
public class U50 {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double res = myPow(x,n/2);
        return n%2==0?res*res:n<0?res*res*1/x:res*res*x;
    }
}

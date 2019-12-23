package algorithm;

public class Rmq {
    int [][]rmq;

    public Rmq(int[] a){
        int n = a.length;
        rmq = new int[n][10];
        for(int i = 0;i<n;i++) rmq[i][0] = a[i];

        for(int j = 1;(1<<j)<=n;j++){
            for(int i = 0;i+(1<<j)<=n;i++){
                if(a[rmq[i][j-1]]<a[rmq[i+(1<<(j-1))][j-1]])
                    rmq[i][j] = rmq[i][j-1];
                else
                    rmq[i][j] = rmq[i+(1<<(j-1))][j-1];
            }
        }
    }

    int search(int l, int r){
        int k = (int)(Math.log(r-l+1)/Math.log(2));
        return Math.min(rmq[l][k],rmq[r-(1<<k)+1][k]);
    }

    public static void main(String[] args) {
        Rmq rmq = new Rmq(new int[]{2,7,6,8,2,5,6,8,8});
        System.out.println(rmq.search(0,0));
    }

}

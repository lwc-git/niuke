package com.tencent.t1;

import java.util.Scanner;

public class Main {
    static int n;
    static int lcm1=1,lcm2=1;
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m.get_m();
        System.out.println(n);


    }

    public void get_m(){
        for(int i = 1;i<=n;i++){
            lcm2 = get_lcm(lcm2,i);
        }
        System.out.println(lcm2);
        while(true){
            n=n+1;
            lcm1=get_lcm(lcm1,n);
            lcm2=get_lcm(lcm2,n);
            if(lcm1==lcm2)break;
        }
    }



    //计算最大公约数
    public int get_gcd(int n1, int n2) {
        int gcd = 0;
        if (n1 < n2) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }
        if (n1 % n2 == 0) {
            gcd = n2;
        }
        while(n1%n2>0){
            n1 = n1%n2;
            if(n1<n2){
                n1=n1+n2;
                n2=n1-n2;
                n1=n1-n2;
            }
            if(n1%n2==0){
                gcd = n2;
            }
        }
        return gcd;
    }

    //计算最小公倍数
    public int get_lcm(int n1,int n2){
        return n1*n2/get_gcd(n1,n2);
    }
}

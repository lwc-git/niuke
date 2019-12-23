package com.tencent.t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            System.out.println(find(A,B,C));
        }
    }

    public static String find(int A,int B,int C){
        int D = A%B;
        if(D==0) return "NO";
        else return "YES";

    }
}

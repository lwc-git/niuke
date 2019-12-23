package com.pdd.t1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = scanner.nextInt();
        }
        for(int i = 0;i < n;i++){
            b[i] = scanner.nextInt();
        }

        System.out.println(getResult(a,b));
    }

    public static long getResult(int[]a,int[]b){
        long result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        for(int i = 0;i < n;i++){
            result += a[i]*b[n-1-i];
        }
        return result;
    }
}
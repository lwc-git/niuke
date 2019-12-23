package com.uByte.t13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(getResult(N));
    }

    public static int getResult(int N){
        int remain = 1024-N;
        int result = 0;
        for(int i = 64;i>=1;i=i/4){
            result+=remain/i;
            remain = remain%i;
        }
        return result;
    }
}

package com.uByte.t16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(getLength(n,m,array));
    }

    public static double getLength(int n,int m,int[]array) {
        if (m > n) {
            int num = m - n;
            //需要截取m-n段出来，那么一共需要将m-n段对半分
            double maxLength = 0;
            for (int i = array.length - num, count = 0; i > count; i--, count++) {
                double halfLength = array[i] / 2.0;
                double length = Math.min(halfLength, array[count]);
                if (length > maxLength) maxLength = length;
            }
            return maxLength;
        }
        else
            return 2;
    }
}

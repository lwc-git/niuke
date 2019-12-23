package com.uByte.t4;

import java.util.Scanner;

public class Main {
    static long[][][][] record;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        record = new long[m+1][n+1][k+1][3];
        System.out.println(search(m,n,k));
    }

    public static long search(int m, int n, int k) {
        record[1][0][0][0] = record[0][1][0][1] = record[0][0][1][2] = 1;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int v = 0; v < k + 1; v++) {
                    if (i + j + v > 1) {
                        if (i > 0) record[i][j][v][0] = record[i - 1][j][v][1] + record[i - 1][j][v][2];
                        if (j > 0) record[i][j][v][1] = record[i][j - 1][v][0] + record[i][j - 1][v][2];
                        if (v > 0) record[i][j][v][2] = record[i][j][v - 1][0] + record[i][j][v - 1][1];
                    }
                }
            }
        }
        return record[m][n][k][0]+record[m][n][k][1]+record[m][n][k][2];
    }
}

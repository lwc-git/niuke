package com.pdd.t3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //银行数量
        int n = scanner.nextInt();
        //约定距离
        int d = scanner.nextInt();

        int[] arrays = new int[n];

        for(int i = 0;i < n; i++){
            arrays[i] = scanner.nextInt();
        }

        System.out.println(rob(arrays,arrays.length-1));
    }

    public static Integer rob(int[] arrays,int i){
        if(i<0) return 0;
        return Math.max(rob(arrays,i-2)+arrays[i],rob(arrays,i-1));
    }
}

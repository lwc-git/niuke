package com.pingan.t3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getResult(m));
    }

    public static int getResult(int m){
        for(int i = 2;i < m;i++){
            Map<Double,Integer> map = new HashMap<>();
            for(int j = 1;j < m;j++){
                double k = Math.pow(i,j)%m;
                if(map.containsKey(k)) break;
                else map.put(k,1);
            }
            if(map.size()==m-1) return i;
        }
        return -1;
    }

}
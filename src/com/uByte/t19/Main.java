package com.uByte.t19;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for(int i = 0;i < N;i++){
            values[i] = scanner.nextInt();
        }

        System.out.println(getResult(values));
    }

    public static int getResult(int[] values){
        //将机器人拥有的能量设为Power
        int result = values[0]/2+1;
        int i = 0,Power = result;
        while(i<values.length){
            Power = 2*Power-values[i];
            i++;
            if(Power < 0){
                i = 0;
                result = result+1;
                Power = result;
            }
        }
        return result;
    }
}

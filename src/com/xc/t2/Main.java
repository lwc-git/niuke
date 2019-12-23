package com.xc.t2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().split("\\[")[1].split("\\]")[0];
        int k = scanner.nextInt();
        String[] values = input.split(",");
        getResult(values,k);
        System.out.print("[");
        for(int i = 0;i<values.length;i++){
            if(i<values.length-1)
                System.out.print(values[i]+",");
            else
                System.out.print(values[i]);
        }
        System.out.println("]");
    }

    public static void getResult(String[] values,int k){
        for(int i = 0;i<values.length;i = i+k){
            if(i+k-1<values.length)
                reversal(values,i,i+k-1);
        }
    }

    public static void reversal(String[] values,int start,int end){
        for(int i = start;i <= (start+end)/2;i++){
            String temp = values[i];
            values[i] = values[end];
            values[end] = temp;
            end--;
        }
    }
}

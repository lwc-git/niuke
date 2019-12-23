package com.uByte.t14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i<N;i++){
            String input = scanner.nextLine();
            System.out.println(handle(handleRepeat(input)));
        }

    }

    public static String handleRepeat(String s){
        char pre;
        char current;
        int num = 0;
        String result = s.substring(0,1);
        for(int i = 1;i<s.length();i++){
            pre = s.charAt(i-1);
            current = s.charAt(i);
            if(pre!=current) {
                result+=current;
                num = 0;
            }
            else{
                num+=1;
                if(num==1) result+=current;
            }
        }
        return result;
    }

    public static String handle(String handleRepeat){
        char pre;
        char current;
        int length = handleRepeat.length();
        String result = handleRepeat.substring(0,1);
        for(int i = 1;i<length;i++){
            pre = handleRepeat.charAt(i-1);
            current = handleRepeat.charAt(i);
            if(pre==current && i+2<length && handleRepeat.charAt(i+1)==handleRepeat.charAt(i+2)){
                result+=handleRepeat.substring(i,i+2);
                i = i+2;
            }
            else
                result+=current;
        }
        return result;
    }

}

package com.uByte.t20;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println(getResult(scanner.nextLine()));
        }
    }

    public static String getResult(String input){
        int length = input.length();
        if(length%2!=0) return "false";
        String result = "";
        for(int i = 0;i < length; i = i+2){
            if(input.charAt(i) != input.charAt(i+1))
                return "false";
            result+=input.charAt(i);
        }
        int start = 0;
        int end = length-1;
        while(start < end){
            if(input.charAt(start)!=input.charAt(end))
                return "false";
            start++;
            end--;
        }
        return result;
    }
}

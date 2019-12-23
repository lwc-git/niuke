package com.pingan.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String result = getOdd(string);
        System.out.println(result.substring(0,result.length()-1));

    }

    public static String getOdd(String input){
        String[] strings = input.split(",");
        String result = "";
        int length = strings.length;
        for(int i = 0;i<length;i++){
            if(Integer.parseInt(strings[i])%2!=0)
               result = result+strings[i]+",";
        }
        return result;
    }
}
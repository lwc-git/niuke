package com.mhy.t2;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String value1 = scanner.next();
        String value2 = scanner.next();
        System.out.println(getResult(value1,value2));
    }

    public static String getResult(String value1,String value2){
        int len1 = value1.length()-1;
        int len2 = value2.length()-1;
        int flag = 0;
        Stack<Integer> stack = new Stack<>();

        int len = Math.max(len1,len2);
        for(int i = len;i >= 0;i--){
            int v1 = len1>=0?Integer.parseInt(String.valueOf(value1.charAt(len1))):0;
            len1--;
            int v2 = len2>=0?Integer.parseInt(String.valueOf(value2.charAt(len2))):0;
            len2--;
            stack.push((v1+v2+flag)%8);
            flag = (v1+v2+flag)/8;
        }
        if(flag!=0) stack.push(flag);
        String result = "";
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }
}

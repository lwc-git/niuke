package com.uByte.t3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] data = new String[N];
        String[] rs = new String[N];
        for (int i = 0; i < N; i++) {
            data[i] = scanner.nextLine();
        }

        for(int i = 0;i<data.length;i++){
            String temp1="",temp2="";
            if(i-1>0) temp1 = getSimple(data[i],data[i-1]);
            if(i+1<data.length) temp2 = getSimple(data[i],data[i+1]);
            String temp = temp1.length()>temp2.length()?temp1:temp2;
            rs[i] = temp;
        }

        for(String s:rs){
            System.out.println(s);
        }
    }

    public static String getSimple(String s1, String s2) {
        String rs = "";
        int length = Math.min(s1.length(),s2.length());
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) == s2.charAt(i)) rs = rs + s1.charAt(i);
            else {
                rs = rs + s1.charAt(i);
                break;
            }
        }
        return rs;
    }
}

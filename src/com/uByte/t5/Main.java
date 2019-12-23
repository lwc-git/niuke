//package com.uByte.t5;

//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class Main {
//    public static void Main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BigInteger a = new BigInteger(scanner.next());
//        BigInteger b = new BigInteger(scanner.next());
//
//        int num = 0;
//        for(BigInteger i = a;;i++){
//            if(isLucky(i)) num++;
//        }
//
//        System.out.println(num);
//    }
//
//    public static boolean isLucky(BigInteger k){
//        String s = String.valueOf(k);
//        char[] chars = new char[s.length()+1];
//        for(int i = 0;i<s.length();i++){
//            chars[i+1] = s.charAt(i);
//        }
//        for(int i = 1;i<=s.length()/2+1;i++){
//            if(chars[i]==chars[s.length()+1-i])
//                return false;
//        }
//        return true;
//    }
//}

package com.xc.t1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String[] chars = scanner.nextLine().split(",");
        System.out.println(getResult(chars));
    }

    public static boolean getResult(String[] chars){
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i < chars.length;i++){
            if(map.containsKey(chars[i]))
                return true;
            else map.put(chars[i],1);
        }
        return false;
    }
}

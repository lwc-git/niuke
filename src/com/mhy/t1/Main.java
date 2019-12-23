package com.mhy.t1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static HashMap<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            setMap(start,end);
        }

        int maxNum = 0;
        for(Map.Entry<Integer,Integer> value : map.entrySet()){
            if(value.getValue()>maxNum)
                maxNum = value.getValue();
        }
        System.out.println(maxNum);
    }

    public static void setMap(int start,int end){
        for(int i = start;i<end;i++){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
    }
}

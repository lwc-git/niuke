package com.xc.t3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for(int i = 0; i < n;i ++){
            strings[i] = scanner.next();
        }

        ArrayList<String> list = getResult(strings);
        for(String s: list){
            System.out.println(s+" ");
        }
    }

    public static ArrayList<String> getResult(String[] strings){
        Map<String,Integer> map = new HashMap<>();
        ArrayList<String> results = new ArrayList<>();
        int initial = 0;
        for(int i = 0;i<strings.length;i++){
            String input = strings[i];
            if(map.containsKey(input)){
                initial = map.get(input)+1;
                map.put(input,initial);
            }
            else{
                initial = 1;
                map.put(input,initial);
            }

            String result = "";
            int k = input.split("/").length;
            for (int j = 0; j < k-1; j++) {
                if(j==0) result+="1";
                else if(j==k-1) result+="1";
                else result+=initial;
            }
            results.add(result);
        }
        return results;
    }
}

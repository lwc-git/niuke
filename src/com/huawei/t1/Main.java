package com.huawei.t1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Character ans = null;
        char[] chars = input.toCharArray();
        Map<Character,Integer> hashMap = new HashMap<>();

        for(int i = chars.length-1;i>=0;i--){
            if(hashMap.containsKey(chars[i])){
                hashMap.put(chars[i],hashMap.get(chars[i])+1);
            }
            else hashMap.put(chars[i],1);
        }
        Set<Map.Entry<Character,Integer>> set = hashMap.entrySet();

        for(int i = chars.length-1;i>=0;i--){
            if(hashMap.get(chars[i])==1){
                ans = chars[i];
                break;
            }

        }

        if(ans==null) System.out.println("NULL");
        else System.out.println(ans);

    }

//    public static void Main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        char[] chars = input.toCharArray();
//        Character ans = null;
//        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
//    }
}

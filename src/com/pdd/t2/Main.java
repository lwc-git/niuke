package com.pdd.t2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(getResult(input));
    }

    public static char getResult(String s){
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for(int i = 0;i < chars.length;i++){
            char c = Character.toLowerCase(chars[i]);
            if(!map.containsKey(c))
                list.add(c);
            else{
                if(c<list.get(0)|| (list.size()>1 && list.get(1)< list.get(0))) {
                    list.remove(0);
                    list.add(c);
                }
            }
            map.put(c,i);
        }
        return list.get(0);
    }
}

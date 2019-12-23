package com.uByte.t7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        while(input.hasNextInt()){
            int x = input.nextInt();
            int y = input.nextInt();
            map.put(y,x);
            list.add(y);
        }
        Collections.sort(list);
        int price = 0; int grade = 0;
        for(int i = 0;i<m;i++){
            grade = grade + list.get(i);
            price = price + map.get(list.get(i));
        }

        int i = 0,j = m;
        while(price>n){
            grade = grade - list.get(i);
            price = price - map.get(list.get(i));
            grade = grade + list.get(j);
            price = price + map.get(list.get(j));
            i++;
            j++;
        }

        System.out.println(grade);
    }
}

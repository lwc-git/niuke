package com.huawei.t2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split("\\s");

        for(int i = 0;i<strings.length;i++){
            System.out.print(new StringBuilder(strings[i]).reverse().toString()+" ");
        }

    }
}

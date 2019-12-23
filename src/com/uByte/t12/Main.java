package com.uByte.t12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String s;
    public static Deque<Character> in;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();

        in = new ArrayDeque<>();
        Deque<Character> out = new ArrayDeque<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!='i'&&c!='o') in.push(c);
            if(c=='i' && !in.isEmpty()) in.pop();
            if(c=='o'){

            }
        }
    }

    public static void solve(int i){
        if(i==0) return;
        if(s.charAt(i-1)!='i'&&s.charAt(i-1)!='o'&&!in.isEmpty()) in.pop();
        if(s.charAt(i-1)=='i'){

        }

    }
}

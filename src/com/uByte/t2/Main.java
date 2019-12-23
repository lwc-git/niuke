package com.uByte.t2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        String simplePath = "";
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < path.length(); i++) {
            String name = "";
            while (i < path.length() && path.charAt(i) == '/')
                i++;
            while (i < path.length() && path.charAt(i) != '/')
                name += path.charAt(i++);
            if (!name.equals(".") && !name.equals("..")) {
                stack.push(name);
            }
            if (!stack.isEmpty() && name.equals(".."))
                stack.pop();    //如果当前文件名为“..”，表示退到上一层目录，需弹出栈
        }
        if (stack.isEmpty())
            System.out.print("/");
        while (!stack.isEmpty()) {
            simplePath = "/" + stack.peek() + simplePath;
            stack.pop();
        }
        System.out.println(simplePath);
    }
}

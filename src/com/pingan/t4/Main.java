package com.pingan.t4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int [][]visit;
    public static int m;
    public static int n;

    //黑色为1，白色为0
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")) break;
            list.add(input);
        }
        m = list.size();
        n = list.get(0).length();
        int startI=0,startJ=0;
        int[][] value = new int[m][n];
        visit = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(list.get(i).charAt(j)=='=') value[i][j]=1;
                else if(list.get(i).charAt(j)=='#') value[i][j]=0;
                else {
                    value[i][j] = 2;
                    startI = i;
                    startJ = j;
                }
            }
        }

        System.out.println(getResult(value,startI,startJ));
    }


    public static int getResult(int[][] value , int startI,int startJ){
        int result = 0;
        Stack<String> stack = new Stack<>();
        stack.push(startI+":"+startJ);
        result = 1;
        visit[startI][startJ] = 1;
        while(!stack.isEmpty()){
            String s = stack.pop();
            int x = Integer.parseInt(s.split(":")[0]);
            int y = Integer.parseInt(s.split(":")[1]);
            if(x+1<m && value[x+1][y]==1)
            {
                result +=1;
                stack.push((x+1)+":"+y);
            }
            if(x-1>=0 && value[x-1][y]==1)
            {
                result +=1;
                stack.push((x-1)+":"+y);
            }
            if(y+1<n && value[x][y+1]==1)
            {
                result +=1;
                stack.push(x+":"+(y+1));
            }
            if(y-1>=0 && value[x][y-1]==1)
            {
                result +=1;
                stack.push(x+":"+(y-1));
            }

        }
        return result;
    }


}

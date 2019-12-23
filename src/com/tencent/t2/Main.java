package com.tencent.t2;

import java.util.*;

public class Main {
    static List<Integer>[] path;
    static int n, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        path = new List[n + 1];
        for (int i = 0; i < n + 1; i++) {
            path[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            path[scanner.nextInt()].add(scanner.nextInt());

        }

        int rns=0;
        for(int i = 1;i<n+1;i++){
            if(back(i)>to(i)) rns++;
        }
        System.out.println(rns);
    }


    //点v出发能够到达的城市数量
    public static int to(int start) {
        int rns=0;
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        while(!queue.isEmpty()) {
            int v = queue.poll();
            for (Integer u : path[v]) {
                if (!visited[u]) {
                    visited[u] = true;
                    queue.add(u);
                }
            }
        }

        for(boolean b:visited){
            if(b) rns+=1;
        }

        return rns;
    }

    //点u 出发能够到达城市v的数量
    public static int back(int end){
        int rns = 0;
        for(int i =1;i<n+1;i++){
            Queue<Integer> queue = new ArrayDeque<>();
            boolean[] visited = new boolean[n+1];
            queue.add(i);
            while(!queue.isEmpty()){
                int u =  queue.poll();
                for (Integer v : path[u]) {
                    if (!visited[v]) {
                        visited[v] = true;
                        queue.add(v);
                        if(v==end){
                            rns+=1;
                            break;
                        }
                    }
                }
            }
        }
        return rns;
    }
}

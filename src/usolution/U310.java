package usolution;

import java.util.*;

public class U310 {
    int n;
    List<Integer>[]e;

    private void bfs(int start,int[]dist,int[]pre){
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start]=true;
        dist[start] = 0;
        pre[start] = -1;

        while(!queue.isEmpty()){
            int u = queue.poll();
            for(int v:e[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    dist[v] = dist[u]+1;
                    queue.add(v);
                    pre[v] = u;
                }
            }
        }
    }

    public List<Integer> findMinHeightTrees(int n,int[][]edges){
        if(n<=0) return new ArrayList<>();
        this.n = n;
        e = new List[n];
        for(int i = 0;i<n;i++)
            e[i] = new ArrayList<>();
        for(int[]pair:edges){
            int u = pair[0];
            int v = pair[1];
            e[u].add(v);
            e[v].add(u);
        }

        int[]d1 = new int[n];
        int[]d2 = new int[n];
        int[]pre = new int[n];

        bfs(0,d1,pre);
        int u = 0;
        for(int i = 0;i<n;i++){
            if(d1[i]>d1[u]) u=i;
        }

        bfs(u,d2,pre);
        int v = 0;
        for(int i = 0;i<n;i++){
            if(d2[i]>d2[v]) v = i;
        }

        List<Integer> list = new ArrayList<>();
        while(v!=-1){
            list.add(v);
            v=pre[v];
        }
        if(list.size()%2==1) return Arrays.asList(list.get(list.size()/2));
        else return Arrays.asList(list.get(list.size()/2-1),list.get(list.size()/2));
    }

}

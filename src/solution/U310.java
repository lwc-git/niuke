package solution;

import java.util.*;

public class U310 {

    public static void main(String[] args) {
        U310 u310 = new U310();
        int[][] edges = {{0,3},{1,3},{2,3},{4,3},{5,4}};
        List<Integer> list = u310.findMinHeightTrees(6,edges);
        for(int l:list)
            System.out.println(l);
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list = new ArrayList<>();
        if (n <= 2) {
            for(int i = 0;i<n;i++)
                list.add(i);
        } else {
            int level = Integer.MAX_VALUE;
            int tempLevel = 0;
            Map<Integer, Integer> map = new HashMap<>();
            Deque<Integer> leaf = findLeafNode(edges);
            Integer parent;

            while (!leaf.isEmpty()) {
                if ((parent = leaf.poll()) != null) {
                    map.clear();
                    map.put(parent, 1);
                    search(parent, edges, map);

                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        if (entry.getValue() > tempLevel) {
                            tempLevel = entry.getValue();
                        }
                    }
                    if (tempLevel == level) {
                        list.add(parent);
                    }
                    if (tempLevel < level) {
                        list.clear();
                        list.add(parent);
                        level = tempLevel;
                    }
                    tempLevel = 0;
                }
            }
        }
        return list;

    }

    public void search(int parent,int[][] edges,Map<Integer,Integer> map){
        for(int i =0;i<edges.length;i++){
            for(int j = 0;j<2;j++){
                if(parent==edges[i][j]&&!map.containsKey(edges[i][1-j])){
                    map.put(edges[i][1 - j], map.get(parent) + 1);
                    search(edges[i][1-j],edges,map);
                }
            }
        }
    }

    public Deque<Integer> findLeafNode(int[][]edges){
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0;i<edges.length;i++){
            for(int j =0;j<2;j++){
                if(!map.containsKey(edges[i][j]))
                    map.put(edges[i][j],1);
                else {
                    if (!deque.contains(edges[i][j]))
                        deque.offer(edges[i][j]);
                }
            }
        }
        return deque;
    }

}

package solution;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class U207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //统计课程数
        int courseCount = 0;
        //链表图
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        //入度，一张无环图的入度应该都为1
        int[] degree = new int[numCourses];
        //bfs队列
        Queue<Integer> queue = new LinkedList<Integer>();

        //初始化链表图
        for(int i = 0;i<numCourses;i++){
            degree[i]=0;
            graph[i] = new ArrayList<>();
        }

        for(int i = 0;i<prerequisites.length;i++){
            degree[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for(int i = 0;i<numCourses;i++){
            if(degree[i]==0){
                courseCount++;
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int course = queue.poll();
            for(int i = 0;i<graph[course].size();i++){
                degree[graph[course].get(i)]--;
                if(degree[graph[course].get(i)]==0){
                    courseCount++;
                    queue.offer(graph[course].get(i));
                }
            }
        }

        if(courseCount==numCourses) return true;
        else return false;
    }
}

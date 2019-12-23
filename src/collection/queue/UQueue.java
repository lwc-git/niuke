package collection.queue;

import collection.ComparatorUData;
import collection.UData;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class UQueue {
    public static void main(String[] args) {
        UPriorityQueue();
    }

    public static void UPriorityQueue(){
        PriorityQueue<UData> priorityQueue = new PriorityQueue<>(new ComparatorUData());
        priorityQueue.offer(new UData("5","5",5));
        priorityQueue.offer(new UData("4","4",4));
        System.out.println(priorityQueue.peek());

    }

    public static void UDeque(){

    }

    public static void UArrayDeque(){
        ArrayDeque<UData> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(new UData("1","1",1));

    }
}

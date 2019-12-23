package solution;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private LinkedHashMap<Integer,Integer> map;
    protected int maxElements;


    public LRUCache(int capacity) {
        this.map = new LinkedHashMap(capacity,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size()>maxElements;
            }
        };
        this.maxElements = capacity;
    }

    public int get(int key) {
        return map.getOrDefault(key,-1);
    }
    public void put(int key, int value) {
        map.put(key,value);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        System.out.println(lruCache.get(1));
    }
}

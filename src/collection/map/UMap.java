package collection.map;

import java.util.*;

public class UMap {
    public static void main(String[] args) {
        ULinkedHashMap();
        //UHashMap();
    }

    public static void UHashMap(){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"1");
        hashMap.put(2,"2");
        hashMap.put(3,"3");

        System.out.println(hashMap.getOrDefault(5,"5"));
        Collection collection = hashMap.values();
        for(Object i:collection){
            System.out.println(i.toString());
        }

        Set<Map.Entry<Integer,String>> set = hashMap.entrySet();

    }

    public static void ULinkedHashMap(){
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1,"1");
        linkedHashMap.put(2,"2");
        System.out.println(linkedHashMap.size());
    }

}

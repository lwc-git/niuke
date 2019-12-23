package collection.set;

import collection.UData;

import java.util.*;

public class USet {
    public static void main(String[] args) {
        //UHashSet();
        //ULinkedHashSet();
        //UCollection();
    }


    public static void UEnumSet(){
        System.out.println("？");
    }
    public static void UTreeSet(){

    }

    public static void UHashSet(){
        HashSet<String> hashSet = new HashSet<>();
        System.out.println(hashSet.size());
        for(String string:hashSet){
            System.out.println(string);
        }
    }

    public static void ULinkedHashSet(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("4");
        linkedHashSet.add("3");
        linkedHashSet.add("5");
        Iterator<String> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void UCollection(){
        ArrayList<UData> arrayList = new ArrayList<>();
        for(int i = 0;i<10;i++){
            arrayList.add(new UData("2015302500"+i,"name"+i,18));
        }
        Collections.sort(arrayList);
        arrayList.sort(new Comparator<UData>() {
            @Override
            public int compare(UData o1, UData o2) {
                return 0;
            }
        });
        for(UData uData:arrayList){
            System.out.println(uData.getID());
        }


        List<String> list = new ArrayList<>();
        for(int i =0;i<10;i++){
            list.add("String"+i);
        }

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }

}

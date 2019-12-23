package collection.list;

import collection.UData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class UList {

    public static void main(String[] args) {
        //UList();
        //UArrayList();
        ULinkedList();
    }

    public static void ULinkedList(){
        LinkedList<UData> linkedList = new LinkedList<>();
        linkedList.add(new UData("1","1",1));
        linkedList.add(new UData("3","3",3));
        linkedList.add(new UData("2","2",2));
        linkedList.push(new UData("4","4",4));

        //System.out.println(linkedList.getLast().getID());
        System.out.println(linkedList.pop().getID());
    }


    public static void UArrayList(){
        ArrayList<UData> arrayList = new ArrayList<UData>();
        for(int i = 0;i<10;i++){
            arrayList.add(new UData(i+"",i+"",i));
        }

        Object []object = arrayList.toArray();
        for(Object o:object){
            System.out.println(((UData)o).getID());
        }
    }


    public static void UList(){
        List<UData> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add(new UData(i+"",i+"",i));
        }
        ListIterator<UData> listIterator = list.listIterator(5);
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous().getID());
        }
    }
}

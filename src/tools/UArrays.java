package tools;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UArrays {

    public static void main(String[] args) {
        UArrays uArrays = new UArrays();
        //uArrays.printArray();
        //uArrays.createArray();
        uArrays.search();
    }

    public void createArray(){
        int []array = {4,5,6,7};
        ArrayList arrayList = new ArrayList(Arrays.asList(array));
        System.out.println(arrayList.get(0));
    }


    public void printArray(){
        int[] array = {4,5,6,7};
        System.out.println(Arrays.toString(array));
    }

    public void search(){
        int[] array = {1,2,3,5,7,8};
        int index = Arrays.binarySearch(array,9);
        System.out.println(index);

        BigInteger bigInteger = BigInteger.valueOf(5);

    }
}

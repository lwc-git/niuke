package com.pingan.t2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String string1 = input.replace("[","");
        String string2 = string1.replace("]","");
        String[] strings = string2.split(",");
        int length = strings.length;
        int[] array = new int[length-1];
        int key = Integer.parseInt(strings[length-1]);
        for(int i = 0;i<length-1;i++){
            array[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(search(array,key));
    }


    public static int search(int []array,int a){
        int n=array.length;
        int low=0;
        int hi=n-1;
        int mid=0;
        while(low<hi){
            mid=(low+hi)/2;
            if(array[mid]<a){
                low=mid+1;
            }else{
                hi=mid;
            }
        }
        if(array[low]!=a){
            return -1;
        }else{
            return low;
        }
    }

}
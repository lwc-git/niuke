package com.uByte.t1;
import java.util.*;

public class Main {
    public static int rns;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        InsertDot(s,3);
        System.out.println(rns);

    }

//    public static void Main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int M = scanner.nextInt();
//        int [][]N = new int[M][M];
//        for(int i = 0;i<M;i++){
//            for(int j = 0;j<M;j++){
//                N[i][j] = scanner.nextInt();
//            }
//        }
//
//        int length = MaxOrganization(N);
//        System.out.println(length);
//
//
//    }
//    public static void Main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String string = sc.next();
//        int currentLength = MaxSubString(string);
//        System.out.println(currentLength);
//    }


    public static int MaxSubString(String string){
        int n = string.length(),currentLength=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0;j<n;j++){
            if(map.containsKey(string.charAt(j))){
                i = Math.max(map.get(string.charAt(j)),i);
            }
            map.put(string.charAt(j),j+1);
            currentLength = Math.max(currentLength,j-i+1);
        }

        return currentLength;
    }

    public static int MaxOrganization(int [][] array){
        int OrganizationNum = 0;
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array.length;j++){
                //System.out.println(!list.contains(new UData(i,j)));
                if(array[i][j]==1 && !list.contains(i+""+j)){
                    OrganizationNum = OrganizationNum+1;
                    putList(list,i,j,array);
                }
            }
        }

        return OrganizationNum;
    }

    public static void putList(ArrayList list,int i,int j,int[][]array){
        list.add(new Integer(i).toString()+j);
        if(i+1<array.length && i+1>0 && array[i+1][j]==1 && !list.contains(new Integer(i+1).toString()+j)) {
            list.add(new Integer(i+1).toString()+j);
            putList(list, i + 1, j, array);
        }
        if(i-1<array.length && i-1>0 && array[i-1][j]==1 && !list.contains(new Integer(i-1).toString()+j)) {
            list.add(new Integer(i-1).toString()+j);
            putList(list, i - 1, j, array);
        }
        if(j+1<array.length && j+1>0 && array[i][j+1]==1 && !list.contains(i+new Integer(j+1).toString())){
            list.add(i+new Integer(j+1).toString());
            putList(list,i,j+1,array);
        }

        if(j-1<array.length && j-1>0 && array[i][j-1]==1 && !list.contains(i+new Integer(j-1).toString())){
            list.add(i+new Integer(j-1).toString());
            putList(list,i,j-1,array);
        }
    }


    public static void InsertDot(String s,int dotNum){
        if(dotNum==0&&s.length()>0&&s.length()<4){
            rns= rns+1;
        }

        if(dotNum>0&&s.length()>0){
            dotNum--;
            for(int i=1;i<4;i++){
                if(s.length()>i){
                    InsertDot(s.substring(i),dotNum);
                }
            }
        }
        return;
    }
}


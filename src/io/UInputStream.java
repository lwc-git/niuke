package io;

import collection.UData;

import java.io.*;

public class UInputStream {


    public static void main(String[] args) {
        try {

            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("in")));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("inout")));
            byte [] b = new byte[8];
            int len = -1;
            while((len=bufferedInputStream.read(b))!=-1){
                bufferedOutputStream.write(b,0,len);
            }
            bufferedOutputStream.close();
            bufferedInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        //UObjectOutputStream();
    }

    public static void UObjectOutputStream(){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("inout")));
            objectOutputStream.writeObject(new UData("1","1",1));
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void UObjectInputStream(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("inout"));
            Object object = objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

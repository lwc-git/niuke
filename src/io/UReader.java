package io;

import com.sun.xml.internal.messaging.saaj.util.CharReader;

import java.io.*;

public class UReader {
    public static void main(String[] args) {
        try {
//            InputStreamReader input = new InputStreamReader(System.in);
//            BufferedReader bufferedReader = new BufferedReader(input);
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
//            outputStreamWriter.write(input.read());
//            outputStreamWriter.close();




            FileReader fileReader = new FileReader(new File("in"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            char []b = new char[8];
            bufferedReader.read(b);

            PrintWriter printWriter = new PrintWriter(new File("inout"));
            printWriter.write(b);
            printWriter.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

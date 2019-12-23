package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UScanner {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("in"));
            Scanner scanner = new Scanner(fileInputStream);
            String s = scanner.nextLine();
            System.out.println(s);
            System.out.println(scanner.nextInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

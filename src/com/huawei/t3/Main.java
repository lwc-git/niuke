package com.huawei.t3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal b1 = new BigDecimal(scanner.nextLine());
        BigDecimal b2 = new BigDecimal(scanner.nextLine());

        System.out.println(b1.multiply(b2).toString());
    }
}


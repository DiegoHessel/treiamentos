package org.example.uri;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        double consumption = x / y;
        System.out.printf("%.3f km/l\n", consumption);
        scanner.close();
    }
}
package org.example.uri;

import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int speed = scanner.nextInt();
        double liters = (time * speed) / 12.0;
        System.out.printf("%.3f\n", liters);
        scanner.close();
    }
}

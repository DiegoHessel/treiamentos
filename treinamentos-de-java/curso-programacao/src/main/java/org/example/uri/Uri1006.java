package org.example.uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double media = (a * 2 + b * 3 + c * 5) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}

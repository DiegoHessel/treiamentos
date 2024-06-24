package org.example.uri;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.printf("%d eh o maior\n", maiorABC);
        scanner.close();
    }
}

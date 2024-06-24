package org.example.uri;

import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int horas = N / 3600;
        N = N % 3600;
        int minutos = N / 60;
        N = N % 60;
        int segundos = N;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}

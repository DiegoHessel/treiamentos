package org.example.uri;

import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias: ");
        int numeroDias = scanner.nextInt();
        int anos = numeroDias / 365;
        int numDias = numeroDias % 365;
        int meses = numDias / 30;
        int dias = numDias % 30;
        System.out.printf("%d ano(s)\n", anos);

        System.out.printf("%d mes(es)\n", meses);
        System.out.println(dias + " dia(s)");

    }
}
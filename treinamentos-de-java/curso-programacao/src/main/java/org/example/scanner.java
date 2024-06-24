package org.example;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // next() = lê a primeira palavra da linha
        // nextLine() = lê a linha inteira
        // nextInt() = lê um número inteiro
        // nextDouble() = lê um número decimal
        // next().charAt(0) = lê um caractere

        Scanner sc = new Scanner(System.in);
        String x;
        System.out.println("Digite algo: ");
        x = sc.next();
        System.out.println("Você digitou: "+ x);
        sc.close();
    }
}

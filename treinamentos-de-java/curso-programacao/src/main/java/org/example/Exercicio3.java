package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite o nome da segunda pessoa: ");
        scanner.nextLine();
        String nome2 = scanner.nextLine();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        double media = (double) (idade1 + idade2) / 2;
        //double media = (idade1 + idade2) / 2.0;
        System.out.printf("A idade média de %s e %s é de %.1f anos\n", nome1, nome2, media);
    }
}

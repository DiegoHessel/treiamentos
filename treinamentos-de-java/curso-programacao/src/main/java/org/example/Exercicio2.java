package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2.0 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.printf("AREA = %.4f\n", area);
        System.out.printf("PERIMETER = %.4f\n", perimetro);
        System.out.printf("DIAGONAL = %.4f\n", diagonal);
        scanner.close();

    }
}

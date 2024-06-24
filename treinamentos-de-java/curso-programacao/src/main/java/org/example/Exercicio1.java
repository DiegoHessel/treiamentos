package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
           Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        System.out.printf("AREA = %.2f",  area);
        System.out.printf("PRECO = %.2f " ,preco);
        sc.close();


    }
}

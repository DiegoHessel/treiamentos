package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        // saidasformatadas:
        // double %.2f
        // int %d
        // String %s
        // char %c
        // boolean %b
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //trocando a virgula por ponto
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        //saida formatada
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }

}
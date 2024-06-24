package org.example;

import java.util.Locale;

public class exercicioProdutos {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é $ %.2f%n", produto1, preco1);
        System.out.printf("%s, cujo preço é $ %.2f%n", produto2, preco2);
        System.out.printf("Registro: %d anos de idade, código %d e gênero: %c%n", idade, codigo, genero);
        System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
        System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);

         // casting = quando voce quer converter um tipo de dado para outro
        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a / b;
        System.out.println(resultado);

    }
}

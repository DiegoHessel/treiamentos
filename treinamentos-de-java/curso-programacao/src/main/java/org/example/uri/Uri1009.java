package org.example.uri;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o salário do vendedor: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite o total de vendas do vendedor: ");
        double vendas = scanner.nextDouble();

        double total = salario + (vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }

}

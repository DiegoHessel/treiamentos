package org.example.uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        int valor = 0;

        System.out.println("NOTAS:");
        int[] notas = {100, 50, 20, 10, 5, 2};
        for (int nota : notas) {
            valor = (int) N / nota;
            System.out.println(valor + " nota(s) de R$ " + nota + ".00");
            N %= nota;
        }

        System.out.println("MOEDAS:");
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        for (double moeda : moedas) {
            valor = (int) (N / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f\n", valor, moeda);
            N %= moeda;
            N = Math.round(N * 100.0) / 100.0;
        }
    }
}
package org.example.uri;

import java.util.Scanner;

public class Uri1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de casos de teste: ");
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            int diamonds = 0;
            int openings = 0;
            for (char c : linha.toCharArray()) {
                if (c == '<') {
                    openings++;
                } else if (c == '>' && openings > 0) {
                    diamonds++;
                    openings--;
                }
            }
            System.out.println(diamonds);
        }
    }
}
package org.example.uri;

import java.util.Scanner;
public class Uri1008 {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);

        int number, hours;
        double salary, total;

        number = input.nextInt();
        hours = input.nextInt();
        salary = input.nextDouble();

        total = hours * salary;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", total);

        input.close();
    }
}

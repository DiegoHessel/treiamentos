package org.example.uri;

import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double pi = 3.14159;
        double volume = (4.0/3) * pi * Math.pow(R, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
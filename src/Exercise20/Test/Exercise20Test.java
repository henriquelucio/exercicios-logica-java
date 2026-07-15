package Exercise20.Test;

// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Exercise20Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter an integer number and the program will return a multiplication table");
        int number = input.nextInt();

        System.out.println("\nMultiplication table for number " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }
}

package Exercise14.Test;

// 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

import Exercise14.Main.Exercise14;

import java.util.Scanner;

public class Exercise14Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide 2 integer values, the program will reverse their order and print the result");
        System.out.println("Provide value A:");
        int valueA = input.nextInt();
        System.out.println("Provide value A:");
        int valueB = input.nextInt();

        Exercise14 exercise14 = new Exercise14(valueA, valueB);

        exercise14.print();
    }
}

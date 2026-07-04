package Exercise04.Test;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import Exercise04.Main.Exercise04;

import java.util.Scanner;

public class Exercise04Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Provide a number and the program will return the previous and following number");
        System.out.println("Type an integer number:");
        int tempNumber = input.nextInt();

        Exercise04.print(tempNumber);
    }
}

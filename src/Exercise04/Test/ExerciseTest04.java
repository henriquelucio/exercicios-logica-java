package Exercise04.Test;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import Exercise04.Main.Exercise04;

import java.util.Scanner;

public class ExerciseTest04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise04 exercise04;

        System.out.println("Provide a number and the program will return the previous and following number");
        System.out.println("Type an integer number:");
        int tempNumber = input.nextInt();

        exercise04 = new Exercise04(tempNumber);

        exercise04.printer();
    }
}

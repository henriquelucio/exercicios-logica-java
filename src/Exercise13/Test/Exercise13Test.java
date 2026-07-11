package Exercise13.Test;

//  13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import Exercise13.Main.Exercise13;

import java.util.Scanner;

public class Exercise13Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter your name and age; the program will return whether you are of legal age.");

        System.out.println("\nEnter your name:");
        String name = input.nextLine();

        System.out.println("\nEnter your age:");
        int age = input.nextInt();

        Exercise13 exercise13 = new Exercise13(name, age);
        exercise13.print();
    }
}

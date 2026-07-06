package Exercise07.Test;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import Exercise07.Main.Exercise07;

import java.util.Scanner;

public class Exercise07Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Provide 2 integer values and a reference value for each one");
        System.out.println("If value 1 is greater than reference, will return true, otherwise will return false");
        System.out.println("If value 2 is smaller than reference, will return true, otherwise will return false");
        System.out.println("Provide value 1:");
        int value1 = input.nextInt();
        System.out.println("Provide reference for value 1:");
        int referenceValue1 = input.nextInt();
        System.out.println("Provide value 2:");
        int value2 = input.nextInt();
        System.out.println("Provide reference for value 2:");
        int referenceValue2 = input.nextInt();

        Exercise07 exercise07 = new Exercise07(value1, referenceValue1, value2, referenceValue2);
        exercise07.print();
    }
}

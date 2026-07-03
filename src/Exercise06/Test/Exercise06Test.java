package Exercise06.Test;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import Exercise06.Main.Exercise06;

import java.util.Scanner;

public class Exercise06Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise06 exercise06;

        System.out.println("Provide a value and the program will return with a readjustment of 5%");
        System.out.println("Provide the value: ");
        double value = input.nextDouble();
        exercise06 = new Exercise06(value);

        exercise06.print();
    }
}

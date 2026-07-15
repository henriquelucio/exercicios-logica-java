package Exercise22.Test;

// 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Exercise22Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide 2 integer numbers, the program will return division result and leftover");
        System.out.println("\nEnter number A:");
        int numberA = input.nextInt();
        System.out.println("Enter number B:");
        int numberB = input.nextInt();

        System.out.println("\nThe division result is: " + (numberA/numberB));
        System.out.println("The division leftover is: " + (numberA%numberB));
    }
}

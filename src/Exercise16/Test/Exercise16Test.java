package Exercise16.Test;

// 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

import Exercise16.Main.Exercise16;

import java.util.Scanner;

public class Exercise16Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide 3 values, each one represents a side of a triangle, the program will verify if they are valid and return the type of triangle");
        System.out.println("Enter side 'a' value");
        double sideA = input.nextDouble();
        System.out.println("Enter side 'b' value");
        double sideB = input.nextDouble();
        System.out.println("Enter side 'c' value");
        double sideC = input.nextDouble();

        Exercise16 exercise16 = new Exercise16();
        exercise16.print(sideA, sideB, sideC);
    }
}

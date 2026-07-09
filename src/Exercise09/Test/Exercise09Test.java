package Exercise09.Test;

// 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:

// Fórmula do IMC = peso/(altura)²

// Tabela Condições IMC:
// Abaixo de 18,5   | Abaixo do peso
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
// Entre 25,0 e 29,9 | Levemente acima do peso
// Entre 30,0 e 34,9 | Obesidade grau I
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
// Maior ou igual a 40 | Obesidade grau III (mórbida)

import Exercise09.Main.Exercise09;

import java.util.Scanner;

public class Exercise09Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double height;
        double weight;

        System.out.println("Provide your height and weight, the program will calculate your BMI");
        System.out.println("Provide your height below in meters (e.g.: 1.82 = 6 feet)");
        height = input.nextDouble();
        System.out.println("Provide your weight below in kilograms (e.g.: 80.0 = 176.37 pounds)");
        weight = input.nextDouble();

        Exercise09 exercise09 = new Exercise09(height, weight);
        exercise09.print();
    }
}

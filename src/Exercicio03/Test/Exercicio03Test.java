package Exercicio03.Test;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

import Exercicio03.Main.Exercicio03;

import java.util.Scanner;

public class Exercicio03Test {
    public static void main(String[] args){
        Exercicio03 exercicio03 = new Exercicio03();
        Scanner input = new Scanner(System.in);

        System.out.println("Provide two integer numbers");
        System.out.println("If equal, the program will sum the values and return the final result");
        System.out.println("If different, the program will multiply the values and return the final result");
        System.out.println("------------------------");
        System.out.println("Provide integer value A");
        exercicio03.setValueA(input.nextInt());
        System.out.println("Provide integer value B");
        exercicio03.setValueB(input.nextInt());

        exercicio03.printer();
    }
}

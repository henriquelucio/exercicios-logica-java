package Exercicio02.Test;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import Exercicio02.Main.Exercicio02;
import java.util.Scanner;

public class Exercicio02Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercicio02 exercicio02 = new Exercicio02();

        System.out.println("Provide a integer number, the program will return if it is positive or negative, odd or even");
        int number = input.nextInt();

        exercicio02.printer(number);
    }
}

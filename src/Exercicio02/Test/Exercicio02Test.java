package Exercicio02.Test;

//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import Exercicio02.Main.Exercicio02;

import java.util.Scanner;

public class Exercicio02Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercicio02 exercicio02 = new Exercicio02();

        System.out.println("Informe um numero inteiro, positivo ou negativo, e o sistema ira verificar se ele é par ou impar");
        int number = input.nextInt();

        exercicio02.printer(number);
    }
}

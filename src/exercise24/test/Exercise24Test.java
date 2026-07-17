package exercise24.test;

// 24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.

//Fórmula: distância = tempo x velocidade.
//          litros usados = distância / 12.

import exercise24.main.Exercise24;

import java.util.Scanner;

public class Exercise24Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide the time of your car trip and the program will return estimated distance and gas consume");
        System.out.println("\nEnter the time in hours:");
        double timeInHours = input.nextDouble();

        Exercise24 exercise24 = new Exercise24(timeInHours);

        exercise24.print();
    }
}

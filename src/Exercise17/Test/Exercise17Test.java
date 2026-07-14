package Exercise17.Test;

// 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * (F-32) / 9)

import Exercise17.Main.Exercise17;

import java.util.Scanner;

public class Exercise17Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide a temperature in Fahrenheit, the program will convert to its equivalent in Celsius");
        System.out.println("Enter the temperature value:");
        double fahrenheitTemperatureValue = input.nextDouble();

        Exercise17 exercise17 = new Exercise17();
        exercise17.print(fahrenheitTemperatureValue);
    }
}

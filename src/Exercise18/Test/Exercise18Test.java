package Exercise18.Test;

// 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

import Exercise18.Main.Calculator;
import Exercise18.Main.Person;

import java.util.Scanner;

public class Exercise18Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide 2 person's name's, height's on start and growth factor in centimeters by year.");
        System.out.println("The program will calculate how many years till the second person gets bigger");

        System.out.println("\nEnter person 1 name:");
        String tempName = input.nextLine();
        System.out.println("Enter person 1 actual height:");
        int tempHeight = input.nextInt();
        System.out.println("Enter person 1 growth factor by years in centimeters:");
        int tempGrowthFactor = input.nextInt();
        input.nextLine();

        Person person1 = new Person(tempName, tempHeight, tempGrowthFactor);

        System.out.println("\nEnter person 2 name:");
        tempName = input.nextLine();
        System.out.println("Enter person 2 actual height:");
        tempHeight = input.nextInt();
        System.out.println("Enter person 2 growth factor by years in centimeters:");
        tempGrowthFactor = input.nextInt();
        Person person2 = new Person(tempName, tempHeight, tempGrowthFactor);

        Calculator calculator = new Calculator();
        calculator.calculateYearsToGetHigher(person1, person2);
    }
}

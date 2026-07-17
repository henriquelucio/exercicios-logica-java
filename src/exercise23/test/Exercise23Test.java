package exercise23.test;

// 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

import exercise23.main.Exercise23;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise23Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nProvide a Professor's name, value by hour, amount of hours in classes and the program will calculate his salary");
        System.out.println("\nEnter the professor name:");
        String name = input.nextLine();
        System.out.println("Enter the value by hour:");
        BigDecimal valueByHour = input.nextBigDecimal();
        System.out.println("Enter the amount of hours in classes");
        int hoursOfClassesInMonth = input.nextInt();

        Exercise23 exercise23 = new Exercise23(name, valueByHour, hoursOfClassesInMonth);

        exercise23.print();
    }
}

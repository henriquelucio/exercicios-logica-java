package Exercise05.Test;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.621,00).

import Exercise05.Main.Exercise05;

import java.util.Scanner;

public class Exercise05Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise05 exercise05;

        System.out.println("Provide the minimum salary and your salary, the program will calculate how much times of minimum salary you receive");
        System.out.println("Provide the minimum salary:");
        double minimumSalary = input.nextDouble();
        System.out.println("Provide your salary:");
        double employeeSalary = input.nextDouble();

        exercise05 = new Exercise05(minimumSalary, employeeSalary);
        exercise05.printer();
    }
}

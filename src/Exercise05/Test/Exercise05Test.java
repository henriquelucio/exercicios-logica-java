package Exercise05.Test;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.621,00).

import Exercise05.Main.Exercise05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise05Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Provide the minimum salary and your salary, the program will calculate how much times of minimum salary you receive");
        System.out.println("Provide the minimum salary:");
        BigDecimal minimumSalary = input.nextBigDecimal();
        System.out.println("Provide your salary:");
        BigDecimal employeeSalary = input.nextBigDecimal();

        Exercise05.print(minimumSalary, employeeSalary);
        System.out.println(new BigDecimal("2.374").setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal("2.364").setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal("2.354").setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal("2.344").setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal("2.334").setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal("2.324").setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(new BigDecimal("2.314").setScale(2, RoundingMode.HALF_EVEN));
        //1,29487970388649 - 2099/1621
        //1,295496607032696 - 2100/1621
        //1,296113510178902 - 2101/1621
    }
}

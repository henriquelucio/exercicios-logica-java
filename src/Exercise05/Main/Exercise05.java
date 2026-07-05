package Exercise05.Main;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.621,00).

import java.math.BigDecimal;

public class Exercise05 {

    public static void print(BigDecimal minimumSalary, BigDecimal employeeSalary){
        System.out.println("Minimum salary provided is: " + minimumSalary);
        System.out.println("Employee salary provided is: " + employeeSalary);
        BigDecimal calculationResult = SalaryCalculator.salaryCalculator(minimumSalary, employeeSalary);
        System.out.println("Your salary is " + calculationResult + " times the minimum salary");
    }
}

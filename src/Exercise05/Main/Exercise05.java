package Exercise05.Main;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.621,00).

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise05 {
    private double minimumSalary = 1621.00;
    private double employeeSalary;

    public Exercise05(double minimumSalary, double employeeSalary){
        this.minimumSalary = minimumSalary;
        this.employeeSalary = employeeSalary;
    }

    public void printer(){
        System.out.println("Minimum salary provided is: " + minimumSalary);
        System.out.println("Employee salary provided is: " + employeeSalary);
        double calculationResult = SalaryCalculator.salaryCalculator(minimumSalary, employeeSalary);
        BigDecimal bd = new BigDecimal(calculationResult).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Your salary is " + bd + " times the minimum salary");
    }
}

package exercise23.main;

// 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise23 {
    private String name;
    private BigDecimal bruteSalary;
    private BigDecimal liquidSalary;
    private BigDecimal valueByHour;
    private int hoursOfClassesInMonth;
    private BigDecimal taxINSS;

    public Exercise23(String name, BigDecimal valueByHour, int hoursOfClassesInMonth) {
        this.name = name;
        this.valueByHour = valueByHour;
        this.hoursOfClassesInMonth = hoursOfClassesInMonth;
    }

    public void print() {
        Calculator calculator = new Calculator();

        System.out.println("\nThe professors name is: " + name);
        System.out.println("The value by hour received is: " + valueByHour);
        System.out.println("The professor worked an total of " + hoursOfClassesInMonth + " hours this month");

        bruteSalary = calculator.bruteSalaryCalculator(valueByHour, hoursOfClassesInMonth).setScale(2, RoundingMode.HALF_UP);
        System.out.println("The brute salary is: " + bruteSalary);

        taxINSS = calculator.taxCalculator(bruteSalary).setScale(2, RoundingMode.HALF_UP);
        System.out.println("The total amount of tax is: " + taxINSS);

        liquidSalary = calculator.liquidSalaryCalculator(bruteSalary, taxINSS).setScale(2, RoundingMode.HALF_UP);
        System.out.println("The final salary after tax is: " + liquidSalary);
    }
}

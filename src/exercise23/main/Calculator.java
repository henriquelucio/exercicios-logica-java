package exercise23.main;

// 23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

//      Salário de Contribuição (R$)            Alíquota progressiva
//          Até R$1.621,00                              7,5%
//      De R$1.621,01 até R$ 2.902,84                   9%
//      De R$2.902,85 até R$4.354,27                    12%
//      De R$4.354,28 até R$8.475,55                    14%

import java.math.BigDecimal;

public class Calculator {
    private BigDecimal taxZone1Percentage = new BigDecimal("0.075");
    private BigDecimal taxZone2Percentage = new BigDecimal("0.09");
    private BigDecimal taxZone3Percentage = new BigDecimal("0.12");
    private BigDecimal taxZone4Percentage = new BigDecimal("0.14");
    private BigDecimal taxZone1Value = new BigDecimal("1621.00");
    private BigDecimal taxZone2Value = new BigDecimal("2902.84");
    private BigDecimal taxZone3Value = new BigDecimal("4354.27");
    private BigDecimal taxZone4Value = new BigDecimal("8475.55");
    private BigDecimal maxTaxZone1 = taxZone1Value.multiply(taxZone1Percentage);
    private BigDecimal maxTaxZone2 = maxTaxZone1.add(taxZone2Value.subtract(taxZone1Value).multiply(taxZone2Percentage));
    private BigDecimal maxTaxZone3 = maxTaxZone2.add(taxZone3Value.subtract(taxZone2Value).multiply(taxZone3Percentage));
    private BigDecimal maxTaxZone4 = maxTaxZone3.add(taxZone4Value.subtract(taxZone3Value).multiply(taxZone4Percentage));

    public BigDecimal bruteSalaryCalculator(BigDecimal valueByHour, int hoursOfClassesInMonth) {
        BigDecimal bruteSalary;

        bruteSalary = valueByHour.multiply(BigDecimal.valueOf((hoursOfClassesInMonth)));

        return bruteSalary;
    }

    public BigDecimal taxCalculator(BigDecimal bruteSalary) {
        BigDecimal taxINSS;

        if (bruteSalary.compareTo(taxZone4Value) > 0) {
            taxINSS = maxTaxZone4;
        } else if (bruteSalary.compareTo(taxZone3Value) > 0) {
            taxINSS = maxTaxZone3.add(bruteSalary.subtract(taxZone3Value).multiply(taxZone4Percentage));
        } else if (bruteSalary.compareTo(taxZone2Value) > 0){
            taxINSS = maxTaxZone2.add(bruteSalary.subtract(taxZone2Value).multiply(taxZone3Percentage));
        } else if (bruteSalary.compareTo(taxZone1Value) > 0){
            taxINSS = maxTaxZone1.add(bruteSalary.subtract(taxZone1Value).multiply(taxZone2Percentage));
        } else {
            taxINSS = bruteSalary.multiply(taxZone1Percentage);
        }

        return taxINSS;
    }

    public BigDecimal liquidSalaryCalculator(BigDecimal bruteSalary, BigDecimal taxInss){

        return bruteSalary.subtract(taxInss);
    }
}

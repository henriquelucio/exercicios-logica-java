package Exercise10.Main;

//  10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise10 {

    public void print(double[] grades){
        System.out.println("The average grade is:");
        BigDecimal roundingResult = new BigDecimal(AverageCalculator.averageGrade(grades)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(roundingResult);
    }
}

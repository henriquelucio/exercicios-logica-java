package Exercise06.Main;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise06 {
    private double value;
    private BigDecimal adjustmentResult;

    public Exercise06(double value){
        this.value = value;
        adjustmentResult = Calculator.calculateAdjustment(value).setScale(2, RoundingMode.HALF_UP);
    }

    public void print(){
        System.out.println("The value provided is: " + value);
        System.out.println("The value after adjustment is: " + adjustmentResult);
    }
}

package Exercise06.Main;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

public class Exercise06 {
    private double value;
    private double adjustmentResult;

    public Exercise06(double value){
        this.value = value;
        adjustmentResult = Calculator.calculator(value);
    }

    public void print(){
        System.out.println("The value provided is: " + value);
        System.out.println("The value after adjustment is: " + adjustmentResult);
    }

    public double getValue(){
        return value;
    }
}

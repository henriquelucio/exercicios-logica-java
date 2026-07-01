package Exercicio03.Main;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

public class Exercicio03 {
    private int valueA;
    private int valueB;
    private int result;

    private int mathOperator(){
        if(valueA == valueB){
            return valueA + valueB;
        }else{
            return valueA * valueB;
        }
    }

    public void printer(){
        result = mathOperator();
        if(valueA == valueB){
            System.out.println("The numbers are equal, the sum math operation result is: " + result);
        }else{
            System.out.println("The numbers are different, the multiplier math operation result is: " + result);
        }
    }

    public void setValueA(int valueA){
        this.valueA = valueA;
    }

    public void setValueB(int valueB){
        this.valueB = valueB;
    }
}

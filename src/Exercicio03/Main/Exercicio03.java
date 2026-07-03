package Exercicio03.Main;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

public class Exercicio03{
    private int valueA;
    private int valueB;
    private MathOperation operation;

    public Exercicio03(int valueA, int valueB, MathOperation operation){
        this.valueA = valueA;
        this.valueB = valueB;
        this.operation = operation;
    }

    public void printer(){
        int result = operation.executeOperation(valueA, valueB);
        System.out.println("The " + operation.getDescription() + " operation result is: " + result);
    }
}

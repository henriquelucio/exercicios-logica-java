package Exercicio01.Main;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Exercicio01 {
    private int valueA;
    private int valueB;
    private int valueC;

    private int sumValueAWithValueB(){
        return this.valueA + this.valueB;
    }

    public void printer(){
        int sum = sumValueAWithValueB();
        System.out.println("The sum of value A: " + this.valueA + " and value B: " + this.valueB + " is " + sum);
        if(sum < this.valueC){
            System.out.println("The sum is smaller than Value C: " + this.valueC);
        }else if(sum > this.valueC){
            System.out.println("The sum is greater than Value C: " + this.valueC);
        }else{
            System.out.println("The sum is equal to Value C: " + this.valueC);
        }
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public void setValueB(int valueB){
        this.valueB = valueB;
    }

    public void setValueC(int valueC){
        this.valueC = valueC;
    }
}

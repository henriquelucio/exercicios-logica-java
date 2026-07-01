package Main;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Exercicio01 {
    private int valueA;
    private int valueB;
    private int valueC;

    private int somaValueAWithValueB(int valueA, int valueB){
        return valueA + valueB;
    }

    public void printer(){
        System.out.println("The sum of value A: " + valueA + " and value B: " + valueB + " is " + somaValueAWithValueB(valueA, valueB));
        if(somaValueAWithValueB(valueA, valueB) > valueC){
            System.out.println("The sum is greater than Value C: " + valueC);
        }else{
            System.out.println("The sum is smaller than Value C: " + valueC);
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

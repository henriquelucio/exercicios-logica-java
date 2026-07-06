package Exercise07.Main;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class Exercise07 {
    private int value1;
    private int value2;
    private int referenceValue1;
    private int referenceValue2;

    private boolean result1;
    private boolean result2;

    public Exercise07(int value1, int referenceValue1, int value2, int referenceValue2){
        this.value1 = value1;
        this.value2 = value2;
        this.referenceValue1 = referenceValue1;
        this.referenceValue2 = referenceValue2;
    }

    public void print(){
        result1 = value1 > referenceValue1;
        result2 = value2 < referenceValue2;

        System.out.println("The result of first comparison is " + result1);
        System.out.println("The result of second comparison is " + result2);

        if(result1 && result2){
            System.out.println("Both are true");
        }else if(!result1 || !result2){
            System.out.println("Both are false");
        }else{
            System.out.println("One is true and the other is false");
        }
    }
}

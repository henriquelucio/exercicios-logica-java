package Exercise19.Test;

// 19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Exercise19Test {
    public static void main(String[] args) {

        System.out.println("\nTabuada do 1 ao 10");

        for (int i = 1; i <= 10; i++) {

            System.out.println("\nTabuada do " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}

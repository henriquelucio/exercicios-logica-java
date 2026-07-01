package Exercicio01.Test;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import Exercicio01.Main.Exercicio01;
import java.util.Scanner;

public class Exercicio01Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercicio01 exercicio01 = new Exercicio01();

        System.out.println("Informe 3 valores inteiros, o programa ira somar o primeiro e segundo valor e verificar se é menor ou maior que o terceiro valor");
        System.out.println("Informe o primeiro valor (Valor A)");
        exercicio01.setValueA(input.nextInt());
        System.out.println("Informe o segundo valor (Valor B)");
        exercicio01.setValueB(input.nextInt());
        System.out.println("Informe o terceiro valor (Valor C)");
        exercicio01.setValueC(input.nextInt());

        exercicio01.printer();
    }
}

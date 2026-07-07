package Exercise08.Test;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise08Test {
    public static void main(String[] args) {
//        int[] array = new int[3];
//        int[] sortedArray = new int[3];
        int value1;
        int value2;
        int value3;
        int maior;
        int meio;
        int menor;

        Scanner input = new Scanner(System.in);

        System.out.println("Provide value 1: ");
        value1 = input.nextInt();
        System.out.println("Provide value 2: ");
        value2 = input.nextInt();
        System.out.println("Provide value 3: ");
        value3 = input.nextInt();

        if (value3 > value1 && value3 > value2){
            maior = value3;
            if(value2 > value1){
                meio = value2;
                menor = value1;
            }else{
                meio = value1;
                menor = value2;
            }
        }else if(value2 > value1){
            maior = value2;
            if(value1 > value3){
                meio = value1;
                menor = value3;
            }else{
                meio = value3;
                menor = value1;
            }
        }else{
            maior = value1;
            if(value2 > value3){
                meio = value2;
                menor = value3;
            }else{
                meio = value3;
                menor = value2;
            }
        }

        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);

        
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Provide value: ");
//            array[i] = input.nextInt();
//        }

        //array = IntStream.of(array).sorted().toArray();
//        for (int i = 0; i < array.length; i++){
//            sortedArray[i] = array[array.length-1-i];
//            System.out.println(sortedArray[i]);
//        }
    }
}

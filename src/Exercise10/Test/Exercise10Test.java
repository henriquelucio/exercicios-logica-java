package Exercise10.Test;

//  10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import Exercise10.Main.Exercise10;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise10Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] tempGradesArray = new double[3];

        System.out.println("Provide 3 grades and the program will calculate the average");
        for(int i = 0; i < tempGradesArray.length; i++){
            System.out.println("Provide a grade:");
            tempGradesArray[i] = input.nextDouble();
        }
        System.out.println("Calculating...");
        Exercise10.print(tempGradesArray);
    }
}

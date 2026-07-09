package Exercise11.Test;

// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import Exercise11.Main.Exercise11;

import java.util.Scanner;

public class Exercise11Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName;
        double[] gradesArray = new double[4];

        System.out.println("Provide the student name and his 4 grades, the program will calculate if is approved or reproved");
        System.out.println("Provide the student's name:");
        studentName = input.nextLine();
        for (int i = 0; i < gradesArray.length; i++) {
            System.out.println("Provide the students grade:");
            gradesArray[i] = input.nextDouble();
        }

        Exercise11.print(studentName, gradesArray);
    }
}

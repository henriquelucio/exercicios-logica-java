package Exercise15.Test;

// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
// (Ex: 5 anos, 2 meses e 15 dias de vida)

import Exercise15.Main.Exercise15;

import java.util.Scanner;

public class Exercise15Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter your birth date and the program will calculate approximate time you lived");
        System.out.println("Enter the day:");
        int birthDay = input.nextInt();
        System.out.println("Enter the month:");
        int birthMonth = input.nextInt();
        System.out.println("Enter the year:");
        int birthYear = input.nextInt();

        System.out.println("\nBased on actual date (11/07/2026) your age is");

        Exercise15.print(birthDay, birthMonth, birthYear);
    }
}

package Exercise15.Main;

// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
// (Ex: 5 anos, 2 meses e 15 dias de vida)

public class Exercise15 {

    public static void print(int day, int month, int year) {
        System.out.println("\n" + TimeCalculator.calculateYears(year) + " Years");
        System.out.println(TimeCalculator.calculateMonths(month) + "Months");
        System.out.println(TimeCalculator.calculateDays(day) + "Days");
    }
}

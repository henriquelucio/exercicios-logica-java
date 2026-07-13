package Exercise15.BruteLogic.Main;

// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
// (Ex: 5 anos, 2 meses e 15 dias de vida)

public class Exercise15 {
    TimeCalculator timeCalculator = new TimeCalculator();

    public void print(int day, int month, int year) {
        timeCalculator.calculateAge(day, month, year);
        System.out.println("The person is " + timeCalculator.getYearsOld() + " years, " + timeCalculator.getMonthsOld() + " months and " + timeCalculator.getDaysOld() + " days old.");
    }
}

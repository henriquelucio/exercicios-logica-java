package Exercise15.LocalDate.Main;

// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
// (Ex: 5 anos, 2 meses e 15 dias de vida)

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise15 {
    TimeCalculator timeCalculator = new TimeCalculator();
    private LocalDate age;

    public void print(int day, int month, int year) {
        age = timeCalculator.calculateAge(day, month, year);
        System.out.println("\nYou are " + age.format(DateTimeFormatter.ofPattern("yy' years, 'MM' months and 'dd' days old'")));
    }
}

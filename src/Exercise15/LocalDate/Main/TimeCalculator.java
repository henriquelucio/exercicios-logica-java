package Exercise15.LocalDate.Main;

import java.time.LocalDate;

public class TimeCalculator {
    private LocalDate actualDate;
    private LocalDate age;

    public LocalDate calculateAge(int day, int month, int year) {
        actualDate = LocalDate.now();
        age = actualDate.minusDays(day).minusMonths(month).minusYears(year);

        return age;
    }
}

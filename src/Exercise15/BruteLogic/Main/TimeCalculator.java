package Exercise15.BruteLogic.Main;

public class TimeCalculator {
    private final int actualDay = 11;
    private final int actualMonth = 7;
    private final int actualYear = 2026;
    private int daysOld = 0;
    private int monthsOld = 0;
    private int yearsOld = 0;
    private final int totalDaysInMonth = 30;
    private final int totalMonthsInYear = 12;
    private boolean borrowedFromMonth = false;
    private boolean borrowedFromYear = false;

    public void calculateAge(int day, int month, int year) {

        if (day > actualDay) {
            borrowedFromMonth = true;
            daysOld = (totalDaysInMonth - day) + actualDay;
        } else {
            daysOld = actualDay - day;
        }

        if (borrowedFromMonth) {
            month += 1;
        }

        if (month > actualMonth) {
            borrowedFromYear = true;
            monthsOld = (totalMonthsInYear + actualMonth) - month;
        } else {
            monthsOld = actualMonth - month;
        }

        if(borrowedFromYear){
            year += 1;
        }

        yearsOld = actualYear - year;
    }

    public int getDaysOld(){
        return daysOld;
    }

    public int getMonthsOld(){
        return monthsOld;
    }

    public int getYearsOld(){
        return yearsOld;
    }
}

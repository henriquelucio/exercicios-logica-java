package Exercise11.Main;

public class AverageCalculator {

    public static double averageGradeCalculator(double[] gradesArray) {
        double average = 0;

        for (double grade : gradesArray) {
            average += grade;
        }

        return average / gradesArray.length;
    }
}

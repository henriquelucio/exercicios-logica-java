package Exercise10.Main;

public class AverageCalculator {

    public static double averageGrade(double[] grades) {
        double value = 0;

        for (double grade : grades) {
            value += grade;
        }

        return value / grades.length;
    }
}

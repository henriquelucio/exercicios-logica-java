package Exercise16.Main;

public class TriangleHandler {

    public void triangleValidator(double sideA, double sideB, double sideC) {
        if (sideA > 0 && sideB > 0 && sideC > 0 && (sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
            System.out.println("The triangle is valid!");
            System.out.println("\nCalculating the triangle type...");
            triangleTypeCalculator(sideA, sideB, sideC);
        } else {
            System.out.println("The triangle is not valid!");
            System.out.println("\nFinishing the program - try again!");
        }
    }

    public void triangleTypeCalculator(double sideA, double sideB, double sideC) {
        if (sideA == sideB && sideA == sideC) {
            System.out.println("The triangle is an Equilateral Triangle type");
        } else if ((sideA == sideB) || (sideA == sideC) || (sideB == sideC)) {
            System.out.println("The triangle is an Isosceles Triangle type");
        } else {
            System.out.println("The triangle is an Scalene Triangle type");
        }
    }
}

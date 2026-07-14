package Exercise16.Main;

// 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

public class Exercise16 {
    TriangleHandler triangleHandler = new TriangleHandler();

    public void print(double sideA, double sideB, double sideC){
        System.out.println("\nThe side values are:");
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);

        System.out.println("\nStarting triangle validator..");
        triangleHandler.triangleValidator(sideA, sideB, sideC);
    }
}

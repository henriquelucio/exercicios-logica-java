package exercise24.main;

// 24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.

//Fórmula: distância = tempo x velocidade.
//          litros usados = distância / 12.

public class Exercise24 {
    private double distanceInKM;
    private double timeInHours;
    private double litersConsumed;

    private final double SPEED = 80.0d;
    private final double CONSUME_PER_KM = 12.0d;

    public Exercise24(double timeInHours){
        this.timeInHours = timeInHours;
    }

    public void print(){
        Calculator calculator = new Calculator();

        System.out.println("\nThe pilot will drive for " + timeInHours + " hours");

        distanceInKM = calculator.distanceCalculator(timeInHours, SPEED);
        System.out.println("At an steady speed of " + SPEED + " he will drive for " + distanceInKM + " kilometers");

        litersConsumed = calculator.litersCalculator(distanceInKM, CONSUME_PER_KM);
        System.out.println("Using the total amount of " + litersConsumed + " liters of gas");
    }
}

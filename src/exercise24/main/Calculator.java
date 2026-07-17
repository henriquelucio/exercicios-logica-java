package exercise24.main;

public class Calculator {

    public double distanceCalculator(double timeInHours, double SPEED){
        return timeInHours*SPEED;
    }

    public double litersCalculator(double distance, double CONSUME_PER_KM){
        return distance/CONSUME_PER_KM;
    }
}

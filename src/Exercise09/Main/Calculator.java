package Exercise09.Main;

public class Calculator {

    public static double BMICalculator(double height, double weight){
        return weight/(height * height);
    }

//    public static String setTableResult(double result){
//        String message = "";
//
//        if(result < 18.5){
//            message = "Your result is " + result + ", you are underweight";
//        } else if (result >= 18.5 && result < 25.0) {
//            message = "Your result is " + result + ", you are at normal weight";
//        } else if (result >= 25.0 && result < 30.0) {
//            message = "Your result is " + result + ", you are overweight";
//        } else if (result >= 30.0 && result < 35.0) {
//            message = "Your result is " + result + ", you are obese (class 1)";
//        } else if (result >= 35.0 && result < 40.0) {
//            message = "Your result is " + result + ", you are obese (class 2)";
//        } else if (result >= 40.0) {
//            message = "Your result is " + result + ", you are obese (class 3)";
//        }
//
//        return message;
//    }
}

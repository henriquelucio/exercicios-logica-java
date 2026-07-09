package Exercise09.Main;

public enum TypeBMI {
    UNDERWEIGHT(Double.MIN_VALUE, 18.5, "You are underweight"),
    NORMAL_WEIGHT(18.5, 25.0, "You are at normal weight"),
    OVERWEIGHT(25.0, 30.0, "You are overweight"),
    OBESE_CLASS1(30.0, 35.0, "You are overweight"),
    OBESE_CLASS2(35.0, 40.0, "You are overweight"),
    OBESE_CLASS3(40.0, Double.MAX_VALUE, "You are overweight");

    private final double minValue;
    private final double maxValue;
    private final String message;

    TypeBMI(double minValue, double maxValue, String message){
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.message = message;
    }

    public static String typeBMIOnResult(double result){
        for (TypeBMI typeBMI : values()) {
            if(result > typeBMI.getMinValue() && result <= typeBMI.getMaxValue()){
                return typeBMI.getMessage();
            }
        }
        return null;
    }

    public double getMinValue(){
        return minValue;
    }

    public double getMaxValue(){
        return maxValue;
    }

    public String getMessage(){
        return message;
    }
}

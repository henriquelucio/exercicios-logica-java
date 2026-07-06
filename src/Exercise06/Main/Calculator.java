package Exercise06.Main;

import java.math.BigDecimal;

public class Calculator {

    public static BigDecimal calculateAdjustment(double value){
        BigDecimal stringValue = new BigDecimal(String.valueOf(value));
        return stringValue.multiply(new BigDecimal("1.05"));
    }
}

package Exercise05.Main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalaryCalculator{

    public static BigDecimal salaryCalculator(BigDecimal minimumSalary, BigDecimal employeeSalary){
        return employeeSalary.divide(minimumSalary, 3, RoundingMode.HALF_UP);
    }
}

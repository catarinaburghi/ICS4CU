package Unit2.Lesson10Final;
/*Catarina Fagundes Burghi
 * Date: April 6th 2022
 * This program is the class file for FrmCurrencyConversions.java
 * This program deals with converting the inputed CAD amount into any currency according to the 
 * inputted rate by the user and then returning the answer back to the main program
 * using BigDecimal and rounding using RouncingMode. This class also checks numbers inputted by the 
 * user and uses a throw statement to let the user know of the error and how to fix it.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversions {

    public static BigDecimal convert (BigDecimal amount, BigDecimal rate){

        // if statement to check if the user didn't input any 0 that can't be converted
        if(amount.compareTo(BigDecimal.ZERO) <= 0 || rate.compareTo(BigDecimal.ZERO) <= 0){
            
            // throw statement to let the user know the error and how to fix it.
            throw new ArithmeticException("You need to input numbers higher than zero");
        }

        // declaring variables
        BigDecimal answer;

        // calculations and rounding
        answer = amount.multiply(rate);
        answer = answer.setScale(2, RoundingMode.HALF_UP);

        // return statement
        return (answer);
    }

}


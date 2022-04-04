package Unit2.Lesson10;
/*Catarina Fagundes Burghi
 * Date: April 4th 2022
 * This program is the class file for FrmCurrencyConverter.java
 * This program deals with converting the inputed CAD amount into USD
 * using BigDecimal and rounding using RouncingMode.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Currency {
    
    public BigDecimal convert (BigDecimal amount, BigDecimal rate){

        BigDecimal answer;

        answer = amount.multiply(rate);
        answer = answer.setScale(2, RoundingMode.HALF_UP);

        return (answer);
    }
}

package Unit2.Lesson10;

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

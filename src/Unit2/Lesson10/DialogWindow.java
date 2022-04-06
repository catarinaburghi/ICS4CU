package Unit2.Lesson10;
/*Catarina Fagundes Burghi
 * Date: April 5th 2022
 * This class is the class for the FrmAverageCalculator.java file and FrmCurrencyConverter.java
 * This class makes a frame to indicate to the user that there is an error in one of the
 * text fields.
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogWindow {
    JFrame f;
    DialogWindow(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Something went wrong. Please enter only numbers", 
        "Error Dialog", JOptionPane.ERROR_MESSAGE);
    }
}

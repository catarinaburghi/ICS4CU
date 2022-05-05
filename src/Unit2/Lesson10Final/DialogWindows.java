package Unit2.Lesson10Final;
/*Catarina Fagundes Burghi
 * Date: April 6th 2022
 * This class is the class for the FrmCurrencyConversions.java
 * This class makes a frame to indicate to the user that there is an error in one of the
 * text fields.
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogWindows {
    // creates a frame to output errors
    JFrame f;
    DialogWindows(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Please only input numbers", 
        "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}








package Unit2.Lesson10Final;
/*Catarina Fagundes Burghi
 * Date: April 6th 2022
 * This program is a final assignment that asks the user for the amound in CAD
 * that they would like to convert to any currency according to the rate that they inputted.
 * It calls a class to deal with the calculations and the class returns the answer
 * It also calls a class to tell the user when something went wrong.
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

public class FrmCurrencyConversions extends JFrame {

	private JPanel contentPane;
	private JTextField txtCAD;
	private JTextField txtRate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCurrencyConversions frame = new FrmCurrencyConversions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmCurrencyConversions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Currency Conversions");
		lblTitle.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 16));
		lblTitle.setBounds(10, 11, 208, 14);
		contentPane.add(lblTitle);
		
		JLabel lblCAD = new JLabel("Please insert the amount in CAD:");
		lblCAD.setFont(new Font("Dubai", Font.PLAIN, 13));
		lblCAD.setBounds(10, 61, 208, 14);
		contentPane.add(lblCAD);
		
		txtCAD = new JTextField();
		txtCAD.setBounds(239, 58, 86, 20);
		contentPane.add(txtCAD);
		txtCAD.setColumns(10);
		
		JLabel lblInstruction1 = new JLabel("Please enter the current rate for the ");
		lblInstruction1.setFont(new Font("Dubai", Font.PLAIN, 13));
		lblInstruction1.setBounds(10, 100, 208, 14);
		contentPane.add(lblInstruction1);
		
		JLabel lblInstruction2 = new JLabel("currency you would like to convert to:");
		lblInstruction2.setFont(new Font("Dubai", Font.PLAIN, 13));
		lblInstruction2.setBounds(10, 115, 219, 14);
		contentPane.add(lblInstruction2);
		
		txtRate = new JTextField();
		txtRate.setBounds(239, 112, 86, 20);
		contentPane.add(txtRate);
		txtRate.setColumns(10);
		
		JLabel lblAnswer = new JLabel("");
		lblAnswer.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 15));
		lblAnswer.setBounds(181, 181, 219, 23);
		contentPane.add(lblAnswer);
		
		JLabel lblNewLabel = new JLabel("Rates: USD = 1.25 / Real = 3.75 / Yen = 99.01 / Euro = 0.73 ");
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 36, 401, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Initializing class
				Conversions convert = new Conversions();

				// try and catch statement
				try{

					// declaring variables and collecting user input from text boxes
					BigDecimal Answer;
					BigDecimal rate = new BigDecimal(txtRate.getText());
					BigDecimal cad = new BigDecimal(txtCAD.getText());

					// Calling the function in our class to output the answer
					Answer = Conversions.convert(rate, cad);
					lblAnswer.setText("$" + (Answer));

				} catch(NumberFormatException c){

					// initializing JOptionPane class for outputting errors
					DialogWindows pane = new DialogWindows();

				}
			}
		});
		btnConvert.setBounds(36, 181, 89, 23);
		contentPane.add(btnConvert);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(164, 227, 89, 23);
		contentPane.add(btnExit);
	}
}

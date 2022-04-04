package Unit2.Lesson10;
/*Catarina Fagundes Burghi
 * Date: April 4th 2022
 * This program is a step by step assignment that uses a class to deal with 
 * converting CAD to USD.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class FrmCurrencyConverter extends JFrame {

	private JPanel contentPane;
	private JTextField txtCAD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCurrencyConverter frame = new FrmCurrencyConverter();
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
	public FrmCurrencyConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Currency Converter");
		lblTitle.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 14));
		lblTitle.setForeground(Color.GREEN);
		lblTitle.setBounds(145, 11, 146, 14);
		contentPane.add(lblTitle);
		
		JLabel lblInstructions = new JLabel("Enter Dollar amount in Canadian Dollars:");
		lblInstructions.setFont(new Font("Dubai", Font.BOLD, 13));
		lblInstructions.setBounds(95, 47, 255, 14);
		contentPane.add(lblInstructions);
		
		txtCAD = new JTextField();
		txtCAD.setBounds(175, 72, 86, 20);
		contentPane.add(txtCAD);
		txtCAD.setColumns(10);

        JLabel lblAnswer = new JLabel("");
		lblAnswer.setFont(new Font("Dubai", Font.PLAIN, 11));
		lblAnswer.setForeground(Color.RED);
		lblAnswer.setBounds(145, 195, 146, 14);
		contentPane.add(lblAnswer);
		
		// action button 
		JButton btnConvert = new JButton("Convert to USD");
		btnConvert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// initializing the class
                Currency converter = new Currency();

				// declaring variables
                BigDecimal Answer;
                BigDecimal rate = new BigDecimal("1.25");
                BigDecimal cad = new BigDecimal(txtCAD.getText());

				// Calling the function in our class to output the answer
                Answer = converter.convert(cad, rate);
                lblAnswer.setText("USD = $ " + (Answer));
			}
		});
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConvert.setFont(new Font("Dubai", Font.BOLD, 12));
		btnConvert.setBounds(145, 119, 146, 23);
		contentPane.add(btnConvert);
		
	}
}

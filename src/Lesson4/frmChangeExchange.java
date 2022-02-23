package Lesson4;
/*Catarina Fagundes Burghi
 * Date: February 17th 2022
 * This program simulates a calculator to exchange a big amount of money into coins.
 * This program demonstrates the use of calculations in java and uses Math.Floor for rounding calculations down.
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
import javax.swing.ImageIcon;

public class FrmChangeExchange extends JFrame {

	private JPanel contentPane;
	private JTextField textAmount;
	private JTextField textToonies;
	private JTextField textLoonies;
	private JTextField textQuarters;
	private JTextField textDimes;
	private JTextField textNickels;
	private JTextField textPennies;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmChangeExchange frame = new FrmChangeExchange();
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
	public FrmChangeExchange() {
		setTitle("Change Exchange");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Change Exchange");
		lblTitle.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		lblTitle.setForeground(new Color(255, 0, 0));
		lblTitle.setBounds(10, 11, 144, 28);
		contentPane.add(lblTitle);
		
		JLabel lblEnter = new JLabel("Enter amount you want exchanged:");
		lblEnter.setFont(new Font("Book Antiqua", Font.BOLD, 11));
		lblEnter.setBounds(10, 50, 214, 14);
		contentPane.add(lblEnter);
		
		textAmount = new JTextField();
		textAmount.setBounds(20, 75, 86, 20);
		contentPane.add(textAmount);
		textAmount.setColumns(10);
		
		JLabel lblTonnies = new JLabel("Toonies:");
		lblTonnies.setFont(new Font("Book Antiqua", Font.BOLD, 11));
		lblTonnies.setBounds(20, 125, 69, 14);
		contentPane.add(lblTonnies);
		
		textToonies = new JTextField();
		textToonies.setBounds(100, 122, 86, 20);
		contentPane.add(textToonies);
		textToonies.setColumns(10);
		
		JLabel lblLoonies = new JLabel("Loonies:");
		lblLoonies.setFont(new Font("Book Antiqua", Font.BOLD, 11));
		lblLoonies.setBounds(20, 169, 57, 14);
		contentPane.add(lblLoonies);
		
		textLoonies = new JTextField();
		textLoonies.setBounds(100, 166, 86, 20);
		contentPane.add(textLoonies);
		textLoonies.setColumns(10);
		
		JLabel lblQuarters = new JLabel("Quarters:");
		lblQuarters.setFont(new Font("Book Antiqua", Font.BOLD, 11));
		lblQuarters.setBounds(20, 211, 57, 14);
		contentPane.add(lblQuarters);
		
		textQuarters = new JTextField();
		textQuarters.setBounds(100, 208, 86, 20);
		contentPane.add(textQuarters);
		textQuarters.setColumns(10);
		
		JLabel lblDimes = new JLabel("Dimes:");
		lblDimes.setFont(new Font("Book Antiqua", Font.BOLD, 11));
		lblDimes.setBounds(258, 125, 46, 14);
		contentPane.add(lblDimes);
		
		textDimes = new JTextField();
		textDimes.setBounds(314, 122, 86, 20);
		contentPane.add(textDimes);
		textDimes.setColumns(10);
		
		JLabel lblNickels = new JLabel("Nickels:");
		lblNickels.setFont(new Font("Book Antiqua", Font.BOLD, 11));
		lblNickels.setBounds(258, 169, 46, 14);
		contentPane.add(lblNickels);
		
		textNickels = new JTextField();
		textNickels.setBounds(314, 166, 86, 20);
		contentPane.add(textNickels);
		textNickels.setColumns(10);
		
		JLabel lblPennies = new JLabel("Pennies:");
		lblPennies.setFont(new Font("Book Antiqua", Font.BOLD, 11));
		lblPennies.setBounds(258, 211, 57, 14);
		contentPane.add(lblPennies);
		
		textPennies = new JTextField();
		textPennies.setBounds(314, 208, 86, 20);
		contentPane.add(textPennies);
		textPennies.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// action code for the button "calculate"
				
				//declaring variables
				double amount, remainder, toonies , loonies, quarters, dimes, nickels, pennies, cents;
				
				//get user input from text box
				amount= Double.parseDouble(textAmount.getText());
				
				//Calculating the exchange 
				//calculations for the toonies and rounding
				toonies = amount / 2;
				toonies = Math.floor(toonies);
				remainder = amount - (toonies*2);
				
				//calculations for the loonies and rounding
				loonies = remainder / 1;
				loonies = Math.floor(loonies);
				cents = remainder - loonies;
				
				//calculations for the quarters and rounding
				quarters = cents / 0.25;
				quarters = Math.floor(quarters);
				remainder = cents - (quarters*0.25);
				
				//calculations for the dimes and rounding
				dimes = remainder / 0.10;
				dimes = Math.floor(dimes);
				cents = remainder - (dimes*0.10);
				
				//calculations for the nickels and rounding
				nickels = cents / 0.05;
				nickels = Math.floor(nickels);
				remainder = cents - (nickels*0.05);
				
				// calculations for pennies
				pennies = remainder / 0.01;
				
			    // set text boxes to output results
			    textToonies.setText(" " + String.format("%.0f", toonies));
			    textLoonies.setText(" " + String.format("%.0f", loonies));
			    textQuarters.setText(" " + String.format("%.0f", quarters));
			    textDimes.setText(" " + String.format("%.0f", dimes));
			    textNickels.setText(" " + String.format("%.0f", nickels));
			    textPennies.setText(" " + String.format("%.0f", pennies));
				
			}
		});
		btnCalculate.setBounds(116, 75, 110, 23);
		contentPane.add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//action code for the button "exit"
				
				//exits the program when button is clicked
				System.exit(0);
			}
			
		});
		btnExit.setBounds(165, 239, 110, 23);
		contentPane.add(btnExit);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(FrmChangeExchange.class.getResource("/Lesson4/img/coin.jpg")));
		lblImage.setBounds(240, 0, 228, 99);
		contentPane.add(lblImage);
	}
}

package Unit1.Lesson4;
/*Catarina Fagundes Burghi
 * Date: February 18th 2022
 * This program simulates a calculator to calculate how many days a person has been alive with 2 inputted dates,
 * and it also calculates how many hours of those days you have slept.
 * This program demonstrates the use of calculations in java.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSleepCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtBirthDay;
	private JTextField txtBirthMonth;
	private JTextField txtBirthYear;
	private JTextField txtTodayDay;
	private JTextField txtTodayMonth;
	private JTextField txtTodayYear;
	private JTextField txtTotalDays;
	private JTextField txtTotalSleeping;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSleepCalculator frame = new FrmSleepCalculator();
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
	public FrmSleepCalculator() {
		setTitle("Sleep Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Sleep Calculator");
		lblTitle.setForeground(new Color(148, 0, 211));
		lblTitle.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 15));
		lblTitle.setBounds(141, 11, 122, 20);
		contentPane.add(lblTitle);
		
		JLabel lblEnterBirthdate = new JLabel("Enter your birth date:");
		lblEnterBirthdate.setFont(new Font("Bodoni MT", Font.ITALIC, 13));
		lblEnterBirthdate.setForeground(new Color(148, 0, 211));
		lblEnterBirthdate.setBounds(10, 57, 130, 14);
		contentPane.add(lblEnterBirthdate);
		
		JLabel lblBirthDay = new JLabel("Day:");
		lblBirthDay.setForeground(new Color(148, 0, 211));
		lblBirthDay.setFont(new Font("Bodoni MT", Font.BOLD, 13));
		lblBirthDay.setBounds(10, 82, 32, 14);
		contentPane.add(lblBirthDay);
		
		JLabel lblBirthMonth = new JLabel("Month:");
		lblBirthMonth.setForeground(new Color(148, 0, 211));
		lblBirthMonth.setFont(new Font("Bodoni MT", Font.BOLD, 13));
		lblBirthMonth.setBounds(64, 82, 46, 14);
		contentPane.add(lblBirthMonth);
		
		JLabel lblBirthYear = new JLabel("Year:");
		lblBirthYear.setFont(new Font("Bodoni MT", Font.BOLD, 13));
		lblBirthYear.setForeground(new Color(148, 0, 211));
		lblBirthYear.setBounds(122, 82, 46, 14);
		contentPane.add(lblBirthYear);
		
		txtBirthDay = new JTextField();
		txtBirthDay.setBounds(10, 119, 32, 20);
		contentPane.add(txtBirthDay);
		txtBirthDay.setColumns(10);
		
		txtBirthMonth = new JTextField();
		txtBirthMonth.setBounds(66, 119, 32, 20);
		contentPane.add(txtBirthMonth);
		txtBirthMonth.setColumns(10);
		
		txtBirthYear = new JTextField();
		txtBirthYear.setBounds(122, 119, 38, 20);
		contentPane.add(txtBirthYear);
		txtBirthYear.setColumns(10);
		
		JLabel lblEnterDate = new JLabel("Enter Today's date:");
		lblEnterDate.setFont(new Font("Bodoni MT", Font.ITALIC, 13));
		lblEnterDate.setForeground(new Color(148, 0, 211));
		lblEnterDate.setBounds(268, 57, 110, 14);
		contentPane.add(lblEnterDate);
		
		JLabel lblTodayDay = new JLabel("Day:");
		lblTodayDay.setForeground(new Color(148, 0, 211));
		lblTodayDay.setFont(new Font("Bodoni MT", Font.BOLD, 13));
		lblTodayDay.setBounds(268, 82, 32, 14);
		contentPane.add(lblTodayDay);
		
		JLabel lblTodayMonth = new JLabel("Month:");
		lblTodayMonth.setForeground(new Color(148, 0, 211));
		lblTodayMonth.setFont(new Font("Bodoni MT", Font.BOLD, 13));
		lblTodayMonth.setBounds(310, 82, 46, 14);
		contentPane.add(lblTodayMonth);
		
		JLabel lblTodayYear = new JLabel("Year:");
		lblTodayYear.setForeground(new Color(148, 0, 211));
		lblTodayYear.setFont(new Font("Bodoni MT", Font.BOLD, 13));
		lblTodayYear.setBounds(366, 82, 46, 14);
		contentPane.add(lblTodayYear);
		
		txtTodayDay = new JTextField();
		txtTodayDay.setBounds(268, 119, 32, 20);
		contentPane.add(txtTodayDay);
		txtTodayDay.setColumns(10);
		
		txtTodayMonth = new JTextField();
		txtTodayMonth.setBounds(321, 119, 32, 20);
		contentPane.add(txtTodayMonth);
		txtTodayMonth.setColumns(10);
		
		txtTodayYear = new JTextField();
		txtTodayYear.setBounds(366, 119, 38, 20);
		contentPane.add(txtTodayYear);
		txtTodayYear.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for the calculate button
				
				//declaring variables
				double bday, bmonth, byear, tday, tmonth, tyear, totalday, totaldays, totalmonths, totalyears, hours, thours;
				
				//get user input from text box
				bday = Double.parseDouble(txtBirthDay.getText());
				bmonth = Double.parseDouble(txtBirthMonth.getText());
				byear = Double.parseDouble(txtBirthYear.getText());
				tday = Double.parseDouble(txtTodayDay.getText());
				tmonth = Double.parseDouble(txtTodayMonth.getText());
				tyear = Double.parseDouble(txtTodayYear.getText());
				
				//calculations for the amount of days the user has inputted
				 totalyears = tyear - byear;
				 totalmonths = tmonth - bmonth;
				 totalday = tday - bday;
				 
				 //calculations for total days awake and total hours sleeping
				 totaldays = (totalyears * 365) + (totalmonths * 30) + totalday;
				 hours = totaldays * 24;
				 thours = hours / 3;
				 
				 // set text box to output results
				 txtTotalDays.setText("You have been alive for " + String.format("%.0f", totaldays) + " days.");
				 txtTotalSleeping.setText("Your have slept " + String.format("%.0f", thours) + " hours.");
				 
				 
				
			}
		});
		btnCalculate.setForeground(new Color(123, 104, 238));
		btnCalculate.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 13));
		btnCalculate.setBounds(151, 162, 112, 23);
		contentPane.add(btnCalculate);
		
		txtTotalDays = new JTextField();
		txtTotalDays.setBounds(10, 196, 195, 20);
		contentPane.add(txtTotalDays);
		txtTotalDays.setColumns(10);
		
		txtTotalSleeping = new JTextField();
		txtTotalSleeping.setBounds(214, 196, 193, 20);
		contentPane.add(txtTotalSleeping);
		txtTotalSleeping.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for exit button
				// closes the program when user clicks exit
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 13));
		btnExit.setForeground(new Color(123, 104, 238));
		btnExit.setBounds(164, 227, 89, 23);
		contentPane.add(btnExit);
	}
}

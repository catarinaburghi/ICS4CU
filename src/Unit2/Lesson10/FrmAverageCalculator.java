package Unit2.Lesson10;
/*Catarina Fagundes Burghi
 * Date: April 5th 2022
 * This program is a step by step assignment that uses a class to deal to calculate the 
 * average of 4 ints and also uses a different class for outputting errors
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmAverageCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtGrade1;
	private JTextField txtGrade2;
	private JTextField txtGrade3;
	private JTextField txtGrade4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAverageCalculator frame = new FrmAverageCalculator();
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
	public FrmAverageCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Average Calculator");
		lblTitle.setFont(new Font("Dubai", Font.BOLD, 14));
		lblTitle.setBounds(149, 11, 138, 14);
		contentPane.add(lblTitle);
		
		JLabel lblGrade1 = new JLabel("Grade 1:");
		lblGrade1.setBounds(33, 50, 58, 14);
		contentPane.add(lblGrade1);
		
		JLabel lblGrade2 = new JLabel("Grade 2:");
		lblGrade2.setBounds(33, 81, 58, 14);
		contentPane.add(lblGrade2);
		
		JLabel lblGrade3 = new JLabel("Grade 3:");
		lblGrade3.setBounds(33, 112, 58, 14);
		contentPane.add(lblGrade3);
		
		JLabel lblGrade4 = new JLabel("Grade 4:");
		lblGrade4.setBounds(33, 143, 58, 14);
		contentPane.add(lblGrade4);
		
		txtGrade1 = new JTextField();
		txtGrade1.setBounds(110, 47, 39, 20);
		contentPane.add(txtGrade1);
		txtGrade1.setColumns(10);
		
		txtGrade2 = new JTextField();
		txtGrade2.setBounds(110, 78, 39, 20);
		contentPane.add(txtGrade2);
		txtGrade2.setColumns(10);
		
		txtGrade3 = new JTextField();
		txtGrade3.setBounds(110, 109, 39, 20);
		contentPane.add(txtGrade3);
		txtGrade3.setColumns(10);
		
		txtGrade4 = new JTextField();
		txtGrade4.setBounds(110, 140, 39, 20);
		contentPane.add(txtGrade4);
		txtGrade4.setColumns(10);

		JLabel lblAverage = new JLabel("");
		lblAverage.setBounds(228, 81, 163, 14);
		contentPane.add(lblAverage);
		
		// action button 
		JButton btnCalculate = new JButton("Calculate Average");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// initializing class
                Calculator ac = new Calculator();

				// declaring variables
                int mark1, mark2, mark3, mark4;
				int average;

				// try and catch statement to handle exceptions
				try{

				// getting user input from text boxes
                mark1=Integer.parseInt(txtGrade1.getText());
				mark2=Integer.parseInt(txtGrade2.getText());
				mark3=Integer.parseInt(txtGrade3.getText());
				mark4=Integer.parseInt(txtGrade4.getText());

				// calling the function in our class to calculate the average
                average = ac.averagecalculate(mark1, mark2, mark3, mark4);

				// outputting the answer
				lblAverage.setText("The average is " + average);

					// printing errors to indicate that something is wrong to the user
				} catch (NumberFormatException c){
					
					// Printing message on console
					System.out.println("Something went wrong");
					System.out.println("Please only enter numbers");

					// Dialog window
					//Shell shell = new Shell();
					//MessageBox dialog = new MessageBox(shell, SWT.ERROR | SWT.OK | SWT.CANCEL);
					//dialog.setText("Error");
					//dialog.setMessage("One of the fields has invalid data");
					//dialog.open();

					
					//JOptionPane
					DialogWindow pane = new DialogWindow();

				}
			}
		});
		btnCalculate.setBounds(228, 46, 163, 23);
		contentPane.add(btnCalculate);
		
	}
}

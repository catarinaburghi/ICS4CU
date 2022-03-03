package Lesson4;

/*Catarina Burghi
 * Date: March 1st 2022
 * This program simulates requirement calculator to check if 
 * a person can ride a roller coaster.
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmRollerCoaster extends JFrame {

	private JPanel contentPane;
	private JTextField txtHeight;
	private JTextField txtBack;
	private JTextField txtHeart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRollerCoaster frame = new FrmRollerCoaster();
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
	public FrmRollerCoaster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Roller Coaster Ride!");
		lblTitle.setForeground(Color.RED);
		lblTitle.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		lblTitle.setBounds(146, 11, 131, 14);
		contentPane.add(lblTitle);

		JLabel lblHeight = new JLabel("Height in cm?");
		lblHeight.setFont(new Font("Dubai", Font.BOLD, 12));
		lblHeight.setBounds(59, 58, 78, 14);
		contentPane.add(lblHeight);

		txtHeight = new JTextField();
		txtHeight.setBounds(256, 55, 86, 20);
		contentPane.add(txtHeight);
		txtHeight.setColumns(10);

		JLabel lblBack = new JLabel("Back Trouble (Y/N)?");
		lblBack.setFont(new Font("Dubai", Font.BOLD, 12));
		lblBack.setBounds(59, 89, 108, 14);
		contentPane.add(lblBack);

		txtBack = new JTextField();
		txtBack.setBounds(256, 86, 86, 20);
		contentPane.add(txtBack);
		txtBack.setColumns(10);

		JLabel lblHeart = new JLabel("Heart Trouble (Y/N)?");
		lblHeart.setFont(new Font("Dubai", Font.BOLD, 12));
		lblHeart.setBounds(59, 127, 114, 14);
		contentPane.add(lblHeart);

		txtHeart = new JTextField();
		txtHeart.setBounds(256, 124, 86, 20);
		contentPane.add(txtHeart);
		txtHeart.setColumns(10);

		JLabel lblAnswer = new JLabel("");
		lblAnswer.setFont(new Font("Dubai", Font.ITALIC, 13));
		lblAnswer.setBounds(97, 170, 226, 14);
		contentPane.add(lblAnswer);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for the calculate button

				// declaring variables
				double height;
				String back, heart;
				// get user input from text box
				height = Double.parseDouble(txtHeight.getText());
				back = (txtBack.getText());
				heart = (txtHeart.getText());

				// If statements and Boolean Operators
				if ((height >= 122) && (height <= 188) && (back.equals("N") || back.equals("n"))
						&& (heart.equals("N") || (heart.equals("n")))) {
					lblAnswer.setText("You are allowed on this ride! Have fun!");
				} else {
					lblAnswer.setText("You are not allowed on this ride. Sorry.");
				}

			}
		});

		btnCalculate.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 12));
		btnCalculate.setBounds(59, 209, 89, 23);
		contentPane.add(btnCalculate);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// action to close program
				System.exit(0);
			}
		});

		btnExit.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 12));
		btnExit.setBounds(253, 209, 89, 23);
		contentPane.add(btnExit);
	}
}

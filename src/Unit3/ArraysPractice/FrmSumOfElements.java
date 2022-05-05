package Unit3.ArraysPractice;

/*Catarina Burghi
 * Date: April 26th 2022
 * This program creates a JFrame that gets inputs from the users to create a list using an ArrayList
 * and this program has the ability to list all the inputs, remove inputs, sort all the inputs from
 * lowest to highest, calculate the sum of everything, calculate the sum of the even inputs, and 
 * calculate the sum of the odd inputs.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FrmSumOfElements extends JFrame {

	// Initializing the ArrayList at the start of the program so it can
	// be used in the entire program.

	ArrayList<String> ints = new ArrayList();

	private JPanel contentPane;
	private JTextField txtUser;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSumOfElements frame = new FrmSumOfElements();
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
	public FrmSumOfElements() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 419);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Sum of Integers");
		lblTitle.setForeground(Color.ORANGE);
		lblTitle.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 30));
		lblTitle.setBounds(48, 11, 212, 45);
		contentPane.add(lblTitle);

		JLabel lblInstruction = new JLabel("Please enter an Integer:");
		lblInstruction.setFont(new Font("Dubai", Font.ITALIC, 17));
		lblInstruction.setBounds(10, 67, 212, 20);
		contentPane.add(lblInstruction);

		txtUser = new JTextField();
		txtUser.setBounds(218, 68, 89, 22);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		JTextArea txtOutput = new JTextArea();
		txtOutput.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtOutput.setBounds(10, 98, 178, 271);
		contentPane.add(txtOutput);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This code gets the input from the textbox,
				// then adds the information to the ArrayList

				String num;
				num = txtUser.getText();
				ints.add(num);
			}
		});
		btnAdd.setBounds(218, 109, 89, 23);
		contentPane.add(btnAdd);

		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This code removes the input from the ArrayList

				String num;
				num = txtUser.getText();
				ints.remove(num);
			}
		});
		btnRemove.setBounds(218, 143, 89, 23);
		contentPane.add(btnRemove);

		JButton btnList = new JButton("List");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This creates a list of all the elements in the ArrayList and displays it
				// The (“\n”) puts each of the data on a new line.

				String a;
				String num = "";

				Iterator numIterator = ints.iterator();
				for (int i = 0; i < ints.size(); i++) {
					a = (String) numIterator.next();
					num = num + a + "\n";
				}
				txtOutput.setText(num);
			}
		});
		btnList.setBounds(218, 177, 89, 23);
		contentPane.add(btnList);

		JButton btnSumAll = new JButton("All");
		btnSumAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This button calculates the total sum
				// of all the inputs in the ArrayList

				String num = " ";
				int total = 0;

				for (String i : ints) {
					total += Integer.parseInt(i);
					num = Integer.toString(total);

				}
				txtOutput.setText(num);

			}
		});
		btnSumAll.setBounds(218, 313, 89, 23);
		contentPane.add(btnSumAll);

		JButton btnSumEven = new JButton("Even");
		btnSumEven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This button checks which numbers are even
				// and calculates the total sum of them.

				int result = 0;
				String num = " ";

				for (String i : ints) {
					if (Integer.parseInt(i) % 2 == 0) {
						result += Integer.parseInt(i);
						num = Integer.toString(result);
					}
				}
				txtOutput.setText(num);

			}
		});
		btnSumEven.setBounds(218, 245, 89, 23);
		contentPane.add(btnSumEven);

		JButton btnSumOdd = new JButton("Odd");
		btnSumOdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This button checks which numbers are odd
				// and calculates the total sum of them

				int result = 0;
				String num = " ";

				for (String i : ints) {
					if (Integer.parseInt(i) % 2 == 1) {
						result += Integer.parseInt(i);
						num = Integer.toString(result);
					}
				}
				txtOutput.setText(num);
			}
		});
		btnSumOdd.setBounds(218, 279, 89, 23);
		contentPane.add(btnSumOdd);

		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This code the sort method from the Collections class
				// to sort the inputs from lowest to highest

				Collections.sort(ints);

				String a;
				String num = "";

				Iterator numIterator = ints.iterator();
				for (int i = 0; i < ints.size(); i++) {
					a = (String) numIterator.next();
					num = num + a + "\n";
				}
				txtOutput.setText(num);
			}
		});
		btnSort.setBounds(218, 211, 89, 23);
		contentPane.add(btnSort);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// when button is clicked the program will close
				
				System.exit(0);
			}
		});
		btnExit.setBounds(218, 346, 89, 23);
		contentPane.add(btnExit);
	}
}

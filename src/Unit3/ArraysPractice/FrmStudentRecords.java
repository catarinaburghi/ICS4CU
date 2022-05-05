package Unit3.ArraysPractice;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*; //This needs to be added to the import statements to use the ArrayList class
//import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class FrmStudentRecords extends JFrame {
	
	ArrayList <String> names = new ArrayList(); 
	/*Define the ArrayList at the start of the main program. 
	 * This will allow it to be used throughout the program as a global variable.
	 */
	private JPanel contentPane;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStudentRecords frame = new FrmStudentRecords();
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
	public FrmStudentRecords() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 396);
		setTitle("Basic ArrayList Application");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Student Records");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(60, 24, 292, 36);
		contentPane.add(lblTitle);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(24, 71, 65, 26);
		contentPane.add(lblName);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textName.setBounds(99, 70, 312, 29);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JTextArea textOutput = new JTextArea();
		textOutput.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textOutput.setBounds(29, 124, 177, 179);
		contentPane.add(textOutput);
				
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This code retrieves the information from the textbox, then adds the information to the end of the ArrayList
				String temp;
				temp = textName.getText();
	            names.add(temp);
			}
		});
		btnAdd.setBounds(296, 124, 115, 23);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This code removes the data from the list and renumbers the remaining entries.
				String temp;
		        temp = textName.getText();
		        names.remove(temp);
			}
		});
		btnRemove.setBounds(296, 161, 115, 23);
		contentPane.add(btnRemove);
		
		JButton btnSort = new JButton("Sort");
		btnSort.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This code uses a simple sort routine to sort smallest to largest, or alphabetically.
				Collections.sort(names);
			}
		});
		btnSort.setBounds(296, 195, 115, 23);
		contentPane.add(btnSort);
		
		JButton btnList = new JButton("List");
		btnList.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This code creates the output string composed of each of the entries. 
				//The (“\n”) puts each of the entries on a new line.
				String a;
		        String temp="";
		        
		        Iterator stepper = names.iterator();
		        for (int i=0;i<names.size();i++){
		            a = (String) stepper.next();
		            temp = temp + a  + "\n";
		        }
		        textOutput.setText(temp);
			}
		});
		btnList.setBounds(296, 237, 115, 23);
		contentPane.add(btnList);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This code controls the Exit button and closes the program when pressed
				System.exit(0);
			}
		});
		btnExit.setBounds(296, 280, 115, 23);
		contentPane.add(btnExit);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(189, 124, 17, 179);
		contentPane.add(scrollBar);
		
		
		
	}
}
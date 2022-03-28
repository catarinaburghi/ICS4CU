package Unit2.Lesson8;
/*Catarina Fagundes Burghi
 * Date: March 28th 2022
 * This program is a step by step assignment that uses a class to deal with shuffling both 
 * decks and printing the numbers for the cards
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrmCardGame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCardGame frame = new FrmCardGame();
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
	//declaring and calling our class
	Deck cardDeck = new Deck();

	public FrmCardGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Action Button
		JButton btnDeal = new JButton("Deal Cards");
		btnDeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// calling upon the classe and funtions inside the class file
				cardDeck.deal();
				cardDeck.deal2();
				cardDeck.check(0,0);
			}
		});

		// Text boxes for the Rules
		JLabel btnRules = new JLabel("Rules:");
		
		JLabel lblTitle = new JLabel("War card game!");
		
		JLabel lblRules2 = new JLabel("- Click the Button to deal the cards");
		
		JLabel lblRules3 = new JLabel("- Check if your card is higher than the ");
		
		JLabel lblRules4 = new JLabel("one that was dealt for the computer.");
		
		JLabel lblRules5 = new JLabel("May the highest card win!");

		JLabel lblSuit = new JLabel("Suits: (s = spade, h = heart, c= club and d= diamond).");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(169)
							.addComponent(lblTitle))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(122)
							.addComponent(btnDeal, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(95)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnRules)
								.addComponent(lblRules5)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(lblRules4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblRules3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblRules2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(54)
							.addComponent(lblSuit, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitle)
					.addGap(7)
					.addComponent(btnRules)
					.addGap(18)
					.addComponent(lblRules2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRules3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRules4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRules5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSuit)
					.addGap(14)
					.addComponent(btnDeal)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

	}

}

package Unit3.Lesson15;
/*
 * Programmer: Catarina Fagundes Burghi
 * Date: May 17th 2022 
 * Program: TicTac.java
 * Program Description: This program uses a two dimensional array to simulate a Tic Tac Toe game.
 * A grid of cards will be displayed and the user is to select one card at a time 
 * against another user and try to get 4 matching cards in a row, column or diagonal. 
 * The goal of this game is to win against your opponent.
 */

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTac extends JFrame {

	// calling class TicTacEvent
    TicTacEvent tictac = new TicTacEvent(this);

	// Initialazing GUI and creating buttons, text fields and labels
    JPanel row1 = new JPanel();
    JButton[ ][ ] boxes = new JButton[4][4];
    JButton play = new JButton("Play");
	JButton reset = new JButton("Reset");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JLabel lblBlank1 = new JLabel();
    JTextArea text = new JTextArea();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson15\\img\\card.png");

	// main method
    public TicTac() {

		// starting the frame
        super("Tic Tac Toe");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(5, 4, 5, 10);
        row1.setBounds(10, 10, 500, 500);
        row1.setLayout(layout1);


        for (int x=0; x<=3; x++) {
			for (int y=0; y<=3; y++) {
				name += 1;
				newname = Integer.toString(name);
				boxes[x][y] = new JButton(newname);
				boxes[x][y].setIcon(back);
				row1.add(boxes[x][y]);
			}
		}
		// reset button
        reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictac.reset();
			}
		});
		
		// adding buttons and text fields onto row 1
		row1.add(play);
        row1.add(reset);
        row1.add(text);
        row1.add(blank2);
		getContentPane().add(row1);
		
		// starts the game
		play.addActionListener(tictac);
		for (int x=0; x<=3; x++) {
			for (int y=0; y<=3; y++) {
				boxes[x][y].addActionListener(tictac);
			}
		}
		
		setVisible(true);
	}
	// initializing frame
	public static void main(String[] args) {
		TicTac frame = new TicTac();
	}
}


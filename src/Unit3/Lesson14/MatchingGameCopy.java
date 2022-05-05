package Unit3.Lesson14;

/*
 * Programmer: Catarina Fagundes Burghi
 * Date: April 27th 2022
 * Program Name Matching Game
 * Program Description: This program uses array to simulate a matching game.
 * A grid of cards will be displayed and the user is to select two cards at a time 
 * looking for matching cards. The goal of this game is to see how quickly
 * the user can find all the matches.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MatchingGameCopy extends JFrame {


	// creating array lists
	ArrayList <String> cards = new ArrayList();
	ArrayList <String> set = new ArrayList();

	
    ImageIcon a = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\audi.png"); // audi
    ImageIcon b = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\ferrari.jpg"); // ferrari
    ImageIcon c = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\lamborghini.jpg"); // good size
    ImageIcon d = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\mazda.jpg"); // good size
    ImageIcon e = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\mclaren.png"); // mclaren
    ImageIcon f = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\porsche.jpg"); // porsche
    ImageIcon g = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\subaru.jpg"); // good size
    ImageIcon h = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\toyota.png"); // toyota
    ImageIcon back = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"); // good size
    ImageIcon done = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\finish.png"); // good size

	int count, c1, c2, card1, card2;
	int cardsleft = 16;
	int [] change = new int [16];

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchingGameCopy frame = new MatchingGameCopy();
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
	public MatchingGameCopy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Matching Card Game");
        lblTitle.setForeground(Color.ORANGE);
        lblTitle.setFont(new Font("Dubai", Font.BOLD | Font.ITALIC, 25));
        lblTitle.setBounds(113, 11, 243, 29);
        contentPane.add(lblTitle);;
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (int i=0; i<=15; i++) {
					change [i]=1;
				}
				
				String temp;
				for (int x=0; x<=7; x++) {
					for (int y=1; y<=2; y++) {
						temp = Integer.toString(x);
						set.add(temp);
					}
				}
				
				for (int x=0; x<=15; x++) {
					double index = Math.floor(Math.random()*(16-x));
					int index1 = (int) index;
					cards.add(set.get(index1));
					set.remove(index1);
				}
				
			}
		});
		btnPlay.setBounds(25, 499, 89, 23);
		contentPane.add(btnPlay);
		
		JButton btnCard1 = new JButton("");
		btnCard1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(0);
				
				if (temp.equals("0")) {
					btnCard1.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard1.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard1.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard1.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard1.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard1.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard1.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard1.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[0] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[0] = 0;
				}
				
				
			}
		});
		btnCard1.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard1.setBounds(24, 65, 75, 75);
		contentPane.add(btnCard1);
		
		JButton btnCard2 = new JButton("");
		btnCard2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(1);
				
				if (temp.equals("0")) {
					btnCard2.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard2.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard2.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard2.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard2.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard2.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard2.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard2.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[1] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[1] = 0;
				}
			}
		});
		btnCard2.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard2.setBounds(144, 65, 75, 75);
		contentPane.add(btnCard2);
		
		JButton btnCard3 = new JButton("");
		btnCard3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(2);
				
				if (temp.equals("0")) {
					btnCard3.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard3.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard3.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard3.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard3.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard3.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard3.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard3.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[2] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[2] = 0;
				}
			}
		});
		btnCard3.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard3.setBounds(267, 65, 75, 75);
		contentPane.add(btnCard3);
		
		JButton btnCard4 = new JButton("");
		btnCard4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(3);
				
				if (temp.equals("0")) {
					btnCard4.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard4.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard4.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard4.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard4.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard4.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard4.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard4.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[3] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[3] = 0;
				}
			}
		});
		btnCard4.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard4.setBounds(385, 65, 75, 75);
		contentPane.add(btnCard4);
		
		JButton btnCard5 = new JButton("");
		btnCard5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(4);
				
				if (temp.equals("0")) {
					btnCard5.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard5.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard5.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard5.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard5.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard5.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard5.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard5.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[4] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[4] = 0;
				}
			}
		});
		btnCard5.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard5.setBounds(24, 170, 75, 75);
		contentPane.add(btnCard5);
		
		JButton btnCard6 = new JButton("");
		btnCard6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(5);
				
				if (temp.equals("0")) {
					btnCard6.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard6.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard6.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard6.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard6.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard6.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard6.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard6.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[5] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[5] = 0;
				}
			}
		});
		btnCard6.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard6.setBounds(144, 170, 75, 75);
		contentPane.add(btnCard6);
		
		JButton btnCard7 = new JButton("");
		btnCard7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(6);
				
				if (temp.equals("0")) {
					btnCard7.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard7.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard7.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard7.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard7.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard7.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard7.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard7.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[6] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[6] = 0;
				}
			}
		});
		btnCard7.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard7.setBounds(267, 170, 75, 75);
		contentPane.add(btnCard7);
		
		JButton btnCard8 = new JButton("");
		btnCard8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(7);
				
				if (temp.equals("0")) {
					btnCard8.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard8.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard8.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard8.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard8.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard8.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard8.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard8.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[7] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[7] = 0;
				}
			}
		});
		btnCard8.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard8.setBounds(385, 170, 75, 75);
		contentPane.add(btnCard8);
		
		JButton btnCard9 = new JButton("");
		btnCard9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(8);
				
				if (temp.equals("0")) {
					btnCard9.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard9.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard9.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard9.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard9.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard9.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard9.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard9.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[8] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[8] = 0;
				}
			}
		});
		btnCard9.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard9.setBounds(24, 271, 75, 75);
		contentPane.add(btnCard9);
		
		JButton btnCard10 = new JButton("");
		btnCard10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(9);
				
				if (temp.equals("0")) {
					btnCard10.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard10.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard10.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard10.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard10.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard10.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard10.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard10.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[9] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[9] = 0;
				}
			}
		});
		btnCard10.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard10.setBounds(144, 271, 75, 75);
		contentPane.add(btnCard10);
		
		JButton btnCard11 = new JButton("");
		btnCard11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(10);
				
				if (temp.equals("0")) {
					btnCard11.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard11.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard11.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard11.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard11.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard11.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard11.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard11.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[10] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[10] = 0;
				}
			}
		});
		btnCard11.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard11.setBounds(267, 271, 75, 75);
		contentPane.add(btnCard11);
		
		JButton btnCard12 = new JButton("");
		btnCard12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(11);
				
				if (temp.equals("0")) {
					btnCard12.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard12.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard12.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard12.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard12.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard12.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard12.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard12.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[11] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[11] = 0;
				}
			}
		});
		btnCard12.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard12.setBounds(385, 271, 75, 75);
		contentPane.add(btnCard12);
		
		JButton btnCard13 = new JButton("");
		btnCard13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(12);
				
				if (temp.equals("0")) {
					btnCard13.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard13.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard13.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard13.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard13.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard13.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard13.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard13.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[12] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[12] = 0;
				}
			}
		});
		btnCard13.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard13.setBounds(24, 376, 75, 75);
		contentPane.add(btnCard13);
		
		JButton btnCard14 = new JButton("");
		btnCard14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(13);
				
				if (temp.equals("0")) {
					btnCard14.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard14.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard14.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard14.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard14.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard14.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard14.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard14.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[13] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[13] = 0;
				}
			}
		});
		btnCard14.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard14.setBounds(144, 376, 75, 75);
		contentPane.add(btnCard14);
		
		JButton btnCard15 = new JButton("");
		btnCard15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(14);
				
				if (temp.equals("0")) {
					btnCard15.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard15.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard15.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard15.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard15.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard15.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard15.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard15.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[14] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[14] = 0;
				}
			}
		});
		btnCard15.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard15.setBounds(267, 376, 75, 75);
		contentPane.add(btnCard15);
		
		JButton btnCard16 = new JButton("");
		btnCard16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String temp = cards.get(15);
				
				if (temp.equals("0")) {
					btnCard16.setIcon(a);
				}
				else if (temp.equals("1")) {
					btnCard16.setIcon(b);
				}
				else if (temp.equals("2")) {
					btnCard16.setIcon(c);
				}
				else if (temp.equals("3")) {
					btnCard16.setIcon(d);
				}
				else if (temp.equals("4")) {
					btnCard16.setIcon(e);
				}
				else if (temp.equals("5")) {
					btnCard16.setIcon(f);
				}
				else if (temp.equals("6")) {
					btnCard16.setIcon(g);
				}
				else if (temp.equals("7")) {
					btnCard16.setIcon(h);
				}
				
				count ++;
				if (count == 1) {
					c1 = Integer.parseInt(temp);
					change[15] = 0;
				}
				else if (count == 2) {
					c2 = Integer.parseInt(temp);
					change[15] = 0;
				}
			}
		});
		btnCard16.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson14\\img\\tire.jpg"));
		btnCard16.setBounds(385, 376, 75, 75);
		contentPane.add(btnCard16);

        JLabel lblInstruction = new JLabel("Click the Play button to start. Make sure to click Guess Again after each guess.");
        lblInstruction.setFont(new Font("Dubai", Font.PLAIN, 15));
        lblInstruction.setBounds(0, 462, 484, 26);
        contentPane.add(lblInstruction);
		
		JButton btnGuess = new JButton("Guess Again");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count = 0;
				if (c1 == c2) {
					for (int y=1; y<=2; y++) {
						if(change[0] == 0) {
							btnCard1.setIcon(done);
							change[0] = 2;
						}
						else if (change[1] == 0) {
							btnCard2.setIcon(done);
							change[1] = 2;
						}
						else if (change[2] == 0) {
							btnCard3.setIcon(done);
							change[2] = 2;
						}
						else if (change[3] == 0) {
							btnCard4.setIcon(done);
							change[3] = 2;
						}
						else if (change[4] == 0) {
							btnCard5.setIcon(done);
							change[4] = 2;
						}
						else if (change[5] == 0) {
							btnCard6.setIcon(done);
							change[5] = 2;
						}
						else if (change[6] == 0) {
							btnCard7.setIcon(done);
							change[6] = 2;
						}
						else if (change[7] == 0) {
							btnCard8.setIcon(done);
							change[7] = 2;
						}
						else if (change[8] == 0) {
							btnCard9.setIcon(done);
							change[8] = 2;
						}
						else if (change[9] == 0) {
							btnCard10.setIcon(done);
							change[9] = 2;
						}
						else if (change[10] == 0) {
							btnCard11.setIcon(done);
							change[10] = 2;
						}
						else if (change[11] == 0) {
							btnCard12.setIcon(done);
							change[11] = 2;
						}
						else if (change[12] == 0) {
							btnCard13.setIcon(done);
							change[12] = 2;
						}
						else if (change[13] == 0) {
							btnCard14.setIcon(done);
							change[13] = 2;
						}
						else if (change[14] == 0) {
							btnCard15.setIcon(done);
							change[14] = 2;
						}
						else if (change[15] == 0) {
							btnCard16.setIcon(done);
							change[15] = 2;
						}
						
						cardsleft--;
					}
				}
				
				else {
					for(int y=1; y<=2; y++) {
						if(change[0] == 0) {
							btnCard1.setIcon(back);
							change[0] = 1;
						}
						else if(change[1] == 0) {
							btnCard2.setIcon(back);
							change[1] = 1;
						}
						else if(change[2] == 0) {
							btnCard3.setIcon(back);
							change[2] = 1;
						}
						else if(change[3] == 0) {
							btnCard4.setIcon(back);
							change[3] = 1;
						}
						else if(change[4] == 0) {
							btnCard5.setIcon(back);
							change[4] = 1;
						}
						else if(change[5] == 0) {
							btnCard6.setIcon(back);
							change[5] = 1;
						}
						else if(change[6] == 0) {
							btnCard7.setIcon(back);
							change[6] = 1;
						}
						else if(change[7] == 0) {
							btnCard8.setIcon(back);
							change[7] = 1;
						}
						else if(change[8] == 0) {
							btnCard9.setIcon(back);
							change[8] = 1;
						}
						else if(change[9] == 0) {
							btnCard10.setIcon(back);
							change[9] = 1;
						}
						else if(change[10] == 0) {
							btnCard11.setIcon(back);
							change[10] = 1;
						}
						else if(change[11] == 0) {
							btnCard12.setIcon(back);
							change[11] = 1;
						}
						else if(change[12] == 0) {
							btnCard13.setIcon(back);
							change[12] = 1;
						}
						else if(change[13] == 0) {
							btnCard14.setIcon(back);
							change[13] = 1;
						}
						else if(change[14] == 0) {
							btnCard15.setIcon(back);
							change[14] = 1;
						}
						else if(change[15] == 0) {
							btnCard16.setIcon(back);
							change[15] = 1;
						}
						
					}
				}
				
                if(cardsleft == 0){
                    lblInstruction.setBounds(200, 462, 484, 26);
                    lblInstruction.setText("You have won!");
                }
			}
		});
		btnGuess.setBounds(184, 499, 111, 23);
		contentPane.add(btnGuess);
		
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // code to close the program

                System.exit(0);
            }
        });
        btnExit.setBounds(362, 499, 89, 23);
        contentPane.add(btnExit);
		
	}
}


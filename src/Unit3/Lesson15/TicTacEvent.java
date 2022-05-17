package Unit3.Lesson15;
/*Catarina Fagundes Burghi
 * Date: May 17th 2022
 * This program is the class file for TicTac.java
 * This program deals with initializing the images and starting the game, checking for wins or a tie
 * and it resets the board once the game is finished 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable {
    // initializing images, wins, ties, and size of two dimentional arrays
    TicTac gui;
    Thread playing;
    ImageIcon back = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson15\\img\\card.png");
    ImageIcon a = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson15\\img\\X.png");
    ImageIcon b = new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Documentos\\ICS4U\\src\\Unit3\\Lesson15\\img\\O.png");
    int clicks = 0;
    int win = 0;
    int xwins = 0;
    int owins = 0;
    int ties = 0;
    int[][] check = new int[4][4];

    // setting the size of the game
    public TicTacEvent(TicTac in) {
        gui = in;
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                check[row][col] = 0;
            }
        }
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        // Initializing buttons
        if (command.equals("Play")) {
            startPlaying();
        }
        if (command.equals("1")) {
            b1();
        }
        if (command.equals("2")) {
            b2();
        }
        if (command.equals("3")) {
            b3();
        }
        if (command.equals("4")) {
            b4();
        }
        if (command.equals("5")) {
            b5();
        }
        if (command.equals("6")) {
            b6();
        }
        if (command.equals("7")) {
            b7();
        }
        if (command.equals("8")) {
            b8();
        }
        if (command.equals("9")) {
            b9();
        }
        if (command.equals("10")) {
            b10();
        }
        if (command.equals("11")) {
            b11();
        }
        if (command.equals("12")) {
            b12();
        }
        if (command.equals("13")) {
            b13();
        }
        if (command.equals("14")) {
            b14();
        }
        if (command.equals("15")) {
            b15();
        }
        if (command.equals("16")) {
            b16();
        }

    }

    // choosing if X or O should be displayed depending on the number of clicks
    void b1() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][0].setIcon(a);
            check[0][0] = 1;
        } else {
            gui.boxes[0][0].setIcon(b);
            check[0][0] = 2;
        }
        winner();
    }

    void b2() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][1].setIcon(a);
            check[0][1] = 1;
        } else {
            gui.boxes[0][1].setIcon(b);
            check[0][1] = 2;
        }
        winner();
    }

    void b3() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][2].setIcon(a);
            check[0][2] = 1;
        } else {
            gui.boxes[0][2].setIcon(b);
            check[0][2] = 2;
        }
        winner();
    }

    void b4() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[0][03].setIcon(a);
            check[0][3] = 1;
        } else {
            gui.boxes[0][3].setIcon(b);
            check[0][3] = 2;
        }
        winner();
    }

    void b5() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][0].setIcon(a);
            check[1][0] = 1;
        } else {
            gui.boxes[1][0].setIcon(b);
            check[1][0] = 2;
        }
        winner();
    }

    void b6() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][1].setIcon(a);
            check[1][1] = 1;
        } else {
            gui.boxes[1][1].setIcon(b);
            check[1][1] = 2;
        }
        winner();
    }

    void b7() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][2].setIcon(a);
            check[1][2] = 1;
        } else {
            gui.boxes[1][2].setIcon(b);
            check[1][2] = 2;
        }
        winner();
    }

    void b8() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[1][3].setIcon(a);
            check[1][3] = 1;
        } else {
            gui.boxes[1][3].setIcon(b);
            check[1][3] = 2;
        }
        winner();
    }

    void b9() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][0].setIcon(a);
            check[2][0] = 1;
        } else {
            gui.boxes[2][0].setIcon(b);
            check[2][0] = 2;
        }
        winner();
    }

    void b10() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][1].setIcon(a);
            check[2][1] = 1;
        } else {
            gui.boxes[2][1].setIcon(b);
            check[2][1] = 2;
        }
        winner();
    }

    void b11() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][2].setIcon(a);
            check[2][2] = 1;
        } else {
            gui.boxes[2][2].setIcon(b);
            check[2][2] = 2;
        }
        winner();
    }

    void b12() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[2][3].setIcon(a);
            check[2][3] = 1;
        } else {
            gui.boxes[2][3].setIcon(b);
            check[2][3] = 2;
        }
        winner();
    }

    void b13() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][0].setIcon(a);
            check[3][0] = 1;
        } else {
            gui.boxes[3][0].setIcon(b);
            check[3][0] = 2;
        }
        winner();
    }

    void b14() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][1].setIcon(a);
            check[3][1] = 1;
        } else {
            gui.boxes[3][1].setIcon(b);
            check[3][1] = 2;
        }
        winner();
    }

    void b15() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][2].setIcon(a);
            check[3][2] = 1;
        } else {
            gui.boxes[3][2].setIcon(b);
            check[3][2] = 2;
        }
        winner();
    }

    void b16() {
        clicks += 1;
        if ((clicks % 2) == 1) {
            gui.boxes[3][3].setIcon(a);
            check[3][3] = 1;
        } else {
            gui.boxes[3][3].setIcon(b);
            check[3][3] = 2;
        }
        winner();
    }
    // initializing the game
    void startPlaying() {
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
    }

    
     
     //This method checks all possible combinations of x's and o's to see if
     // somebody has won. if neither win once the board is filled, it ties
    void winner() {
        for (int x = 0; x <= 3; x++) {
            // checks for a row and determines the winner
            if ((check[x][0] == check[x][1]) && (check[x][0] == check[x][2]) && (check[x][0] == check[x][3])) {
                if (check[x][0] == 1) {
                    JOptionPane.showMessageDialog(null, "X wins!");
                    // adding to the counter for X wins
                    xwins++;
                    win++;
                    // reset
                    reset();
                } else if (check[x][0] == 2) {
                    JOptionPane.showMessageDialog(null, "O wins!");
                    // adding to the counter for O wins
                    owins++;
                    win++;
                    // reset
                    reset();
                }
            }
            // checks for a column and determines the winner
            if ((check[0][x] == check[1][x]) && (check[0][x] == check[2][x]) && (check[0][x] == check[3][x])) {
                if (check[0][x] == 1) {
                    JOptionPane.showMessageDialog(null, "X wins!");
                    // adding to the counter for X wins
                    xwins++;
                    win++;
                    // reset
                    reset();
                } else if (check[0][x] == 2) {
                    JOptionPane.showMessageDialog(null, "O wins!");
                    // adding to the counter for O wins
                    owins++;
                    win++;
                    // reset
                    reset();
                }
            }
        }
        // checks for diagonal situation #1 and determines the winner
        if ((check[3][0] == check[2][1]) && (check[3][0] == check[1][2]) && (check[3][0] == check[0][3])) {

            if (check[2][1] == 1) {
                JOptionPane.showMessageDialog(null, "X wins!");
                // adding to the counter for X wins
                xwins++;
                win++;
                // reset
                reset();
            } else if (check[2][1] == 2) {
                JOptionPane.showMessageDialog(null, "O wins!");
                // adding to the counter for O wins
                owins++;
                win++;
                // reset
                reset();
            }
        }
        // checks for diagonal situation #2 and determines the winner
        if ((check[0][0] == check[1][1]) && (check[0][0] == check[2][2]) && (check[0][0] == check[3][3])) {

            if (check[1][1] == 1) {
                JOptionPane.showMessageDialog(null, "X wins!");
                // adding to the counter for X wins
                xwins++;
                win++;
                // reset
                reset();
            } else if (check[1][1] == 2) {
                JOptionPane.showMessageDialog(null, "O wins!");
                // adding to the counter for O wins
                owins++;
                win++;
                // reset
                reset();
            }
        }
        // checks how many times the board has been clicked to determine a tie
        if (clicks == 16 && win == 0) {
            JOptionPane.showMessageDialog(null, "The game is a tie!");
            // adding to the counter for ties
            ties++;
            // reset
            reset();

        }
        // setting the score
        gui.text.setText("X wins: " + xwins + "\nO wins: " + owins + "\nTies: " + ties);

    }

    // reset method, resets all the cards back as soon as the game is done
    void reset() {
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                clicks = 0;
                check[x][y] = 0;
                gui.boxes[x][y].setIcon(back);
            }
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub

    }

}
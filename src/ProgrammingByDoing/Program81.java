package ProgrammingByDoing;

import java.awt.*;
import javax.swing.JFrame;

public class Program81 extends Canvas {

    public void paint(Graphics g) {
        // labels
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for (int X = 0; X < 800; X += 50)
            g.drawString(String.valueOf(X), X, 50);
        for (int Y = 100; Y < 600; Y += 50)
            g.drawString(String.valueOf(Y), 28, Y);
        // lines
        g.setColor(Color.lightGray);
        for (int X = 0; X < 800; X += 50)
            g.drawLine(X, 0, X, 599); // horizontal
        for (int Y = 0; Y < 600; Y += 50)
            g.drawLine(0, Y, 799, Y); // vertical

        g.setColor(Color.yellow);
        g.fillArc(100, 300, 200, 200, 0, 360);

        g.setColor(Color.blue);
        g.fillArc(150, 350, 25, 25, 0, 360);
        g.fillArc(250, 350, 25, 25, 0, 360);
        g.setColor(Color.red);
        g.drawArc(125, 450, 150, 15, 0, -180);
    }

    public static void main(String[] args) {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Program77");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Program81 canvas = new Program81();
        win.add(canvas);
        win.setVisible(true);
    }
}

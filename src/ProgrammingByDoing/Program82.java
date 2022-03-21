package ProgrammingByDoing;

import java.awt.*;
import javax.swing.JFrame;

public class Program82 extends Canvas{
    
    public void paint(Graphics g) {
        
        g.setColor(Color.black);
        g.drawArc(250, 250, 200, 200, 0, 360);
        g.drawLine(425, 350, 350, 350);
        g.drawLine(350, 425, 350, 350);
        g.drawString("12", 350, 275);
        g.drawString("3", 435,350);
        g.drawString("6", 350, 440);
        g.drawString("9", 270, 350);
    }

    public static void main(String[] args) {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Program77");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Program82 canvas = new Program82();
        win.add(canvas);
        win.setVisible(true);
    }
}

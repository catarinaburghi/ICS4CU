package Lesson6;

import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class Program89 extends Canvas {
    public static void main(String[] args) {
        JFrame win = new JFrame("Program77");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Program89 canvas = new Program89();
        win.add(canvas);
        win.setVisible(true);
    }

    public void paint(Graphics g) {
        int x1 = 512;
        int y1 = 109;
        int x2 = 146;
        int y2 = 654;
        int x3 = 876;
        int y3 = 654;
        int x = 512;
        int y = 382;
        int dx;
        int dy;

        for (int Line = 1; Line <= 500000; Line++) {
            g.drawLine(x, y, x, y);
            int[] intArray = { 1, 2, 3 };
            int n = new Random().nextInt(intArray.length);
            if (n == 1) {
                dx = x - x1;
                dy = y - y1;
            } else if (n == 2) {
                dx = x - x2;
                dy = y - y2;
            } else {
                dx = x - x3;
                dy = y - y3;
            }
            x = x - dx / 2;
            y = y - dy / 2;

        }
    }

}
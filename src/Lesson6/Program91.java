package Lesson6;

import java.awt.*;
import javax.swing.JFrame;

class Program91 extends Canvas {
	public void paint(Graphics window) {
		// color x y
		drawBox(window, Color.RED, 200, 200);
		drawBox(window, Color.BLACK, 300, 200);
		drawBox(window, Color.BLUE, 400, 200);
		drawBox(window, Color.CYAN, 500, 200);
		drawBox(window, Color.DARK_GRAY, 600, 200);
		drawBox(window, Color.GRAY, 200, 300);
		drawBox(window, Color.GREEN, 300, 300);
		drawBox(window, Color.LIGHT_GRAY, 400, 300);
		drawBox(window, Color.MAGENTA, 500, 300);
		drawBox(window, Color.ORANGE, 600, 300);
	}

	public void drawBox(Graphics window, Color c, int x, int y) {
		// already finished; do not modify

		// this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x, y, 100, 100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x + 10, y + 10, 80, 80);
	}

	public static void main(String[] args) {
		Canvas canvas = new Program91();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add(canvas);
		win.setVisible(true);
	}
}

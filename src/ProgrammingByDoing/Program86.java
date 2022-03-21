package ProgrammingByDoing;

import java.awt.*;
import javax.swing.JFrame;

public class Program86 extends Canvas {

	public void paint(Graphics g) {
		Polygon tri = new Polygon();
		tri.addPoint(100, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);

		Color myPurple = new Color(134, 52, 235);
		g.setColor(myPurple);
		g.fillPolygon(tri);
	}

	public static void main(String[] args) {
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Program77");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Program86 canvas = new Program86();
		win.add(canvas);
		win.setVisible(true);
	}
}

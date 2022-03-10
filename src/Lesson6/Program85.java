package Lesson6;

import java.awt.*;
import javax.swing.JFrame;

public class Program85 extends Canvas {
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString("Hey, a triangle!", 50, 50);

		Polygon tri = new Polygon();
		tri.addPoint(100, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);

		g.setColor(Color.blue);
		g.fillPolygon(tri);

		Polygon trapePolygon = new Polygon();
		trapePolygon.addPoint(50, 100);
		trapePolygon.addPoint(80, 100);
		trapePolygon.addPoint(60, 50);
		trapePolygon.addPoint(50, 50);

		g.setColor(Color.MAGENTA);
		g.fillPolygon(trapePolygon);

		Polygon pent = new Polygon();
		pent.addPoint(450, 200);
		pent.addPoint(500, 250);
		pent.addPoint(475, 350);
		pent.addPoint(425, 350);
		pent.addPoint(400, 250);

		g.setColor(Color.green);
		g.fillPolygon(pent);

		Polygon hex = new Polygon();

		// use trig to make a regular hexagon
		int radius = 100; // pixels
		int xCenter = 200;
		int yCenter = 500;
		for (double ang = 0; ang < 2 * Math.PI; ang = ang + (2 * Math.PI) / 6.0) {
			double xDelta = radius * Math.cos(ang);
			double yDelta = -radius * Math.sin(ang);
			hex.addPoint(xCenter + (int) xDelta, yCenter + (int) yDelta);
		}

		g.setColor(Color.black);
		g.fillPolygon(hex);
	}

	public static void main(String[] args) {
		JFrame win = new JFrame("Polygon Demo");
		win.setSize(1024, 768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new Program85());
		win.setVisible(true);
	}

}

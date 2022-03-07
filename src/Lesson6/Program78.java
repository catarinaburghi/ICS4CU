package Lesson6;

import java.awt.*;
import javax.swing.JFrame;

public class Program78 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.black);

		g.drawRect(50,20,100,200);  // draw a rectangle
		g.drawOval(160,20,100,200); // draw a filled-in oval

		//arcs
		g.drawArc(270,20,100,200,0,270); // draw an arc that starts at 0 degrees
										 //   and has an arclength of 270 degrees

		g.drawArc(50,250,150,150,90,180); // from 90 degrees to 270 (90+180)
		g.drawArc(210,250,150,150,45,90); // from 45 degrees to 135 (45+90)
		g.fillArc(210,280,150,150,45,90); // ditto, but filled in

		g.setColor(Color.yellow);
		g.fillArc(150,400,150,150,45,270); // chomp

        g.setColor(Color.pink);
        g.fillArc(300,400,150,150,225,270);
		
		// custom colors
		Color myOrange = new Color(230,92,0); // the amount of red, green, blue in the color
											  // Each component has a value from 0-255.
		g.setColor(myOrange);
		g.fillOval(500,50,150,150);

		Color myGrey = new Color(238,238,238);
		g.setColor(myGrey);
		g.fillOval(550,100,50,50);

        Color myBlue = new Color(31,133,222);
		g.setColor(myBlue);
		g.fillOval(500,210,150,150);

		g.setColor(Color.green);
		g.fillOval(500,370,150,150);
	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("Program78: Arcs and Colors");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Program78 canvas = new Program78();
		win.add( canvas );
		win.setVisible(true);
	}
}


package Lesson6;
 
import java.awt.*;
import javax.swing.JFrame;

public class Program93 extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		// Draws a smiling face on the screen, where the point (x,y) is
		//  the upper-left corner of a box containing the face.

		// draw circle for the head
        g.setColor(Color.yellow);
        g.fillArc(x, y, 200, 200, 0, 360);

		// draw eyes
        g.setColor(Color.blue);
        g.fillArc(x + 50, y + 50, 25, 25, 0, 360);
        g.fillArc(x + 150, y + 50, 25, 25, 0, 360);

		// draw mouth
        g.setColor(Color.red);
        g.drawArc(x + 25, y + 150, 150, 15, 0, -180);
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new Program93() );
		win.setVisible(true);
	}


}

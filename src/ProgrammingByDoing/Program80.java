package ProgrammingByDoing;

import java.awt.*;
import javax.swing.JFrame;

public class Program80 extends Canvas{

    public void paint( Graphics g )
    {
    g.setColor(Color.green);
    g.fillArc(50, 50, 50, 50, 0, 360);
    }
    public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Program77");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Program80 canvas = new Program80();
		win.add( canvas );
		win.setVisible(true);
	}
}

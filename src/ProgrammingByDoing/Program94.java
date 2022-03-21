package ProgrammingByDoing;

import java.awt.*;
import javax.swing.JFrame;

public class Program94 extends Canvas
{
	public void paint( Graphics g )
	{
        g.fillPolygon(drawTree(g, 0, 0));
        g.fillPolygon(drawtrunk(g, 0, 0));
        
	}

    public static Polygon drawtrunk(Graphics g, int x, int y){
        Color myColor = new Color(82, 64, 17);
        g.setColor(myColor);
        g.fillRect(42, 175, 16, 25);
        return null;  
    }
	public static Polygon drawTree(Graphics g, int x, int y )
	{
		Polygon tri = new Polygon();
        g.setColor(Color.GREEN);
        tri.addPoint(50, 100);
        x = (50-25);
        y = (100+75);
        tri.addPoint(x, y);
        x = (x + 50);
        y = (100+75);
        tri.addPoint(x, y);

        return tri;
	}


	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new Program94() );
		win.setVisible(true);
	}


}
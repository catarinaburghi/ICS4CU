package Lesson6;

import java.awt.*;
import javax.swing.JFrame;

public class Program88 extends Canvas{
    public void paint( Graphics g)
    {
        for(int Polygon=1; Polygon <= 500; Polygon++){
        triangle(0, 0);
        myColor(0, 0, 0);
        
        g.setColor(myColor(0, 0, 0));
        g.fillPolygon(triangle(0, 0));
    }
    }
    public static void main(String[] args) {
    
        JFrame win = new JFrame("Program87");
		win.setSize(700,700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Program88 canvas = new Program88();
		win.add( canvas );
		win.setVisible(true);
    }
    private static Polygon triangle(int x, int y) {
        Polygon tri = new Polygon();
		tri.addPoint(50, 50);
        x = (int) (Math.random()*200);
        y = (int) (Math.random()*200+50);
		tri.addPoint(x, y);
        x = (int) (Math.random()*200+50);
        y = (int) (Math.random()*200+50);
		tri.addPoint(x,y);
        return tri;
    }
    private static Color myColor(int r, int v, int b){
        r = (int) (Math.random()*200);
        v = (int) (Math.random()*200);
        b = (int) (Math.random()*200);
        Color myColor = new Color(r, v, b);
        return myColor;
    }
}

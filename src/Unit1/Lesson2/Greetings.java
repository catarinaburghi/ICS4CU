package Unit1.Lesson2;
import javax.swing.*;
import java.awt.*;

/*
 File name: Greetings.java
 Programmer: Catarina Fagundes Burghi
 Date: 10/02/2022
 Description: This program demonstrates the use of graphics to introduce myself
*/

public class Greetings extends JFrame{
    
    public  Greetings () {
        super ("About Me"); //  Creates the frame and puts the title at the top
        setSize(500,200); // Sets the width and the height of the box created
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); // Opens the frame at the defined width and height
        FlowLayout flo = new FlowLayout(); 
        setLayout(flo);

        JLabel pageLabelFirstNameJLabel = new JLabel("<html>First Name: Catarina<p>"
                +"Last Name: Burghi <p> "
                +"Nationality: Brazilian <p>"
                +"Favorite Subjects: Auto Repair and Computer Science <p> "
                +"School: H.B.Beal Secondary School <p>"
                +"School Club/Team: 5024 Raider Robotics <html>");
        add(pageLabelFirstNameJLabel); // Adds text to the box
        setVisible(true); 
    }
    public static void main(String[] args){
        Greetings hw = new Greetings();
    }
}

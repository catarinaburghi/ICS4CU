package Lesson2;
import javax.swing.*;
import java.awt.*; // This allows us to use JFrame to create graphics

/*
 File name: HelloWorldGUI
 Programmer: Catarina Fagundes Burghi
 Date: 10/02/2022
 Description: This program demonstrates the use of graphics
*/

public class HelloWorldGUI extends JFrame{
    public  HelloWorldGUI () {
        super ("Hello World!"); //  Creates the frame and puts the title at the top
        setSize(500,200); // Sets the width and the height of the box created
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); // Opens the frame at the defined width and height
        JLabel pageLabel = new JLabel("HELLO WORLD"); // Creates new text to go into the box
        FlowLayout flo = new FlowLayout(); 
        setLayout(flo);
        add(pageLabel); // Adds text to the box
        setVisible(true); 
    }
    public static void main(String[] args){
        HelloWorldGUI hw = new HelloWorldGUI();
    }
}
package ProgrammingByDoing;

import java.util.Scanner;

public class Program104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose which shape you want to calculate the area:");
        System.out.println("1- Circle");
        System.out.println("2- Rectangle");
        System.out.println("3- Square");
        System.out.println("4- Triangle");

        System.out.println("Your choice: ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Please enter the radius: ");
            int radius = sc.nextInt();
            circle(radius);
        }
        else if(choice == 2){
            System.out.print("Please enter the length: ");
            int length = sc.nextInt();
            System.out.print("Please enter the width: ");
            int width = sc.nextInt();
            rectangle(length, width);
        }
        else if(choice == 3){
            System.out.print("Please enter the side: ");
            int side = sc.nextInt();
            square(side);
        }
        else if(choice ==4){
            System.out.print("Please enter the base: ");
            int base = sc.nextInt();
            System.out.print("Please enter the height: ");
            int height = sc.nextInt();
            triangle(base, height);
        } 
        else{
            System.out.println("Sorry there is no calculation for that");
        }

    }
    
    /*  circle
        This method calculates and returns the area of a circle
        Parameters: radius
        Returns: area
    */ 

    private static double circle(int radius) {
        double area = 3.14 * (radius * radius);
        System.out.println(area);
        return area;
    }

    /*  rectangle
        This method calculates and returns the area of a rectangle
        Parameters: length, width
        Returns: area
    */

    private static double rectangle(int length, int width) {
        double area = length * width;
        System.out.println(area);
        return area;
    }

    /*  square
        This method calculates and returns the area of a square
        Parameters: side
        Returns: area
    */

    private static double square(int side) {
        double area = side * side;  
        System.out.println(area);
        return area;
    }

    /*  triangle
        This method calculates and returns the area of a triangle
        Parameters: base, height
        Returns: area
    */
    
    private static double triangle(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println(area);
        return area;
    }

}

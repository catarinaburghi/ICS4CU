package Lesson3;
import java.util.Scanner;

/*
 File name: RestaurantBill.java
 Programmer: Catarina Fagundes Burghi
 Date: 11/02/2022
 Description: This program demonstrates the use of 
 math calculations and variables and the use of the scanner
 to ask a client to imput their order price and give them a total with tax.
*/

public class RestaurantBill {
    public static void main(String[] args) {

        final double TAX = (float) 0.13;
        Scanner sc = new Scanner(System.in);

        System.out.println("Prices:");
        System.out.println("Meal = $9.99");
        System.out.println("Drink = $1.50");

        System.out.println("Please enter the cost for your order:");
        double meal = sc.nextDouble();

        System.out.println("Please enter the cost for your drink:");
        double drink = sc.nextDouble();

        double total = meal + drink;
        System.out.println("Total without taxes: " +total);
        
        double totaltaxes = total*TAX;
        double completetotal = total + totaltaxes;
        System.out.println("+");
        System.out.println("Total taxes: "+String.format("%.2f", totaltaxes));
        System.out.println("Total with taxes: "+ String.format("%.2f", completetotal));

    }
}


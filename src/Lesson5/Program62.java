package Lesson5;

import java.util.Scanner;

public class Program62 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        do {
           if (n % 2 == 0) {
               n = n / 2;
           } else {
               n = (n * 3) + 1;
           } 
           
        } while (n != 1);{
            System.out.print(" " + n);
        }
    }   
}

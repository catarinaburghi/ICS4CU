package Lesson5;

import java.util.Scanner;

public class Program61 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int k = 0;

        do{
            System.out.println("Please enter 3 numbers:");
            System.out.println("Side 1: ");
            i = sc.nextInt();
            System.out.println("Side 2: ");
            j = sc.nextInt();
            
        } while(j < i);{
            System.out.println("Side 3: ");
            k = sc.nextInt();
        } while(k > j){
            System.out.println("This is a right triangle!"); 
        } 
    }
}
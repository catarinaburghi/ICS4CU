package Unit1.Lesson5;

import java.util.Scanner;

public class Program55 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int i = 1;

        while (i != 0) {
            System.out.println("Please enter a number to be added:");
            i = sc.nextInt();
            total = total + i;
            System.out.println("The total so far is: " + total);
        }
        
    }
}

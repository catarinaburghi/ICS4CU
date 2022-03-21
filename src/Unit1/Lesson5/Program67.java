package Unit1.Lesson5;

import java.util.Scanner;

public class Program67 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int i = sc.nextInt(); 

        System.out.println("Enter the next number:");
        int j = sc.nextInt();

        System.out.println("Enter the number you want to count up by:");
        int k = sc.nextInt();

        for(int t = i; t <= j; t += k){
            System.out.println(t);
        }
    }
}

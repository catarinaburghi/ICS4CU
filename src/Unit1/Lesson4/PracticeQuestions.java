package Unit1.Lesson4;

import java.util.Scanner;

public class PracticeQuestions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = sc.nextInt();

        System.out.println("The last digit is: " + num1 % 10);

        System.out.println("Enter a number (3+ digits):");
        int num2 = sc.nextInt();

        System.out.println("The number of hundreds is: " + (num2 / 100) % 10);

        System.out.println("Enter a number (5 digits):");
        int num3 = sc.nextInt();
        
        System.out.println("The sum is " + sumDigits(num3));

        System.out.println("Enter the amount of minutes you want to convert:");
        int num4 = sc.nextInt();

        double minutesInYear = 60 * 24 * 365;

        long years = (long) (num4 / minutesInYear);
        int days = (int) (num4 / 60 / 24) % 365;

        System.out.println((int) num4 + " minutes is " + years + " years and " + days + " days");
        }

    public static int sumDigits(long n) {
     int result = 0;

     while(n > 0) {
     result += n % 10;
     n /= 10;
     }

     return result;
}
    
        
}
        
        




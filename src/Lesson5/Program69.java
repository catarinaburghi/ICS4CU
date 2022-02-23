package Lesson5;

public class Program69 {
    
    public static void main(String[] args) {

        double x, y;
        System.out.println(" x  |  y ");
        System.out.println("---------");
        
        for(x = -10, y = 0; x <= 10; x += 0.5, y =  x * x){

            System.out.println("x= " + x + " " + "y= " + y);

        }
    }
}

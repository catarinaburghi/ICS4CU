package Unit3.ArraysPractice;

public class Array {
    public static void main(String[] args) {
        
        String[] fruit = new String[5];

        fruit[0] = "grape";
        fruit[1] = "strawberry";
        fruit[2] = "blueberry";
        fruit[3] = "apple";
        fruit[4] = "dragon fruit";


        for(int i = 4; i<fruit.length; i--)
        System.out.println(i+ ": " +fruit[i]);
    }
    
    
}

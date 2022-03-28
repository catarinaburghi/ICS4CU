package Unit2.Lesson6;

public class FractionsOOP {
    public static void main(String[] args) {
        
        Fractions f1 = new Fractions(); // declare and instantiate a fraction variable

        f1.num = 2;
        f1.den = 3;

        System.out.println("Fraction 1 is: "+ f1.num + "/ " + f1.den);
        System.out.println(f1);

        Fractions f2 = new Fractions(); // declare and instantiate a fraction varriable

        f2.num = 5;
        f2.den = 6;

        System.out.println("Fraction 2 is: "+ f2.num + "/ " + f2.den);
        System.out.println(f2);

        f1.num --;
        f1.den = f2.den + 3;

        System.out.println("Fraction 1 modified is: "+ f1.num + "/ " + f1.den);

        Fractions g =f2;

        g.num = 2;
        f2.den = 3;

        System.out.println("Fraction g modified is: "+ g.num + "/ " + g.den);
        System.out.println("Fraction 2 modified is: "+ f2.num + "/ " + f2.den);

        Fractions f3 = new Fractions();

        f3.num = 2;
        f3.den = 7;

        System.out.println("Fraction 3 is: "+ f3.num + "/ " + f3.den);
    }
}

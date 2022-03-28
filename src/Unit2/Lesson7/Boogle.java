package Unit2.Lesson7;

public class Boogle {
    
    String name;
    int happiness = 50;

    public Boogle(){

        name ="Bruce";
        System.out.println("Hello, I'm a Boogle and my name is " + name);
        
    }

    public void feed(String FoodType, int energy){

        System.out.println("Yum! That was a delicious " + FoodType + "!");
        happiness = happiness + energy;
        System.out.println("Happiness Level " + happiness);
    }

    public void Groom(int energy){

        System.out.println("My fur is nice and soft now!");
        happiness = happiness + energy;
        System.out.println("Happiness Level " + happiness);
    }

    public void Play(int energy){

        System.out.println("Look I caught the ball!");
        happiness = happiness + energy;
        System.out.println("Happiness Level " + happiness);
    }
}

package Unit2.Lesson8;
/*Catarina Fagundes Burghi
 * Date: March 28th 2022
 * This program is the class file for FrmCardGame.java
 * This program deals with shuffling the cards using an ArrayList and
 * also checks to see which card is higher to determine the winner
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    //Determening all the possible outcomes
    String [ ] cards = {"2s","3s","4s","5s","6s","7s","8s","9s","Ts","Js","Qs","Ks","As",
                        "2h","3h","4h","5h","6h","7h","8h","9h","Th","Jh","Qh","Kh","Ah",
                        "2c","3c","4c","5c","6c","7c","8c","9c","Tc","Jc","Qc","Kc","Ac",
                        "2d","3d","4d","5d","6d","7d","8d","9d","Td","Jd","Qd","Kd","Ad"};

    ArrayList<String>deck = new ArrayList(Arrays.asList(cards));

    //deals the cards for the computer
    public void deal(){

        //declaring our variables
        int cardsLeft = deck.size();
        int newCard = (int)(cardsLeft*Math.random()+0);
        
        //printing the outcome of the list of cards
        System.out.println("Computer's card: ");
        System.out.println(deck.get(newCard));

        //removes that card from the possible outcomes so it doesn't repeat itself
        deck.remove(newCard);

    }

    //deals the cards for the user
    public void deal2(){

        //declaring our variables
        int cardsLeft = deck.size();
        int newCard2 = (int)(cardsLeft*Math.random()+0);

        //printing the outcome of the list of cards
        System.out.println("Your card: ");
        System.out.println(deck.get(newCard2));

        //removes that card from the possible outcomes so it doesn't repeat itself
        deck.remove(newCard2);
    }

    
    public void check(int newCard, int newCard2) {
        //checks which card is higher to determine the winner
        if(newCard <= newCard2){
            System.out.println("You won!");
        }else if(newCard >= newCard2){
            System.out.println("You lost!");
        }else {
            System.out.println("It's a tie!");
        }
    }
}

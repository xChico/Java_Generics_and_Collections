import java.util.ArrayList;
import java.util.LinkedList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));



          for(Card hands: hand){
                   System.out.print(hands);
              }
//Compete a for loop that prints every card
//in the deck d

    }



    public static int addCards(ArrayList<Card> hand) {
        int sum = 0;
        int cardValue = 0;
        for (Card card : hand) {

            if (card.getValue().equals("Ace")) {
                cardValue = 1;
            } else if (card.getValue().equals("Jack"))
                cardValue = 11;
            else if (card.getValue().equals("Queen"))
                cardValue = 12;
            else if (card.getValue().equals("King"))
                cardValue = 13;
            else {

                cardValue = Integer.parseInt(card.getValue().toString());

            }
            sum += cardValue;
        }

        return sum;

    }


    /*
This should compute the sum of values of the cards in an ArrayList of cards.*/
    }
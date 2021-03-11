
import java.util.*;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};



    public Deck() {
        this.deck=new LinkedList<Card>();
        for (String suit : suits) {
            for (int i = 2; i <= 10; i++)
                deck.add(new Card<Integer, String>(i, suit));
            deck.add(new Card<String, String>("Ace", suit));
            deck.add(new Card<String, String>("Jack", suit));
            deck.add(new Card<String, String>("Queen", suit));
            deck.add(new Card<String, String>("King", suit));
        }


/* TODO 
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may he        lp you.*/
    }

    public Card dealCard(){
        int min =0;
        Random rand = new Random();
        int randomInd = rand.nextInt((deck.size()-min));
        return  deck.remove(randomInd);

/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
    }

    public int size(){/* TODO: Return the size of the deck (number of cards left in it)*/
        return deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
        Iterator<Card> temp = new DeckIterator<>(this);
        return temp;

        //return an iterator object
        //iterator.java
       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/
    }
}

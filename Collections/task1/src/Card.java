public class Card <V,S>{
    private V value;
    private S suit;

    public Card(V value, S suit){
        this.value = value;
        this.suit = suit;
    }

    public void setValue(V value){
        this.value = value;
    }
    public void setSuit(S suit){
        this.suit = suit;
    }

    public V getValue(){
        return value;
    }
    public S getSuit(){
        return suit;
    }

    @Override
    public String toString(){
        return this.value + " of " + this.suit;
    }







/* TODO
Implement the constructor, getters and setters and toString */
}

import java.util.ArrayList;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    ArrayList<Card> deck;
    public Deck()
    {
        for(int rank = 2; rank < 15; rank = rank + 1) {
            deck.add(new Card(rank, "Spades"));
            deck.add(new Card(rank, "Hearts"));
            deck.add(new Card(rank, "Clubs"));
            deck.add(new Card(rank, "Diamonds"));
        }
    }
    
    public Card getCard() {
        int x = (int)(Math.random() * 52);
        Card y = deck.get(x);
        return y;
    }
    
    
}

import java.util.ArrayList;
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hand
{
    ArrayList<Card> hand;
    public Hand(Deck deck)
    {
        hand = new ArrayList<Card>();
        for (int i = 0; i < 5; i = i + 1) {
            hand.add(deck.getCard());
        }
    }
    
    public boolean sameSuit() {
        boolean x = true;
        for(int i = 0; i < 5; i = i + 1) {
            for(int j = 0; j < 4; j = j + 1) {
                if((hand.get(i)).getCardRank() != (hand.get(j)).getCardRank()) {
                    x = false;
                }
            }
        }
        return x;
    }
    
    public int onePair() {
        boolean x = true;
        for(int i = 0; i < 5; i = i + 1) {
            for(int j = 0; j < 4; j = j + 1) {
                if((hand.get(i)).getCardSuit() == (hand.get(j)).getCardSuit()) {
                    x = false;
                }
            }
        }
        if (x = true) {
            return -1;
        } else {
            return x; //FINISH
        }
    }
}

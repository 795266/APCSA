
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    int rank;
    String suit;
    
    public Card(int r, String s)
    {
        rank = r;
        suit = s;
    }
    
    public int getCardRank() {
        return rank;
    }
    
    public String getCardSuit() {
        return suit;
    }
}

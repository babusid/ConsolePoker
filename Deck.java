import java.util.Arrays;
public class Deck {
    private Card[] community = new Card[5];
    public Deck(){
        for (int x = 0; x<community.length; x++) {
            Card genCard = new Card();
            community[x] = genCard;
        }
    }
    public Card[] getFlop(){
        Card[] flop = Arrays.copyOfRange(community,0,3);
        return (flop);
    }
    public Card getTurn(){
        return community[3];
    }
    public Card getRiver(){
        return community[4];
    }

    public String toString(){ //testing purposes, prints out all five cards in raw numeric form; check Card class to see numeric to card conversion
        return Arrays.deepToString(community);
    }
}
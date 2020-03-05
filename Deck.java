import java.util.Arrays;
public class Deck {
    private Card[] community;
    public Deck(){
        community = new Card[5];
        for (int x = 0; x<community.length; x++) {
            Card genCard = new Card();
            community[x] = genCard;
        }
    }

    public Deck(int size){
        community = new Card[size];
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

    public Card getCard(int x){
        return community[x-1];
    }

    public String toString(){
        return Arrays.deepToString(community);
    }

}
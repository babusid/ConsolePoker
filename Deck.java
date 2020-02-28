import java.util.Arrays;
public class Deck {
    private int[][] community = new int[5][2];
    public Deck(){
        for (int x = 0; x<community.length; x++) {
            Card genCard = new Card();
            community[x] = genCard.getCardval();
        }
    }
    public int[][] getFlop(){
        int[][] flop = Arrays.copyOfRange(community,0,2);
        return (flop);
    }
    public int[] getTurn(){
        return community[3];
    }
    public int[] getRiver(){
        return community[4];
    }

    public String toString(){ //testing purposes, prints out all five cards in raw numeric form; check Card class to see numeric to card conversion
        return Arrays.deepToString(community);
    }
}
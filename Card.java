import java.util.ArrayList;
import java.util.Random;
public class Card{
    private int suit;
    private int val;
    private int[] valsuit = new int[2];
    static ArrayList<Object> UsedCardsArray = new ArrayList<Object>(); //need to create algorithm to make sure there are no duplicate cards in the hand
    public Card (){
        Random r = new Random();
        val = r.nextInt(13)+2; //2-10:numbers; 11-14:J,Q,K,A
        suit = r.nextInt(4)+1; //1-4; Spade, Heart, Diamond, Club
        valsuit[0]=val;
        valsuit[1]=suit;
    }
    public int[] getCardval(){
        return valsuit;
    }
}
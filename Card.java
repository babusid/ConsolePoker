import java.util.ArrayList;
import java.util.Random;
public class Card{
    private int suit;
    private int val;
    private int[] valsuit = new int[2];
    static ArrayList<Object> UsedCardsArray = new ArrayList<Object>();
    public Card (){
        Random r = new Random();
        val = r.nextInt(13)+2; //2-10:numbers; 11-13:J,Q,K; 0:A
        suit = r.nextInt(4)+1; //1-4; Spade, Heart, Diamond, Club
        valsuit[0]=val;
        valsuit[1]=suit;
    }
    public int[] getCardval(){
        return valsuit;
    }
}
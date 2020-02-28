import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Card{
    private int[] valsuit = new int[2];
    private final static ArrayList<int[]> UsedCards = new ArrayList<int[]>(); //need to create algorithm to make sure there are no duplicate cards in the hand
    public Card (){
        Random r = new Random();
        valsuit[0]=r.nextInt(13)+2;//2-10:numbers; 11-14:J,Q,K,A
        valsuit[1]=r.nextInt(4)+1;//1-4; Spade, Heart, Diamond, Club
        if(UsedCards.contains(valsuit)){
            valsuit[0]=r.nextInt(13)+2;//2-10:numbers; 11-14:J,Q,K,A
            valsuit[1]=r.nextInt(4)+1;//1-4; Spade, Heart, Diamond, Club
        }
        UsedCards.add(valsuit);
    }
    public String toString(){
        return Arrays.toString(valsuit);
    }

    public int[] getCardVal(){
        return valsuit;
    }

    public void printUsedCards(){ //testing purposes only; remove later
        for(int[] var:UsedCards){
            System.out.println(Arrays.toString(var));
        };
    }
}
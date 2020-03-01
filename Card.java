import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Card{
    private int[] valsuit = new int[2];
    private final static ArrayList<Card> UsedCards = new ArrayList<Card>(); //need to create algorithm to make sure there are no duplicate cards in the hand
    public Card (){
        Random r = new Random();
        valsuit[0]=r.nextInt(13)+2;//2-10:numbers; 11-14:J,Q,K,A
        valsuit[1]=r.nextInt(4)+1;//1-4; Spade, Heart, Diamond, Club
        if(UsedCards.contains(this)){ //checks whether UsedCards contains another card that equals this one
            valsuit[0]=r.nextInt(13)+2;//2-10:numbers; 11-14:J,Q,K,A
            valsuit[1]=r.nextInt(4)+1;//1-4; Spade, Heart, Diamond, Club
        } 
        UsedCards.add(this);
    }
    public String toString(){ //prints string of how card would be said verbally
        String [] returner = new String[1];
        // 1 = spades; 2 = heart; 3 = Diamond; 4 = Clubs
        switch(this.getSuit()){
            case 1: 
                returner[0] = (String.valueOf(this.getVal()) + " of Spades");
                break;
            case 2:
                returner[0] = String.valueOf(this.getVal()) + " of Hearts";
                break;
            case 3:
                returner[0] = String.valueOf(this.getVal()) + " of Diamonds";
                break;
            case 4:
                returner[0] = String.valueOf(this.getVal()) + " of Clubs";
                break;
        }
        return returner[0];

    }

    public int[] getCardVal(){
        return valsuit;
    }

    public int getSuit(){
        return valsuit[1];
    }

    public int getVal(){
        return valsuit[0];
    }

    // method to compare whether two cards are equal
    //used for UsedCards to check against itself
    public boolean equals(Card check){ 
        if (check.getCardVal()==this.getCardVal()){
            return true;
        } else {
            return false;
        }
    }

    public void printUsedCards(){ //testing purposes only; remove later
        for(Card var:UsedCards){
            System.out.println(var.toString());
        };
    }
}
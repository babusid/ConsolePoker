import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Card{
    private int[] valsuit = new int[2]; // holds value and suit
    private final static ArrayList<int[]> UsedCards = new ArrayList<int[]>();  //holds all used cards globally
    Random r = new Random();
    public Card (){
        valsuit[0]=r.nextInt(13)+2;//2-10:numbers; 11-14:J,Q,K,A
        valsuit[1]=r.nextInt(4)+1;//1-4; Spade, Heart, Diamond, Club
        UsedCardsCheck(this);
    }

    public void UsedCardsCheck(Card check){ //make sure no card repeats itself
        for(int x = 0;x<UsedCards.size();x++){
            if(Arrays.equals(UsedCards.get(x),this.getValSuit())){
                int[] newValSuit = {r.nextInt(13)+2,r.nextInt(4)+1};
                check.setValsuit(newValSuit);
                x=0;
            }
        }
        UsedCards.add(check.getValSuit());
    }
   
    public void setValsuit(int[] newValSuit){
        this.setSuit(newValSuit[1]);
        this.setVal(newValSuit[0]);
    }
    public int[] getValSuit(){
        return valsuit;
    }

    public int getSuit(){
        return valsuit[1];
    }

    public void setSuit(int newSuit){
        valsuit[1] = newSuit;
    }

    public int getVal(){ 
        return valsuit[0];
    }

    public void setVal(int newVal){
        valsuit[0] = newVal;
    }

    public void printUsedCards(){ //testing purposes only; remove later
        for(int[] var:UsedCards){
            System.out.println(Arrays.toString(var));
        };
    }

    public String toString(){ //prints string of how card would be said verbally
        String [] returner = new String[1];
        String printval="";
        // 1 = spades; 2 = heart; 3 = Diamond; 4 = Clubs
        if (this.getVal()>=11){
            switch(this.getVal()){
                case 11:
                    printval = "Jack";
                    break;
                case 12:
                    printval = "Queen";
                    break;
                case 13:
                    printval = "King";
                    break;
                case 14:
                    printval = "Ace";
                    
            }
        } else if (this.getVal()<11){
            printval=String.valueOf(this.getVal());
        }

        switch(this.getSuit()){
            case 1: 
                returner[0] = printval + " of Spades";
                break;
            case 2:
                returner[0] = printval + " of Hearts";
                break;
            case 3:
                returner[0] = printval + " of Diamonds";
                break;
            case 4:
                returner[0] = printval + " of Clubs";
                break;
        }
        return returner[0];

    }

}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Card{
    private int[] valsuit = new int[2]; // holds value and suit
    
    private static ArrayList<int[]> UsedCards = new ArrayList<int[]>();  //holds all used cards globally
    Random r = new Random();

    public Card (){
        valsuit[0]=r.nextInt(13)+2;//2-10:numbers; 11-14:J,Q,K,A
        valsuit[1]=r.nextInt(4)+1;//1-4; Spade, Heart, Diamond, Club
        UsedCardsCheck(this);
    }

    public void UsedCardsCheck(Card check){ //make sure no card repeats itself
        if(UsedCards.size()==0){
            UsedCards.add(check.getValSuit());
        }
        for(int x = 0;x<UsedCards.size();x++){
            int[] UsedArr = UsedCards.get(x);
            if(UsedArr[0]==check.getValSuit()[0]&&UsedArr[1]==check.getValSuit()[1]){
                int[] newValSuit = {r.nextInt(13)+2,r.nextInt(4)+1};
                check.setValsuit(newValSuit);
                x=0;
            }
        }
        UsedCards.add(check.getValSuit());
    }
   
    public void setValsuit(int[] newValSuit){ //condensed production version of setter for both value and suit
        valsuit[1]=newValSuit[1];
        valsuit[0]=newValSuit[0];
    }
    
    public int[] getValSuit(){ //returns both value and suit
        return valsuit;
    }

    public void printUsedCards(){ //debug purposes only; prints all used card
        for(int[] var:UsedCards){
            System.out.println(Arrays.toString(var));
        };
    }

    public String toString(){ //prints string of how card would be said verbally ("Jack of Clubs")
        String [] returner = new String[1];
        String printval="";
        if (this.getValSuit()[0]>=11){ //switch for face card value assignment to first part of string
            switch(this.getValSuit()[0]){
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
        } else if (this.getValSuit()[0]<11){
            printval=String.valueOf(this.getValSuit()[0]); //makes first part of string numeric answer
        }

        switch(this.getValSuit()[1]){ //switch for suit concatenation to printed string
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
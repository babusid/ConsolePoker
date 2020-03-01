import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Card{
    private int[] valsuit = new int[2];
    private final static ArrayList<Card> UsedCards = new ArrayList<Card>(); 
    public Card (){
        Random r = new Random();
        valsuit[0]=r.nextInt(13)+2;//2-10:numbers; 11-14:J,Q,K,A
        valsuit[1]=r.nextInt(4)+1;//1-4; Spade, Heart, Diamond, Club

        //make UsedCards loop back over itself or else duplicates till sometimes randomly happen 
        UsedCardsCheck(this);
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

    public void UsedCardsCheck(Card check){ //recursive method check to make sure no card repeats itself
        Random r = new Random();
        if(UsedCards.contains(check)){ //checks whether UsedCards contains another card that equals this one
            int[] newSet = {(r.nextInt(13)+2),(r.nextInt(4)+1)};
            check.setValsuit(newSet);
            UsedCardsCheck(check);
        }
        else {
            UsedCards.add(this);
        }
    }
    public void setValsuit(int[] newValSuit){
        valsuit = newValSuit;
    }
    public int[] getValSuit(){
        return valsuit;
    }

    public int getSuit(){
        return valsuit[1];
    }

    public int getVal(){ // maybe change to object return so that you can return characters and integers
        return valsuit[0];
    }

    // method to compare whether two cards are equal
    //used for UsedCards to check against itself
    public boolean equals(Card check){ 
        if (check.getValSuit()==this.getValSuit()){
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
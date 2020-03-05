import java.util.Arrays;

public class MainGame {
    public static void main(String[] args){
        Deck test = new Deck(52);
        //System.out.println("Testing Cards: "+(new Card())+", "+(new Card())+", "+(new Card())+", "+(new Card())+", ");
        System.out.println("Flop: "+Arrays.toString(test.getFlop()));
        System.out.println("Turn: "+test.getTurn());
        System.out.println("River: "+test.getRiver()+"\n");
        System.out.println("All Used Cards");
        //test.getCard(51).printUsedCards();
        test.getCard(48).printUsedCards();
    }
}

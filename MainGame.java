import java.util.Arrays;

public class MainGame {
    public static void main(String[] args){
        Deck test = new Deck();
        System.out.println("Testing Cards: "+(new Card())+", "+(new Card())+", "+(new Card())+", "+(new Card())+", ");
        System.out.println("Flop: "+Arrays.toString(test.getFlop()));
        System.out.println("Turn: "+test.getTurn());
        System.out.println("River: "+test.getRiver()+"\n");
        System.out.println("Used Cards");
        test.getRiver().printUsedCards();
    }
}

import java.util.Arrays;

public class MainGame {
    public static void main(String[] args){
        Deck test = new Deck();
        System.out.println(test);
        System.out.println("Flop: "+Arrays.toString(test.getFlop()));
        System.out.println("Turn: "+test.getTurn());
        System.out.println("River: "+test.getRiver());
        System.out.println("Used Cards");
        test.getRiver().printUsedCards();
        //cranch test
        //ew
    }
}
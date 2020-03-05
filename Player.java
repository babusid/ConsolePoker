public class Player {
  private Chip playerChip = new Chip();
  private Deck playerHand = new Deck(2);
  private String name;
  private static int playeramount=1;
  public Player(){
    name = "Player"+String.valueOf(playeramount);
    playeramount++;
  }
  public Player(String name){
    this.name = name;
    playeramount++;
  }

  public Deck getPlayerHand(){
    return playerHand;
  }

  

}
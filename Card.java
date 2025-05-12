public class Card{
  private String suit;
  private int number;

  public Card(int number, String suit){
    this.number = number;
    this.suit = suit;
  }
  
  private ArrayList<Card> deck = new ArrayList<Card();
  public void shuffle(ArrayList<Card> cards){
    for (int i = 1; i<=52; i++){
        number = i%13;
        if (i<=13){
        suit = "Clubs";
        }
        else if(i<=26){
        suit = "Diamonds";
        }
        else if(i<=39){
        suit = "Spades";
        }
        else {
        suit = "Hearts";
        }
    }
    }

}
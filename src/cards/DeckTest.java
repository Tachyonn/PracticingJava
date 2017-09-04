package cards;

/**
 * Created by Digital Anvil on 12.04.2017.
 */
public class DeckTest {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        //deck1.printOut();
        deck1.shuffle();
        //deck1.order();
        //deck1.printOut();
        int count = 0;
        while(deck1.hasNext()){
            Card currentCard = deck1.drawOne();
            System.out.println(currentCard.getSuit().getName()+" "+currentCard.getRank().getName());
            count++;
        }
        System.out.println(count);
    }
}

package cards;

/**
 * Created by Digital Anvil on 12.04.2017.
 */
public class Deck {

    private Card[] deck;
    private int deckTail;

    public Deck() {
        deck = new Card[36];
        deckTail = deck.length;
        int i = 0;
        for (Suit suit : Suit.values)
            for (Rank rank : Rank.values)
                deck[i++] = new Card(rank, suit);

    }

    public void shuffle() {

        for (int i = 0; i < 20000; i++) {
            int cardIndexA = (int) (Math.random() * 36);
            int cardIndexB = (int) (Math.random() * 36);
            if (cardIndexA == cardIndexB) {
                i--;
                continue;
            }
            Card tmpCard = deck[cardIndexA];
            deck[cardIndexA] = deck[cardIndexB];
            deck[cardIndexB] = tmpCard;
        }
    }

    public void order() {
        new Deck();
    }

    public boolean hasNext() {
        return deckTail > 0;
    }

    public Card drawOne() {
        if (deckTail == 0) {
            return null;
        } else {
            deckTail--;
            return deck[deckTail];
        }
    }
}

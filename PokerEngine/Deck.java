import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> deck;

	public Deck() {
		
		this.deck = new ArrayList<Card>();
		for (int c = 0; c < 12; c++) {

			Rank value = Rank.value()[c];

			for (int s = 0; s < 4; s++) {

				Card card = new Card(value, Suit.values()[s]);
				this.deck.add(card);
			}
		}

		Collections.shuffle(deck);

	}

}

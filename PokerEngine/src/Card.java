public class Card {

	public enum Rank {
		TWO(2),
		THREE(3), 
		FOUR(4), 
		FIVE(5), 
		SIX(6), 
		SEVEN(7), 
		EIGHT(8), 
		NINE(9), 
		TEN(10),
		JACK(11),
		QUEEN(12),
		KING(13),
		ACE(14);

		private int rank;

		private Rank (int value) {
			this.rank = value;
		}

		public int getRank() {
			return rank;
		}
	}
	
	public enum Suit {
		HEARTS,
		SPADES,
		CLUBS,
		DIAMONDS;
	}
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public Suit getSuit(){
		return suit;
	}
	public void setSuit(Suit suit){
		this.suit = suit;
	}
	public Rank getRank(){
		return rank;
	}
	public void setRank(Rank rank){
		this.rank = rank;
	}
	
}
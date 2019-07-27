
public class Card {
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	private String name;
	private String suit;
	private int value;
	
	public void describe() {
		System.out.println("Card: " + name + " of " + suit);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

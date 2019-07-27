import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String[] name = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; 
	
		
		
	for (String suits : suit) {
		for (int i = 0; i < name.length; i++) {
			cards.add(new Card(name[i], suits, i + 2));
			
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
	}
}	

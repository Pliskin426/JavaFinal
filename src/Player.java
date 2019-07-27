import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	
	public Player(int score, String name) {
		super();
		this.score = score;
		this.name = name;
	}
	int score;
	String name;
	
	//add card to players hand
	public void draw(Deck deck) {
		hand.add(deck.draw()); 
	}
	//player flips top card of his hand
	public Card flip() {
		return hand.remove(0);
	}
	//adds 1 to player score
	public void score() {
		score = score + 1;
	}
		
	public void describe() {
		System.out.println(name + " current score: " + score);
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}

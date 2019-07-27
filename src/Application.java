
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player(0, "Jim");
		Player player2 = new Player(0, "Bob");
		Deck deck = new Deck();
		deck.shuffle();
		
		//Deal out the cards
		for (int i = 1; i <= 52; i ++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}

		//Game play
		
		for (int i = 0; i <= 25; i++) {
			int p1Card = player1.flip().getValue();
			int p2Card = player2.flip().getValue();
			if (p1Card == p2Card) {
				System.out.println("Draw");
			} else if (p1Card > p2Card) {
				player1.score();
				System.out.println(player1.name + " Wins!");
			} else {
				player2.score();
				System.out.println(player2.name + " Wins!");
			}
		}
		
		System.out.println(player1.name + " Final Score:" + player1.getScore());
		System.out.println(player2.name + " Final Score:" + player2.getScore());
		
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.name + " Wins the game!");
		} else {
			System.out.println(player2.name + " Wins the game!");
		}
  }	
}

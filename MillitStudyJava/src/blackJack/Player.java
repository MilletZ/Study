package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private List<Card> hand;
	public Player(String name){
		this.name = name;
		hand = new ArrayList<Card>();
	}
	public Player(String name,List<Card> hand){
		this.name = name;
		this.hand = hand;
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
	
	public void setAHand(Card card){
		hand.add(card);
	}
	
	public void sayHand(){
		hand.forEach((card)->System.out.println(name+":"+card));
	}
	
	public void throwHand(){
		hand.removeAll(hand);
	}

}

package blackJack;

/**
 * ÷Ω≈∆∂‘œÛ
 * @author JeroZhang
 *
 */
public class Card {
	
	public Card(String name, String suit){
		this.name = name;
		this.suit = suit;
	}
	
	private String name;
	private String suit;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	

}

package blackJack;

/**
 * ֽ�ƶ���
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
	
    @Override
    public java.lang.String toString() {
    	// TODO Auto-generated method stub
    	return suit+name;
    }
}

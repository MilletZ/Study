package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Waiter{
	
	private List<Card> cards = new ArrayList<Card>();
	private List<Player> players = new ArrayList<Player>();
	
	/**
	 * 得到一副牌
	 */
	public void getADeckOfCards(){
		CardsMaker cm = new CardsMaker();
		cards = cm.getaDeckOfCards();
	}
	
	/**
	 * 洗牌
	 */
	public void shuffle(){
		Collections.shuffle(this.cards);
	}
	
	public void shuffle(List<Card> cards){
		Collections.shuffle(cards);
	}
	
	/**
	 * 发一张牌指定排组的牌给指定玩家
	 */
	public void deal(Player player, List<Card> cards){
		Card card = cards.get(0);
		cards.remove(0);
		player.setAHand(card);
	}
	
	public void addPlayer(Player player){
		players.add(player);
	}

	public List<Card> getCards() {
		return cards;
	}
	
	
}

package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
		players.forEach(player->player.throwHand());
		Collections.shuffle(this.cards);
	}
	
	/**
	 * 待拓展的洗牌方法
	 */
	public void shuffle(List<Card> cards){
		Collections.shuffle(cards);
	}
	
	/**
	 * 给每一个玩家发牌
	 */
	public void dealToEveryone(){
		players.forEach((deal)->deal(deal,cards));
	}
	
	/**
	 * 发一张牌指定排组的牌给指定玩家
	 */
	public void deal(Player player, List<Card> cards){
		Card card = cards.get(0);
		cards.remove(0);
		player.setAHand(card);
	}
	
	/**
	 * 先询问是否要牌，再发牌。
	 */
	public void askAndDeal(){
		boolean ifDeal = true;
		Scanner scanner = new Scanner(System.in);
    	
		System.out.println("------发牌------");
		dealToEveryone();
		dealToEveryone();
		System.out.println("----现在的手牌为：----");
		lookHand();
		do{
			System.out.println("是否要牌？(1：要；2：不要)");
			try{
				scanner.reset();
				int tag = scanner.nextInt();
				if(tag==1){
					deal(players.get(0), cards);
					lookHand();
				}else if(tag==2){
					ifDeal = false;
				}else{
					System.out.println("别逗我了！请输入1(要牌)或2(不要牌)。");
					continue;
				}
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("别逗我了！请输入1(要牌)或2(不要牌)。");
				continue;
			}
		}while(ifDeal);
	}
	
	public void addPlayer(Player player){
		players.add(player);
	}

 
	public List<Card> getCards() {
		return cards;
	}
	
	/**
	 * 查看玩家手牌
	 */
	public void lookHand(){
		players.forEach((card)->card.sayHand());
	}
	
}

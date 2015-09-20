package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Waiter{
	
	private List<Card> cards = new ArrayList<Card>();
	private List<Player> players = new ArrayList<Player>();
	
	/**
	 * �õ�һ����
	 */
	public void getADeckOfCards(){
		CardsMaker cm = new CardsMaker();
		cards = cm.getaDeckOfCards();
	}
	
	/**
	 * ϴ��
	 */
	public void shuffle(){
		players.forEach(player->player.throwHand());
		Collections.shuffle(this.cards);
	}
	
	/**
	 * ����չ��ϴ�Ʒ���
	 */
	public void shuffle(List<Card> cards){
		Collections.shuffle(cards);
	}
	
	/**
	 * ��ÿһ����ҷ���
	 */
	public void dealToEveryone(){
		players.forEach((deal)->deal(deal,cards));
	}
	
	/**
	 * ��һ����ָ��������Ƹ�ָ�����
	 */
	public void deal(Player player, List<Card> cards){
		Card card = cards.get(0);
		cards.remove(0);
		player.setAHand(card);
	}
	
	/**
	 * ��ѯ���Ƿ�Ҫ�ƣ��ٷ��ơ�
	 */
	public void askAndDeal(){
		boolean ifDeal = true;
		Scanner scanner = new Scanner(System.in);
    	
		System.out.println("------����------");
		dealToEveryone();
		dealToEveryone();
		System.out.println("----���ڵ�����Ϊ��----");
		lookHand();
		do{
			System.out.println("�Ƿ�Ҫ�ƣ�(1��Ҫ��2����Ҫ)");
			try{
				scanner.reset();
				int tag = scanner.nextInt();
				if(tag==1){
					deal(players.get(0), cards);
					lookHand();
				}else if(tag==2){
					ifDeal = false;
				}else{
					System.out.println("�����ˣ�������1(Ҫ��)��2(��Ҫ��)��");
					continue;
				}
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("�����ˣ�������1(Ҫ��)��2(��Ҫ��)��");
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
	 * �鿴�������
	 */
	public void lookHand(){
		players.forEach((card)->card.sayHand());
	}
	
}

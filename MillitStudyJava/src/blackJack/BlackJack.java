package blackJack;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
	
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------������׼���˿�------");
		waiter.getADeckOfCards();
//		List<Card> cards = waiter.getCards();
//		Iterator<Card> it = cards.iterator();
//		while (it.hasNext()) {
//			Card card = it.next();
//			System.out.println(card.getSuit()+card.getName());
//		}
		System.out.println("------�������------");
		Player bank = new Player("ׯ��");
		System.out.println("����������������");
		Player player1 = new Player(scanner.next()); 
		waiter.addPlayer(player1);
		waiter.addPlayer(bank);
		System.out.println("------��ӭ["+player1.getName()+"]������Ϸ��------");
		System.out.println("------��ʼϴ��------");
		waiter.shuffle();

		System.out.println("------��ʼ����------");
		
	}

}

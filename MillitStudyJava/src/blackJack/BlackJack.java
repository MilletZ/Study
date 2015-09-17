package blackJack;

import java.util.Iterator;
import java.util.List;

public class BlackJack {
	
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		System.out.println("------Éú³ÉÆË¿Ë------");
		List<Card> aDeckOfCards = waiter.generateADeckOfCards();
		Iterator<Card> it = aDeckOfCards.iterator();
		while (it.hasNext()) {
			Card card = it.next();
			System.out.println(card.getSuit()+card.getName());
		}
	}

}

package blackJack;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	
	public List<Card> generateADeckOfCards(){
		List<Card> aDeckOfCards = new ArrayList<Card>();
		String suit = "����˭��";
		Card card;
		for(int i=0;i<4;i++){
			if(i==0)
				suit = "����";
			if(i==1)
				suit = "����";
			if(i==2)
				suit = "÷��";
			if(i==3)
				suit = "��Ƭ";
			
			for(int j=1;j<=13;j++){
				if(j==1){
					card = new Card("A",suit);
				}else if(j==11){
					card = new Card("J",suit);
				}else if(j==12){
					card = new Card("Q",suit);
				}else if(j==13){
					card = new Card("K",suit);
				}else{
					card = new Card(((Integer)j).toString(),suit);
				}
				aDeckOfCards.add(card);
			}
		}
		return aDeckOfCards;
	}
}

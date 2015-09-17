package blackJack;

import java.util.ArrayList;
import java.util.List;

public class CardsMaker {
	private List<Card> aDeckOfCards;
	
	/**
	 * 默认创建一副无王扑克
	 */
	public CardsMaker(){
		aDeckOfCards = new ArrayList<Card>() ;
		String suit = "我是谁？";
		Card card;
		for(int i=0;i<4;i++){
			if(i==0)
				suit = "黑桃";
			if(i==1)
				suit = "红桃";
			if(i==2)
				suit = "梅花";
			if(i==3)
				suit = "方片";
			
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
	}

	public List<Card> getaDeckOfCards() {
		return aDeckOfCards;
	}

	public void setaDeckOfCards(List<Card> aDeckOfCards) {
		this.aDeckOfCards = aDeckOfCards;
	}
	
	
}

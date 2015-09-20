package blackJack;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
	
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		Scanner scanner = new Scanner(System.in);
		boolean ifContinue = true;
		
		System.out.println("------服务生准备扑克------");
		waiter.getADeckOfCards();
//		List<Card> cards = waiter.getCards();
//		Iterator<Card> it = cards.iterator();
//		while (it.hasNext()) {
//			Card card = it.next();
//			System.out.println(card.getSuit()+card.getName());
//		}
		System.out.println("------生成玩家------");
		Player bank = new Player("庄家");
		System.out.println("请输入您的姓名：");
		Player player1 = new Player(scanner.next()); 
		waiter.addPlayer(player1);
		waiter.addPlayer(bank);
		System.out.println("------欢迎["+player1.getName()+"]加入游戏！------");
		System.out.println("------开始洗牌------");
		waiter.shuffle();
        do{
        	waiter.askAndDeal();
        	do{
        		System.out.println("是否继续游戏？（1：是；2：否）");
            	try{
    				scanner.reset();
    				int tag = scanner.nextInt();
    				if(tag==1){
    					break;
    				}else if(tag==2){
    					ifContinue = false;
    					break;
    				}else{
    					System.out.println("别逗我了！请输入1(是)或2(否)。");
    					continue;
    				}
    			}catch(Exception e){
    				e.printStackTrace();
    				System.out.println("别逗我了！请输入1(是)或2(否)。");
    				continue;
    			}
        	}while(true);
        	
        }while(ifContinue);
	}

}

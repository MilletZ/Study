package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	/*
	 * ��Integer���͵�List����
	 */

	public void sortTest1(){
		List<Integer> integerList = new ArrayList<Integer>();
		Random random = new Random();
		Integer k;
		System.out.println("----------------����List<Integer>--------------------");
		for(int i=0;i<10;i++){
			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));
			
			integerList.add(k);
		}
		System.out.println("----------------���ɵ�List<Integer>------------------");
		for (Integer integer : integerList) {
			System.out.print(integer+"|");
		}
		System.out.println();
		System.out.println("----------------����List<Integer>-------------------");
		Collections.sort(integerList);
		System.out.println("----------------������List<integer>----------------");
		for (Integer integer : integerList) {
			System.out.print(integer+"|");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		ct.sortTest1();
	}
	

}

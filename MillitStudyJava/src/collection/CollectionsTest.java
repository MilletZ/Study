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
	
	public void sortTest2(){
		List<String> stringList = new ArrayList<String>();
		Random random = new Random();
		CollectionsTest ct = new CollectionsTest();
		String temp;
		System.out.println("------����List<String>-------");
		for(int i=0;i<10;i++){
			do{
				temp = ct.getAString(random.nextInt(10));
			}while(stringList.contains(temp));
			stringList.add(temp);
		}
		System.out.println("------���ɵ�List<String>-------");
		for (String string : stringList) {
			System.out.println(string);
		}
		System.out.println("------�����List<String>--------");
		Collections.sort(stringList);
		for (String string : stringList) {
			System.out.println(string);
		}
	}
	
	/*
	 * �����������ȵ�����ַ���
	 */
	public String getAString(int size){
		String allChars = "0123456789abcdefghijklmnopqrstuvwxyz";
		StringBuilder newString = new StringBuilder();
		Random random = new Random();
		
		while(size>0){
			size--;
			newString.append(allChars.charAt(random.nextInt(36)));
		}
		return newString.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		ct.sortTest1();
		ct.sortTest2();
	}
	

}

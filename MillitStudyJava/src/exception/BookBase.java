package exception;

import java.util.Scanner;

public class BookBase {
	private String[] books = {"����","����","����"};
	
	public String[] getBooks(){
		return books;
	}
	
	public void searchBook(String[] books,BookBase bb){
		int next = 1;
		int in1 = 0;
		int i = 0;
		String book = new String();
		Scanner s = new Scanner(System.in);
		
		try {
				while (next == 1) {
					next = 0;
					System.out.println("�������1-�����Ʋ���ͼ�飻2-����Ų���ͼ��");
					in1 = s.nextInt();
				}
		} catch (Exception e) {
			System.out.println("������������밴����ʾ�������");
			next=1;
		}
		
		if(in1 == 1){
			System.out.println("������ͼ�����ƣ�");
			s.reset();
			System.out.println(book);
			try{
				while(i>=0){
					if(book == books[i]){
						System.out.println("book:"+book);
						break;
					}
					i++;
				}
			}catch(Exception e){
				System.out.println("ͼ�鲻���ڡ�");
				bb.searchBook(books,bb);
			}finally {
				s.close();
			}
		}else if(in1 == 2){
			System.out.println("������ͼ����ţ�");
			s.reset();
			next = s.nextInt();
			
			try {
					System.out.println("book:"+books[next]);
			}catch(Exception e){
				System.out.println("ͼ�鲻���ڡ�");
				bb.searchBook(books,bb);
			}finally {
				s.close();
			}
		}
	}
}

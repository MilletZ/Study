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
			System.out.println("�������1-�����Ʋ���ͼ�飻2-����Ų���ͼ��");
			in1 = s.nextInt();
		} catch (Exception e) {
			System.out.println("������������밴����ʾ�������");
			bb.searchBook(books,bb);
		}
		
		if(in1 == 1){
			System.out.println("������ͼ�����ƣ�");
			book = s.next();
			try{
				while(i>=0){
					if(book.equals(books[i])){
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
		}else{
			System.out.println("������������밴����ʾ�������");
			s.close();
			bb.searchBook(books,bb);
		}
	}
}

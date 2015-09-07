package exception;

import java.util.Scanner;

public class BookBase {
	private String[] books = {"论语","老子","三体"};
	
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
					System.out.println("输入命令：1-按名称查找图书；2-按序号查找图书");
					in1 = s.nextInt();
				}
		} catch (Exception e) {
			System.out.println("命令输入错误，请按照提示输入命令。");
			next=1;
		}
		
		if(in1 == 1){
			System.out.println("请输入图书名称：");
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
				System.out.println("图书不存在。");
				bb.searchBook(books,bb);
			}finally {
				s.close();
			}
		}else if(in1 == 2){
			System.out.println("请输入图书序号：");
			s.reset();
			next = s.nextInt();
			
			try {
					System.out.println("book:"+books[next]);
			}catch(Exception e){
				System.out.println("图书不存在。");
				bb.searchBook(books,bb);
			}finally {
				s.close();
			}
		}
	}
}

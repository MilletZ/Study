package exception;

public class BorrowBook {
	public static void main(String[] args){
		BookBase bb = new BookBase();
		String[] books = bb.getBooks();
		bb.searchBook(books, bb);
		
	}
}

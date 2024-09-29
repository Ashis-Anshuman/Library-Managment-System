package book.model;

public class Book {
	private String Book_id;
	private String Book_name;
	private String Author;
	private int count;
	
	public String getBook_id() {
		return Book_id;
	}
	public void setBook_id(String book_id) {
		Book_id = book_id;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", Book_name=" + Book_name + ", Author=" + Author + ", count=" + count
				+ "]";
	}
	
	
	
}

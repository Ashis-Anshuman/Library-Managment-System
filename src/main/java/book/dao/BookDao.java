package book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import book.model.Book;
import returnbook.model.ReturnBook;

public class BookDao {
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs= null;
	String url="jdbc:mysql://192.168.48.38:3306/library-managment";
	String user="root";
	String password="Ashis@(2004)";
	
	
	public boolean addbook(Book book) {
		boolean flag=false;
		try {
//			Class.forName("com.mysql.cj.jdbc.driver");
			con=DriverManager.getConnection(url,user,password);
			st=con.prepareStatement("insert into book (book_id,book_name,author,count) values (?,?,?,?)");
			st.setInt(1, book.getBook_id());
			st.setString(2, book.getBook_name());
			st.setString(3, book.getAuthor());
			st.setInt(4, book.getCount());
			if (st.executeUpdate()==1) {
				flag=true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return flag;
		
	}
	
	public boolean updateBook(Book book) {
		boolean flag=false;
		try {
			con=DriverManager.getConnection(url,user,password);
			st=con.prepareStatement("update book set book_name=?,author=?,count=? where book_id=?");
			st.setString(1, book.getBook_name());
			st.setString(2, book.getAuthor());
			st.setInt(3, book.getCount());
			st.setInt(4, book.getBook_id());
			if(st.executeUpdate()==1) {
				flag=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return flag;
	}
	
	public boolean deleteBook(Book book) {
		boolean flag = false;
		try {
			con=DriverManager.getConnection(url,user,password);
			st=con.prepareStatement("delete from book where book_id=?");
			st.setInt(1, book.getBook_id());
			if(st.executeUpdate()==1) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}
	
	public List<Book> retriveBookData(){
		List<Book> bookList=null;
		try {
			con=DriverManager.getConnection(url,user,password);
			st=con.prepareStatement("select * from book");
			rs=st.executeQuery();
			bookList= new ArrayList<>();
			
			while(rs.next()) {
				Book book = new Book();
				book.setBook_id(rs.getInt("book_id"));
				book.setBook_name(rs.getString("book_name"));
				book.setAuthor(rs.getString("author"));
				book.setCount(rs.getInt("count"));
				bookList.add(book);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return bookList;
	}
	
}

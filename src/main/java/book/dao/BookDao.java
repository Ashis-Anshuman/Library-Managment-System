package book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import book.model.Book;

public class BookDao {
	Connection con=null;
	PreparedStatement st=null;
	
	
	public boolean addbook(Book book) {
		boolean flag=false;
		try {
//			Class.forName("com.mysql.cj.jdbc.driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library-managment","root","Ashis@(2004)");
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
}

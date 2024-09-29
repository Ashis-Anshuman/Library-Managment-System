package book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import book.model.Book;

public class BookDao {
	Connection con=null;
	PreparedStatement st=null;
	
	BookDao(){
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/","root","password");
		} catch (Exception e) {
			
		}
	}
	
	public boolean addbook(Book book) {
		boolean flag=false;
		
		return flag;
		
	}
}

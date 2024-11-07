package issueBook.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import issueBook.model.Issue_Book;

public class IssueBook_Dao {
	
	public boolean issuebook(Issue_Book issue) {
		boolean flag=false;
		Connection con=null;
		PreparedStatement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://192.168.48.38:3306/library-managment","siba","password123");
			st=con.prepareStatement("select * from book where book_id=?");
			System.out.println(issue.getBook_id());
			st.setInt(1, issue.getBook_id());
			ResultSet rs=st.executeQuery();
			rs.next();
			int count=rs.getInt("count");
			if(count>0) {
				st=con.prepareStatement("insert into issuebook (student_name, student_id, book_name, book_id, issue_date, return_date, status) values (?,?,?,?,?,?,?)");
				st.setString(1, issue.getStudent_name());
				st.setInt(2, issue.getStudent_id());
				st.setString(3, issue.getBook_name());
				st.setInt(4, issue.getBook_id());
				st.setString(5, issue.getIssue_date());
				st.setString(6, issue.getReturn_date());
				st.setString(7, issue.getStatus());
				
				if (st.executeUpdate()==1) {
					count--;
					st=con.prepareStatement("update book set count=? where book_id=?");
					st.setInt(1, count);
					st.setInt(2, issue.getBook_id());
					if (st.executeUpdate()==1) {
						flag=true;
					}
			}
			
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}

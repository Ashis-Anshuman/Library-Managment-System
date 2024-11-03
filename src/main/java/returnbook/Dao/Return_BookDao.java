package returnbook.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import returnbook.model.ReturnBook;

public class Return_BookDao {
	Connection con=null;
	PreparedStatement st=null;
	String url="jdbc:mysql://192.168.243.38:3306/library-managment";
	String user="root";
	String password="Ashis@(2004)";
	
	public List<ReturnBook> details(ReturnBook rebook) {
		List<ReturnBook> detail=null;
		
		
		ResultSet rs=null;
		
		try {
			con=DriverManager.getConnection(url,user,password);
			st=con.prepareStatement("select * from issuebook where book_id=? && student_id=?");
			st.setInt(1, rebook.getBook_id());
			st.setInt(2, rebook.getStudent_id());
			rs=st.executeQuery();
			detail = new ArrayList<>(); 
			rs.next();
			rebook.setIssue_id(rs.getInt("id"));
			rebook.setBook_name(rs.getString("book_name"));
			rebook.setBook_id(rs.getInt("book_id"));
			rebook.setStudent_name(rs.getString("student_name"));
			rebook.setStudent_id(rs.getInt("student_id"));
			rebook.setIssue_date(rs.getString("issue_date"));
			rebook.setReturn_date(rs.getString("return_date"));
			detail.add(rebook);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return detail;
	}
	
	public boolean returnbook(ReturnBook rebook) {
		boolean flag=false;
		
		
		try {
			LocalDate currentdate=LocalDate.now();
			Date date=Date.valueOf(currentdate);
			System.out.print(date);
			con=DriverManager.getConnection(url,user,password);
			st=con.prepareStatement("update issuebook set status=?, std_return_date=? where book_id=? && student_id=?");
			st.setString(1, "Returned");
			st.setDate(2, date);
			st.setInt(3, rebook.getBook_id());
			st.setInt(4, rebook.getStudent_id());
			if(st.executeUpdate()==1) {
				st=con.prepareStatement("select * from book where book_id=?");
				ResultSet rs=st.executeQuery();
				rs.next();
				int count=rs.getInt("count");
				count++;
				st=con.prepareStatement("update book set count=? where bookid=?");
				st.setInt(1, count);
				st.setInt(2, rebook.getBook_id());
				if (st.executeUpdate()==1) {
					flag=true;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
		
	}
}

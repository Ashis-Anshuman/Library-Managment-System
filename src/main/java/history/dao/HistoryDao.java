package history.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import history.model.HistorryModel;

public class HistoryDao {
	public List<HistorryModel> retrivehistory(){
		List<HistorryModel> list = null;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement st = null;
		try {
			con= DriverManager.getConnection("jdbc:mysql://192.168.243.38:3306/library-managment" , "root", "Ashis@(2004)");
			st=con.prepareStatement("select * from issuebook");
			rs =st.executeQuery();
			list= new ArrayList<>();
			while(rs.next()) {
				HistorryModel hm = new HistorryModel();
				hm.setIssue_id(rs.getInt("id"));
				hm.setBook_name(rs.getString("book_name"));
				hm.setBook_id(rs.getInt("book_id"));
				hm.setStudent_name(rs.getString("student_name"));
				hm.setStudent_id(rs.getInt("student_id"));
				hm.setIssue_date(rs.getString("issue_date"));
				hm.setReturn_date(rs.getString("return_date"));
				hm.setStud_return_date(rs.getString("std_return_date"));
				hm.setStatus(rs.getString("status"));
				list.add(hm);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}

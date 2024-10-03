package student.dao;

import java.sql.Connection;
import java.util.*;



import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import student.model.StudentModel;

public class studentDao {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
	    Class.forName("com.mysql.jdbc.Driver");  // Load JDBC driver
	    return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnection", "root", "Krishna@123");
	}
//	this is the section for the student data featching**********************************************************************************
	public List<StudentModel> fetchAllStudent(){
		List<StudentModel> list=null;
		Connection conn=null;
		Statement st=null;
		ResultSet rs =null;
	
		try {
			conn=studentDao.getConnection();
			st=conn.createStatement();
			rs=st.executeQuery("select * from studentinfo");
			list= new ArrayList<>();
			while (rs.next()) {
				StudentModel std=new StudentModel();
				std.setId(rs.getInt("stud_id"));
				std.setName(rs.getString("stud_name"));
				std.setBranch(rs.getString("stud_branch"));
				std.setEmail(rs.getString("stud_email"));
				list.add(std);	
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				st.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return list;
	}
//	*****************************************************************************************
	public boolean addStudent(StudentModel sm) {
		boolean flag=false;
		Connection con=null;
		PreparedStatement st=null;
		try {
			con = studentDao.getConnection();
            // Prepare the SQL query using placeholders
            String sql = "INSERT INTO studentinfo(stud_name, stud_branch, stud_email) VALUES (?, ?, ?)";
            st = con.prepareStatement(sql);
            // Set the values from the StudentModel object
            st.setString(1, sm.getName());
            st.setString(2, sm.getBranch());
            st.setString(3, sm.getEmail());
            
			if(st.executeUpdate()==1) {
				flag=true;
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return flag;
		
	}

//	student update ********************************************************************************************
	public boolean updateStudent(StudentModel sm) {
		boolean flag=false;
		Connection con=null;
		PreparedStatement st=null;
		try {
			con=studentDao.getConnection();
			st=con.prepareStatement("update studentinfo set stud_name=?,stud_branch=?,stud_email=? where stud_id=?");
			st.setString(1, sm.getName());
			st.setString(2, sm.getBranch());
			st.setString(3, sm.getEmail());
			st.setInt(4,sm.getId());
			if(st.executeUpdate()==1) {
				flag=true;
			}
			
		}catch (Exception e) {
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

//	this is the sectio for  the delet data 
	public boolean deletStudent(StudentModel sm) {
		boolean flag=false;
		Connection con=null;
		PreparedStatement st=null;
		try {
			con=studentDao.getConnection();
			st=con.prepareStatement("delete from studentinfo where stud_id=? ");
			st.setInt(1,sm.getId());
			if(st.executeUpdate()==1) {
				flag=true;
			}
			
		}catch (Exception e) {
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
	
		
	
	
	


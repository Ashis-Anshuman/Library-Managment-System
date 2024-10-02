package student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.studentDao;
import student.model.StudentModel;

/**
 * Servlet implementation class updateStudent
 */
@WebServlet("/updateStudent")
public class updateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentModel sm = new StudentModel();
		
        // Get form data from the request and apply the setter methods
		sm.setId(Integer.parseInt(request.getParameter("id")));
        sm.setName(request.getParameter("name"));
        sm.setBranch(request.getParameter("branch"));
        sm.setEmail(request.getParameter("email"));
        
        studentDao sd=new studentDao();
        if(sd.updateStudent(sm)){
        	request.setAttribute("alert", "added scussfully");
        }else {
        	request.setAttribute("alert", "not added");
        	System.out.println("data is not updated");
        }
       
		
		request.getRequestDispatcher("student.jsp").forward(request, response);
	}

}

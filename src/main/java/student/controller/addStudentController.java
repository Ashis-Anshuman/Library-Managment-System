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
 * Servlet implementation class addStudentController
 */
@WebServlet("/addStudentController")
public class addStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentModel sm = new StudentModel();
		
        // Get form data from the request and apply the setter methods
        sm.setName(request.getParameter("name"));
        sm.setBranch(request.getParameter("branch"));
        sm.setEmail(request.getParameter("email"));
        
        studentDao sd=new studentDao();
        if(sd.addStudent(sm)) {
        	request.setAttribute("alert", "added scussfully");
        }else {
        	request.setAttribute("alert", "not added");
        	System.out.println("Data was not added their ia an issue with it");
        }
       
		
		request.getRequestDispatcher("student.jsp").forward(request, response);
	}

}

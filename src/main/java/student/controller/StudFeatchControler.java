package student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.studentDao;

/**
 * Servlet implementation class StudFeatchControler
 */
@WebServlet("/StudFeatchControler")
public class StudFeatchControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudFeatchControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		studentDao std=new studentDao();
		request.setAttribute("studInfo" ,std.fetchAllStudent());
		RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
		rd.forward(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}

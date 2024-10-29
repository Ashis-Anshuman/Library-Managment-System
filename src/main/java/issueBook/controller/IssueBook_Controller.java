package issueBook.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import issueBook.Dao.IssueBook_Dao;
import issueBook.model.Issue_Book;

/**
 * Servlet implementation class IssueBook_Controller
 */
@WebServlet("/IssueBook_Controller")
public class IssueBook_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IssueBook_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Issue_Book issue=new Issue_Book();
		issue.setStudent_name(request.getParameter("studentname"));
		issue.setStudent_id(Integer.parseInt(request.getParameter("studentid")));
		issue.setBook_name(request.getParameter("bookname"));
		System.out.println(issue.getStudent_name());
		issue.setBook_id(Integer.parseInt(request.getParameter("bookid")));
		issue.setIssue_date(request.getParameter("issueDate"));
		System.out.println(issue.getIssue_date());
		issue.setReturn_date(request.getParameter("returnDate"));
		System.out.println(issue.getReturn_date());
		issue.setStatus("Pending");
		IssueBook_Dao issueDao = new IssueBook_Dao();
		
		if (issueDao.issuebook(issue)) {
			request.setAttribute("message", "Thank You!!");
		} else {
			request.setAttribute("message", "Somthing went wrong");
		}
		RequestDispatcher rd=request.getRequestDispatcher("issuebook.jsp");
		rd.forward(request, response);
	}

}

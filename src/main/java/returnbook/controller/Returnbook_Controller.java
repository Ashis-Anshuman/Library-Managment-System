package returnbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import returnbook.Dao.Return_BookDao;
import returnbook.model.ReturnBook;

/**
 * Servlet implementation class Returnbook_Controller
 */
@WebServlet("/Returnbook_Controller")
public class Returnbook_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Returnbook_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReturnBook rebook = new ReturnBook();
		String bookid=request.getParameter("bookid");
		String studentid=request.getParameter("studentid");
		
		Return_BookDao redao=new Return_BookDao();
		if(bookid!=null && studentid!=null) {
			rebook.setBook_id(Integer.parseInt(bookid));
			rebook.setStudent_id(Integer.parseInt(studentid));
			if(redao.returnbook(rebook)) {
				request.setAttribute("alert", "Book Returned Sussecfully");
			}else {
				request.setAttribute("alert", "Somthing went wrong");
			}
		}else {
			request.setAttribute("alert", "Not found");
		}
		RequestDispatcher rd=request.getRequestDispatcher("Returnbook.jsp");
		rd.forward(request, response);
	}

}

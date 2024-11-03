package returnbook.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import returnbook.Dao.Return_BookDao;
import returnbook.model.ReturnBook;

/**
 * Servlet implementation class Find_details
 */
@WebServlet("/Find_details")
public class Find_details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Find_details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReturnBook re=new ReturnBook();
		String bookid=request.getParameter("bookid");
		String studentid=request.getParameter("studentid");
		
		Return_BookDao redao=new Return_BookDao();
		if(bookid!=null && studentid!=null) {
			re.setBook_id(Integer.parseInt(bookid));
			re.setStudent_id(Integer.parseInt(studentid));
			request.setAttribute("detail", redao.details(re));
		}else {
			System.out.println("dfdjfhdj");
		}
		RequestDispatcher rd=request.getRequestDispatcher("Returnbook.jsp");
		rd.forward(request, response);
	}

}

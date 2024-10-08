package book.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.dao.BookDao;
import book.model.Book;

/**
 * Servlet implementation class DeleteBook
 */
@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setBook_id(Integer.parseInt(request.getParameter("bookid")));
		BookDao dao = new BookDao();
		if(dao.deleteBook(book)) {
			request.setAttribute("message", "Book Deleted successfully");
		}else {
			request.setAttribute("message", "Book id "+request.getParameter("bookid")+" not found");
		}
		RequestDispatcher rd = request.getRequestDispatcher("Manage_Book.jsp");
		rd.forward(request, response);
	}

}

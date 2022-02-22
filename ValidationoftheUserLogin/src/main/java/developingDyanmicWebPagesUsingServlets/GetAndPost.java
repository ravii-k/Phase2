package developingDyanmicWebPagesUsingServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAndPost
 */
public class GetAndPost extends HttpServlet {

	/**
	 * Default constructor.
	 */
		// TODO Auto-generated constructor stub
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		RequestDispatcher rd;
		if ("admin".equalsIgnoreCase(userName) && "Admin@123".equals(password)) {
			System.out.println("Valid user");
			rd = getServletContext().getRequestDispatcher("/Welcome.html");
			rd.forward(request, response);
		} else {
			System.out.println("you are not valid user");
			rd = getServletContext().getRequestDispatcher("/LoginError.html");
			rd.forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

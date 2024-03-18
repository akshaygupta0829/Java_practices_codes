package day4.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.beans.User;
import day4.beans.UserValidator;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet(name = "myUserValidationServlet", urlPatterns = { "/validation" })
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("uid");
		String password = request.getParameter("pwd");
		
		User appUser = new User(username, password);
		
		boolean valid = UserValidator.isValid(appUser);
		if(valid)
			out.println("<h2 style='color:green'>Congratulations!!, You are IN</h2>");
		else 
			out.println("<h2 style='color:red>Sorry,Access denied due to invalid creadentials</h2>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mimeType = "text/html";
		response.setContentType(mimeType);
		
		String responseText = "<h1 style='color:red'>Hello Dairy</h1> <h2 style= 'color:blue'>in Advanced Java</h2>";
		
		PrintWriter out = response.getWriter();
		out.println(responseText);
	}

}

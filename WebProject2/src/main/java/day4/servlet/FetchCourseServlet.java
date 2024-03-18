package day4.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.beans.Course;
import day4.dao.CourseDao;
import day4.dao.DaoInterface;
/**
 * Servlet implementation class FetchCourseServlet
 */
@WebServlet(name = "myFetchCourseServlet", urlPatterns = { "/fetchservlet" })
public class FetchCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String c_id = request.getParameter("id");
		
		int cr_id =Integer.parseInt(c_id);
		
		DaoInterface<Course, Integer> idao = new CourseDao();
		Course crs = idao.getOne(cr_id);
		
		out.println("<h3>Course Details:</h3>");
			
		out.println("<h4>Title:" + crs.getTitle() + "<br></h4>");
		out.println("<h4>Duration:" + crs.getDuration() + "<br></h4>");
		out.println("<h4>Provider:" + crs.getProvider()+ "<br></h4>");
		out.println("<h4>Fees:" + crs.getFees() + "<br></h4>");
		
		

	}

}

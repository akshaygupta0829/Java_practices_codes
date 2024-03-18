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
 * Servlet implementation class CreateCourseServlet
 */
@WebServlet(name = "myCreateCourseServlet", urlPatterns = { "/course" })
public class CreateCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String course_id = request.getParameter("courseId");
		String course_title = request.getParameter("courseTitle");
		String course_duration = request.getParameter("courseDuration");
		String course_provider = request.getParameter("courseProviderName");
		String course_fees = request.getParameter("courseFees");
		
		int c_id = Integer.parseInt(course_id);
		int c_duration = Integer.parseInt(course_duration);
		int c_fees = Integer.parseInt(course_fees);
		
		Course crs = new Course(c_id,course_title,c_duration,course_provider,c_fees);
		
		DaoInterface<Course, Integer> iDao = new CourseDao();
		
		iDao.create(crs);
		out.println("<h2>Course created Successfully</h2>");
	}

}

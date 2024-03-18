package day4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import day4.beans.Course;
import day4.utils.JDBCUtils;

public class CourseDao implements DaoInterface<Course, Integer> {

	@Override
	public Collection<Course> getAll() {
		String sqlQuery = "select courseId,title,duration,provider,fees from course";
		Collection<Course> allCourses = new ArrayList<>();
		try (
				Connection conn = JDBCUtils.buildConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs =  stmt.executeQuery(sqlQuery);
				){
			while(rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int duration = rs.getInt(3);
				String provider = rs.getString(4);
				int fees = rs.getInt(5);
				
				Course currentCourse = new Course(id,title,duration,provider,fees);
				
				allCourses.add(currentCourse);
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return allCourses;
	}

	@Override
	public Course getOne(Integer id) {
		Course foundCourse = null;
		try (
				Connection conn = JDBCUtils.buildConnection();
				){
			String sqlQuery = "select courseId,title,duration,provider,fees from course where courseId = ?";
			PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int c_id = rs.getInt(1);
				String title = rs.getString(2);
				int duration = rs.getInt(3);
				String provider = rs.getString(4);
				int fees = rs.getInt(5);
				
				foundCourse = new Course(c_id,title,duration,provider,fees);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return foundCourse;
	}

	@Override
	public void create(Course newCourse) {
		String sqlQuery = "insert into course values(?,?,?,?,?)";
		try (
				Connection conn = JDBCUtils.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			//Extracting the values from the incoming Course object
			int id = newCourse.getCourseId();
			String title = newCourse.getTitle();
			int duration = newCourse.getDuration();
			String provider = newCourse.getProvider();
			int fees = newCourse.getFees();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, title);
			pstmt.setInt(3, duration);
			pstmt.setString(4, provider);
			pstmt.setInt(5, fees);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record inserted");
		} 
		catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		
	}

	@Override
	public void deleteOne(Integer id) {
		// TODO Auto-generated method stub
		String sqlQuery = "delete from course where courseId = ?";
		try (
				Connection conn = JDBCUtils.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			pstmt.setInt(1, id);
			int count = pstmt.executeUpdate();
			System.out.println(count + " record deleted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Course modifyCourse) {
		// TODO Auto-generated method stub
		String sqlQuery = "update course set title = ?,duration = ?,provider = ?,fees = ? where courseId = ?";
		try (
				Connection conn = JDBCUtils.buildConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			int id =  modifyCourse.getCourseId();
			String title = modifyCourse.getTitle();
			int duration = modifyCourse.getDuration();
			String provider = modifyCourse.getProvider();
			int fees = modifyCourse.getFees();
			
			pstmt.setInt(5, id);
			pstmt.setString(1, title);
			pstmt.setInt(2, duration);
			pstmt.setString(3, provider);
			pstmt.setInt(4, fees);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " record updated");
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}






















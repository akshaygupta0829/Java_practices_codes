package day7.main;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import day7.beans.Course;
import day7.beans.CourseEntities;
import day7.utils.HibernateAnnotationUtils;

public class HQLCourseMain {

	private static void fromClause() {
		SessionFactory factory = HibernateAnnotationUtils.getSessionFactory();
		Session session = factory.openSession();
		
		String hblQuery = "from Course crs";
		Query<Course> hibernateQuery = session.createQuery(hblQuery);
		List<Course> course_list = hibernateQuery.list();
		
		for(Course crs:course_list) {
			System.out.println(crs);
		}
		session.close();
		factory.close();
		
	}
	private static void selectClause() {
		SessionFactory factory = HibernateAnnotationUtils.getSessionFactory();
		Session session = factory.openSession();
		
		String hblQuery = "select crs.title,crs.provider from Course crs";
		Query<Object[]> hibernateQuery = session.createQuery(hblQuery);
		List<Object[]> course_list = hibernateQuery.list();
		
		for(Object[] crs:course_list) {
			Object title = crs[0];
			Object provider = crs[1];
			System.out.println("Title:" + title +"\nProvider:" + provider);
			System.out.println();
		}
		session.close();
		factory.close();
		
	}
	
	private static void constructorExpression() {
		SessionFactory factory = HibernateAnnotationUtils.getSessionFactory();
		Session session = factory.openSession();
		
		String hblQuery = "select new day7.beans.CourseEntities(crs.title,crs.provider,crs.fees) from Course crs";
		Query<CourseEntities> hibernateQuery = session.createQuery(hblQuery);
		List<CourseEntities> course_list = hibernateQuery.list();
		
		for(CourseEntities crs:course_list) {
			System.out.println("Title:" + crs.getTitle()); 
			System.out.println("Provider:" + crs.getProvider());
			System.out.println("Fees:" + crs.getFees());
			System.out.println();
		}
		session.close();
		factory.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fromClause();
		selectClause();
		//constructorExpression();
	}

}

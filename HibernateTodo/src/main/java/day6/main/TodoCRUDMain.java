package day6.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day6.beans.Course;
import day6.utils.HibernateUtils;


public class TodoCRUDMain {
	private static void deleteCourse() {
		SessionFactory factory = HibernateUtils.createSession();
		Session session = factory.openSession();
		Class<Course> entityCourse = Course.class;
		Serializable id = 102;
		Course foundCourse = session.load(entityCourse, id);
		Transaction tx = session.beginTransaction();
		
		session.delete(foundCourse);
		tx.commit();
		session.close();
		session.close();
		
		System.out.println("Record deleted");
		
	}
	private static void updateCourse() {
		SessionFactory factory = HibernateUtils.createSession();
		Session session = factory.openSession();
		Class<Course> entityType = Course.class;
		Serializable id = 102;
		
		Course foundCourse = session.load(entityType, id);
		Transaction tx = session.beginTransaction();
		
		foundCourse.setDuration(50);
		foundCourse.setProvider("Coursera");
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record update");	
		
	}

	private static void showCourse() {
		SessionFactory factory = HibernateUtils.createSession();
		Session session = factory.openSession();
		
		Class<Course> EntityType = Course.class;
		Serializable id = 101;
		
		Course foundCourse = session.load(EntityType, id);
		session.close();
		factory.close();
		System.out.println(foundCourse);	
		
	}
	
	private static void createCourse() {
		SessionFactory factory = HibernateUtils.createSession();
		Session session = factory.openSession();
		
		Course crs = new Course(102,"Java",40,"udemy",25000);
		
		Transaction tx = session.beginTransaction();
		session.save(crs);
		tx.commit();
		
		session.close();
		factory.close();
		
		System.out.println("Record Created");
		
	}
	
	
	public static void main(String[] args) {

		//createCourse();
		//showCourse();
		//updateCourse();
		deleteCourse();
	}

}

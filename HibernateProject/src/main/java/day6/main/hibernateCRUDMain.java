package day6.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day6.beans.Restaurant;
import day7.utils.HibernateUtils;

public class hibernateCRUDMain {

	private static void createNewRestaurant() {
		Configuration setConfiguration = new Configuration();
		SessionFactory hibernateFactory = setConfiguration.configure().buildSessionFactory();
		Session hibernateSession = hibernateFactory.openSession();
		
		Restaurant rst = new Restaurant(101,10,"Hotel Paradise","Indian");
		
		Transaction hiberTransaction = hibernateSession.beginTransaction();
		hibernateSession.save(rst);
		hiberTransaction.commit();
		
		hibernateSession.close();
		hibernateFactory.close();
		
		System.out.println("Restaurant created successfully");
		
	}
	
	private static void showRestaurantAgain() {
		//Use lazy=false for EAGER initialization
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		Class<Restaurant> entityClassType = Restaurant.class;
		Serializable entityId = 101;
				
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		System.out.println(foundRestaurant.getClass().getName());
	
		System.out.println(foundRestaurant.getRestId());
		System.out.println(foundRestaurant.getRestId());
		System.out.println(foundRestaurant.getRestId());
		System.out.println(foundRestaurant.getRestId());
		System.out.println(foundRestaurant.getRestCuisine());
		System.out.println(foundRestaurant.getRestName());
	}
	private static void deleteRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<Restaurant> entityClassType = Restaurant.class;
		Serializable entityId = 102;//Serializable entityId  = new Integer(101);
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		
		Transaction tx = session.beginTransaction();
			session.delete(foundRestaurant);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record deleted");
	}
	private static void updateRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Class<Restaurant> entityClassType = Restaurant.class;
		Serializable entityId = 101;//Serializable entityId  = new Integer(101);
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		
		Transaction tx = 	session.beginTransaction();
			foundRestaurant.setRestCuisine("Oriental");
			foundRestaurant.setBranchCount(12);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record updated");
		
	}
	private static void showOneRestaurant() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		//Specifying the entity specific Class type using a reference of type 'Class' class
		Class<Restaurant> entityClassType = Restaurant.class;
		//Class<Employee> type = Employee.class;
		
		//Specifying the identity in the form of java.io.Serializable
		Serializable entityId = 101;//Serializable entityId  = new Integer(101);
		
		
		Restaurant foundRestaurant = session.load(entityClassType, entityId);
		System.out.println(foundRestaurant);
		session.close();
		factory.close();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createNewRestaurant();
	}

}

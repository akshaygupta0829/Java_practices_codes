package day7.main;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import day7.beans.RestaurantNameAndBranches;
import day7.entities.Restaurant;
import day7.utils.HibernateUtils;

public class HQLMain {
	
	private static void constructorExpression() {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		String hqlQuery = "select new day7.beans.RestaurantNameAndBranches(rs.restName,rs.restCuisine) from Restaurant rs";
		Query<RestaurantNameAndBranches> hbQuery = session.createQuery(hqlQuery);
		
		List<RestaurantNameAndBranches> rs_list = hbQuery.list();
		for(RestaurantNameAndBranches rst : rs_list) {
			System.out.println("Restaurant Name:" + rst.getRestaurantName());
			System.out.println("Restaurant Cuisine:" + rst.getRestaurantCuisine());
			System.out.println();
		}
		session.close();
		factory.close();
	}

	private static void selectClause() {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		String hqlQuery = "select rs.restName, rs.restCuisine from Restaurant rs";
		Query<Object[]> hbQuery = session.createQuery(hqlQuery);
		
		List<Object[]> rs_list = hbQuery.list();
		
		for(Object[] rst:rs_list) {
			Object name = rst[0];
			Object cuisine = rst[1];
			System.out.println("Hotel name " + name + " is " + cuisine );
			
		}
		session.close();
		factory.close();			
	}
	
	private static void fromClause() {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		
		String hqlQuery = "from Restaurant rs";
		Query<Restaurant> hbQuery = session.createQuery(hqlQuery);
		
		List<Restaurant> rs_list = hbQuery.list();
		
		for(Restaurant rst:rs_list) {
			System.out.println(rst.getRestName());	
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fromClause();
		//selectClause();
		constructorExpression();
	}

}

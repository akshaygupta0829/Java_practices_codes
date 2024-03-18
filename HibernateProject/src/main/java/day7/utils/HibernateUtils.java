package day7.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import day7.entities.Restaurant;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		System.out.println("Configuring Hibernate Programmatically....");
		Configuration setConfigure = new Configuration();
		
		Class<Restaurant> entity = Restaurant.class;
		setConfigure.addAnnotatedClass(entity);
		
		Properties proper = new Properties();
		proper.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		proper.put("hibernate.connection.url","jdbc:mysql://localhost:3306/restaurant?useSSL=false");
		proper.put("hibernate.connection.username","root");
		proper.put("hibernate.connection.password","root");
		proper.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		proper.put("hibernate.show_sql","true");
		proper.put("hibernate.hbm2ddl.auto","update");
		
		setConfigure.setProperties(proper);
		SessionFactory factory = setConfigure.buildSessionFactory();
			
		return factory;
	}
	

}

package day6.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static SessionFactory createSession() {
		
		Configuration setConfigure = new Configuration();
		SessionFactory factory = setConfigure.configure().buildSessionFactory();
		return factory;
		
	}
}

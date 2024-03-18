package day2;

import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded");
			
			String connectionUrl = "jdbc:mysql://localhost:3306/cdac_nov_23";
			String userId = "root";
			String password = "root";
			
			Connection dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			System.out.println("DB connected");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package day1;

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
			
			Connection dbconnection = DriverManager.getConnection(connectionUrl,userId,password);
			System.out.println("Connected to DB");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

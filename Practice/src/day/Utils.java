package day;

import java.sql.Connection;
import java.sql.DriverManager;

public class Utils {
	public static Connection buildConn() throws Exception {
		String driverClass = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClass);
		String connectionUrl = "jdbc:mysql://localhost:3306/restaurant?useSSL=false";
		String userId = "root";
		String password = "root";
		
		Connection dbconn = DriverManager.getConnection(connectionUrl,userId,password);
		
		return dbconn;
	}
}

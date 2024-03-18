package day2;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	public static Connection buildConnection() throws Exception{
		String driverClass = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClass);
		String connectionUrl = "jdbc:mysql://localhost:3306/course?useSSL=false";
		String userId = "root";
		String password = "root";
		
		Connection	dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
		return dbConnection;		
	}
}


public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded");
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}

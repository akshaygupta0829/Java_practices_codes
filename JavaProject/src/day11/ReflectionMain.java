package day11;

public class ReflectionMain {

	private static void createObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//This method creates an object of the class where the name of the class is accepted by 'className' variable
		//Loading the class explicitly
		Class loadClass = Class.forName(className);
		//Creating an object of the loaded class
		loadClass.newInstance();
		
	}
	
	
	public static void main(String[] args) {

		try {
			try {
				createObject("day11.Employee");
				//createObject("day11.Department");
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
		
	}

}

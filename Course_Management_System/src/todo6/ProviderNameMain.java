package todo6;


public class ProviderNameMain {

	public static void main(String[] args) {

		
		try {
			CourseCollection.printCourseNames("Udemy");
		}
		catch(ProviderNotFoundException ex) {
			//ex.printStackTrace();
			System.out.println(ex);
		}
		
	}

}

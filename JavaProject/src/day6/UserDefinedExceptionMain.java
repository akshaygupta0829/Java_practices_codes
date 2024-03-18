package day6;

public class UserDefinedExceptionMain {

	public static void main(String[] args) {
		try {
			int position = NameCollection.getPosition("namit");
			System.out.println(position);			
		} 
		
		catch (NameNotFoundException nameEx) {
			//nameEx.printStackTrace();
			
			System.out.println(nameEx.getMessage());
		}	
		
	}

}

package day4.beans;

public class UserValidator {

	public static boolean isValid(User currentUser) {

		boolean success = false;
		String currentId = currentUser.getUserId();
		String currentPass = currentUser.getPassword();
		
		if(currentId.equals("Akshay") && currentPass.equals("Dairy")){
			success = true;
		}
		return success;
	}

}

package day6;

public class NameCollection {
	private static String nameList[] = {"Akshay","Piyush","Palash","Govind","Namit"};
	
	public static int getPosition(String name) throws NameNotFoundException{
	
		int position = -1;
		int size = nameList.length;
		for(int index = 0;index < size;index++) {
			String currentName = nameList[index];
			if(currentName.equals(name)) {
				position = index;
				break;
			}
		}
		
		if(position == -1) {
			String error = "The entered name is invalid. It is not available";
			NameNotFoundException nx = new NameNotFoundException(error, name);
			throw nx;
		}		
		
		return position;
	}
}

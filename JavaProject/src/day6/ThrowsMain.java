package day6;

public class ThrowsMain {
	
	private static void print() throws Exception {
		
	}

	private static void display() {
		try {
			print();
		} 
		catch (Exception e) {

		}
	}
	
	private static void show() throws Exception{
		print();
	}
	
	public static void main(String[] args) {
		display();
		try {
			show();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}

}

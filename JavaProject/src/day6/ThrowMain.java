package day6;

public class ThrowMain {

	public static int doDivision(int x , int y) {
		if(y == 0) {
			RuntimeException rx = new RuntimeException("2nd no. has to be non-zero to perform the division");
			throw rx;			
		}
		int division = x / y;
		return division;
	}
	public static void main(String[] args) {

		int divResult = doDivision(20,10);
		System.out.println(divResult);
	}

}

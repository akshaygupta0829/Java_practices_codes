package day11;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting firstGreeting = () -> "Hello Shiv";
		Greeting secondGreeting = () -> {
			String msg = "Welcome Dairy";
			return msg;
		};
		
		String gr = firstGreeting.sayGreeting();
		String gr2 = secondGreeting.sayGreeting();
		System.out.println(gr);
		System.out.println(gr2);
		
	}
}

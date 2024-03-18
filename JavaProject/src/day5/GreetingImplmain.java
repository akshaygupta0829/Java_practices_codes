package day5;

public class GreetingImplmain {

	public static void main(String[] args) {

		GreetingImpl grImpl = new GreetingImpl();
		grImpl.showGreeting();
		
		Greeting newObj = new WelcomeGreeting();
		grImpl.setService(newObj);
		grImpl.showGreeting();
		
	}

}

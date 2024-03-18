package day5;

public class GreetingMain {

	public static void main(String[] args) {

		Greeting gr = new HelloGreeting();
		System.out.println(gr.sayGreeting());
		
		gr = new WelcomeGreeting();
		System.out.println(gr.sayGreeting());
	}

}

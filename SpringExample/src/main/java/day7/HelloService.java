package day7;

import day7.GreetingService;

public class HelloService implements GreetingService {

	public HelloService() {
		System.out.println("Hello Service instantiated");
	}
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello Spring";
	}

}

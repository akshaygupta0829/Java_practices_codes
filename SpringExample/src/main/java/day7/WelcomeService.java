package day7;

import day7.GreetingService;

public class WelcomeService implements GreetingService {

//	public WelcomeService() {
//		System.out.println("Welcome Service instantiated");
//	}
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome Spring";
	}

}

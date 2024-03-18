package day5;

public class GreetingImpl {
	private Greeting service;

	public GreetingImpl() {
		service = new HelloGreeting();
	}
	
	public GreetingImpl(Greeting service) {
		this.service = service;
	}

	public Greeting getService() {
		return service;
	}

	public void setService(Greeting service) {
		this.service = service;
	}
	
	public void showGreeting() {
		String messege = service.sayGreeting();
		System.out.println(messege);
	}
	
}

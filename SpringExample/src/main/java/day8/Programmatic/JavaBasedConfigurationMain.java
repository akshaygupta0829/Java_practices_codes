package day8.Programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day7.GreetingService;

public class JavaBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext();
		
		Class<SpringConfig> configureUnit = SpringConfig.class;
		annoCtx.register(configureUnit);
		
		annoCtx.refresh();
		
		Object obj = annoCtx.getBean("helloBean");
		GreetingService gs = (GreetingService)obj;
		String greet = gs.sayGreeting();
		System.out.println(greet);
		
		obj = annoCtx.getBean("welcomeBean");
		gs = (GreetingService)obj;
		greet = gs.sayGreeting();
		System.out.println(greet);
		
		obj = annoCtx.getBean("myUserBean");
		gs = (GreetingService)obj;
		greet = gs.sayGreeting();
		System.out.println(greet);
		
		Object o1 = annoCtx.getBean("greetBean");
		Object o2 = annoCtx.getBean("greetBean");
		System.out.println(o1 == o2);
		
	}

}

package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day7.GreetingService;

public class SetterAndConstructorInjectionMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		System.out.println("-------- Setter Injection --------");
		Object obj = ctx.getBean("myBean6");
		GreetingService gs = (GreetingService)obj;
		String greet = gs.sayGreeting();
		System.out.println(greet);
		
		System.out.println("-------- Constructor Injection --------");
		obj = ctx.getBean("myBean7");
		gs = (GreetingService)obj;
		greet = gs.sayGreeting();
		System.out.println(greet);
		System.out.println();
		
		obj = ctx.getBean("myBean8");
		gs = (GreetingService)obj;
		greet = gs.sayGreeting();
		System.out.println(greet);
	}

}

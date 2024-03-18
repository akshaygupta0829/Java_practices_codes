package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import day7.GreetingService;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "spring-config.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(filePath);
		
		Object obj = ctx.getBean("myBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = ctx.getBean("myBean2");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
	}

}

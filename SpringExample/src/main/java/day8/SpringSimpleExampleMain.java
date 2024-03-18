package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import day7.GreetingService;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "spring-config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(filePath);
		
		Object obj = ctx.getBean("myBean7");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println();
		
		obj = ctx.getBean("myBean8");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
	}

}

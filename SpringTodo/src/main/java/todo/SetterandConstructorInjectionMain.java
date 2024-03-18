package todo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterandConstructorInjectionMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");		
		 
		System.out.println("-------- Setter Injection --------");
		Course crs = (Course)ctx.getBean("setter");
		String st = crs.courseName();
		System.out.println(st);
		System.out.println();
		
		System.out.println("-------- Construction Injection --------");
		crs = (Course)ctx.getBean("constructor");
		st = crs.courseName();
		System.out.println(st);
	}

}

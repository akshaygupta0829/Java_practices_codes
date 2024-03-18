package day8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeansScopeMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		System.out.println("---------Spring Singleton----------");
		Object obj = ctx.getBean("myBean4");
		Object obj1 = ctx.getBean("myBean4");
		Object obj2 = ctx.getBean("myBean4");
		System.out.println(obj == obj1);
		System.out.println(obj == obj2);
	
		System.out.println("---------Spring Prototype----------");
		obj = ctx.getBean("myBean5");
		obj1 = ctx.getBean("myBean5");
		obj2 = ctx.getBean("myBean5");
		System.out.println(obj == obj1);
		System.out.println(obj == obj2);
		
	}

}

package day;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "spring-config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(filePath);
		
		Student gs = (Student)ctx.getBean("student1");
		String reply = gs.display();
		System.out.println(reply);
		
		gs = (Student)ctx.getBean("student2");
		String r = gs.display();
		System.out.println(r);
		
		
	}

}

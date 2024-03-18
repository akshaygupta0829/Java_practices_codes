package day8.Programmatic;

import org.springframework.stereotype.Component;

@Component
public class Test {

	public Test() {
		System.out.println("Test Instantiated...");	
	}
	
	public void doTest() {
		System.out.println("Test method works...");	
	}

}

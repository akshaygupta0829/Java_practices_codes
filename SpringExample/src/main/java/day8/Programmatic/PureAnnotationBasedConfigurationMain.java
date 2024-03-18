package day8.Programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {

		Class<SpringConfig> configUnit = SpringConfig.class;
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(configUnit);
		
		Test test = annoCtx.getBean(Test.class);
		test.doTest();
	}

}

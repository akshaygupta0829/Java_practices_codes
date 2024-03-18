package day9;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day9_fourth.FourthTest;
import day9_fourth.another.AnotherFourthTest;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext(SpringAppConfig.class);
		
		FirstTest firstClass = annoCtx.getBean(FirstTest.class);
		SecondTest secondClass = annoCtx.getBean(SecondTest.class);
		ThirdTest thirdClass = (ThirdTest)annoCtx.getBean("third");
		firstClass.doTest();
		secondClass.doTest();
		thirdClass.doTest();
		
		System.out.println("-------- Accessing FourthTest Bean --------");
		FourthTest fourthClass = annoCtx.getBean(FourthTest.class);
		AnotherFourthTest anotherClass = annoCtx.getBean(AnotherFourthTest.class);
		fourthClass.doTest();
		anotherClass.doTest();
		
		System.out.println("-------------Accessing bean of type java.util.List------------------");
		List<String> listofCountries = (List<String>)annoCtx.getBean("countries");
		for(String list:listofCountries)
		{
			System.out.println(list);
		}
		
		
	}

}

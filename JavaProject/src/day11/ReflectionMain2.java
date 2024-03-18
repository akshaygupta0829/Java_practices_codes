package day11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain2 {

	public static void printClassInfo(String className) throws ClassNotFoundException {
		Class loadedClass = Class.forName(className);
		
		System.out.println("----------- Method Name -----------");
		Method[] allMethods = loadedClass.getDeclaredMethods();
		for(Method currentMethod : allMethods) {
			String methodName = currentMethod.getName();
			System.out.println(methodName);
		}
		
		System.out.println("----------- Field Name -----------");
		Field[] allField = loadedClass.getDeclaredFields();
		for(Field currentField : allField) {
			String fieldName = currentField.getName();
			System.out.println(fieldName);
		}
		
		
	}
	
	public static void main(String[] args) {
		try {
			printClassInfo("day11.TrainingProgram");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

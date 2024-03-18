package day8;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputMain {

	public static void main(String[] args) {
		InputStream keyboard = System.in;
		try (
				Scanner sc = new Scanner(keyboard);
				){
			System.out.println("Enter your Details:");
			System.out.print("Name: ");
			String myName = sc.nextLine();
			System.out.print("Age: ");
			int myAge = sc.nextInt();
			System.out.print("Weight (Kg): ");
			float myWeight = sc.nextFloat();
			System.out.println("------------------ Your Details 	--------------------");
			System.out.println("Name: " + myName);
			System.out.println("Age: " + myAge);
			System.out.println("Weight: " + myWeight);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

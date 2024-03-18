package todo9;

import java.util.Scanner;

public class CourseMain {

	int courseId, duration, fees;
	String title, provider;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Enter the number of objrcts to be passed:");
		int size = sc.nextInt();
		int choice;
		SerializeCourse crs = new SerializeCourse();
		Course[] arr = null;
		
		do {
			System.out.println("Enter the Choice \n1.Take Inputs \n2.Serialize it \n3.Deserialize it \n4.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				arr = takeInputs(size);
				break;
			case 2:
				crs.Serialize(arr);
				break;
			case 3:
				crs.Deserialize(size);
				break;
			case 4:
				System.out.println("Exit...!\n");
			default:
				System.out.println("Enter right choice!!");
			}
			
			
		}while(choice!=4);
		
	}
	
	public static Course[] takeInputs(int size) {
		
		Course []arr = new Course[size];
		int j = 0;
			while(j!=size) {
				System.out.println("Enter the CourseId :");
				int courseId = sc.nextInt();
				
				System.out.println("Enter the CourseTitle :");
				String title = sc.next();
				
				System.out.println("Enter the CourseProvider :");
				String provider = sc.next();
				
				System.out.println("Enter the CourseDuration :");
				int duration = sc.nextInt();
				
				System.out.println("Enter the CourseFees :");
				int fees = sc.nextInt();
				
				arr[j] = new Course(courseId,title,provider,duration,fees);
				j++;
			}
		
		return arr;
	}

}

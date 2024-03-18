package todo10;

import java.util.Scanner;

public class CourseMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int choice;
		CourseDataCollection courseDataCall = new CourseDataCollection();
		
		do {
			System.out.println("Enter Your Choice: \n1.Add Details of Course.\n2.Find Course.\n3.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				courseDataCall.addNewCourse();
				break;
				
			case 2:
				courseDataCall.findCourse();
				break;
				
			case 3:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong Choice.");
				break;
			}
		}while(choice!=3);
	}

}

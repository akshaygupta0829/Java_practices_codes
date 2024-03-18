package todo;

public class CourseDataCalculatorMain {

	public static void main(String[] args) {
		
		CourseManagementSystem course[] = new CourseManagementSystem[5];
		course[0] = new CourseManagementSystem(1,"Java",60.00f,"Coursera",30000);
		course[1] = new CourseManagementSystem(2,"C++",30.00f,"Udemy",25000);
		course[2] = new CourseManagementSystem(3,"C",30.00f,"Udemy",10000);
		course[3] = new CourseManagementSystem(4,"SalesForce",50.00f,"Coursera",30000);
		course[4] = new CourseManagementSystem(5,"DataBase",30.00f,"Udemy",5000);
		
		CourseDataCalculator cd = new AverageDuration();
		System.out.println("Average Duration is "+ cd.doCaculation(course));
		
		cd = new AverageFees();
		System.out.println("Average Fees is "+ cd.doCaculation(course));
	}

}

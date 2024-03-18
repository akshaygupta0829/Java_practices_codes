package todo4;

import todo1_and_2.Course;

public class CourseDataCalculatorMain {

	public static void main(String[] args) {
		Course courses[] = new Course[5];
		courses[0] = new Course(1,"Java",60.00f,"Coursera",30000);
		courses[1] = new Course(2,"C++",30.00f,"Udemy",25000);
		courses[2] = new Course(3,"C",30.00f,"Udemy",10000);
		courses[3] = new Course(4,"SalesForce",50.00f,"Coursera",30000);
		courses[4] = new Course(5,"DataBase",30.00f,"Udemy",5000);
		
		CourseDataCalculator cd = new AverageDuration();
		System.out.println("Average Duration is "+ cd.doCalculation(courses));
		
		cd = new AverageFees();
		System.out.println("Average Fees is "+ cd.doCalculation(courses));
	}

}

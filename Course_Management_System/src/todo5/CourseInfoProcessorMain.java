package todo5;


public class CourseInfoProcessorMain {

	public static void main(String[] args) {

		Course[] courses = new Course[5];
		courses[0] = new Course(1,"Core Java",100,"Udemy",5500);
		courses[1] = new Course(2,"Adv Java",100,"Udemy",8500);
		courses[2] = new Course(3,"Angular",60,"Edureka",7500);
		courses[3] = new Course(4,"Angular",75,"Coursera",8000);
		courses[4] = new Course(5,"Spring",80,"Udemy",10500);
		
		CourseInfo info = new CourseInfo("Udemy", 100);
						
						
		CourseInfoProcessor cd = new TotalCount();
		System.out.println("Total count is " + cd.processCourseInfo(courses, info));
		
		cd =new AverageFees();
		System.out.println("Average fees  is "+ cd.processCourseInfo(courses, info));
		
		
		
	}

}

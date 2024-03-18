package todo;

public class CourseProcessor {
	
	private static void printShortDurationCourseNames(CourseManagementSystem[] courseRef) {
		for(CourseManagementSystem shortTime : courseRef) {
			float shortDuration = shortTime.getDuration();
			String getTitleName = shortTime.getTitle();
			if(shortDuration < 40)
				System.out.println(getTitleName);
		}
	}
	
	public static void main(String[] args) {
		CourseManagementSystem course[] = new CourseManagementSystem[5];
		course[0] = new CourseManagementSystem(1,"Java",60.00f,"Coursera",30000);
		course[1] = new CourseManagementSystem(2,"C++",35.00f,"Udemy",25000);
		course[2] = new CourseManagementSystem(3,"C",30.00f,"udemy",10000);
		course[3] = new CourseManagementSystem(4,"SalesForce",50.00f,"Coursera",30000);
		course[4] = new CourseManagementSystem(5,"DataBase",15.00f,"udemy",5000);

		printShortDurationCourseNames(course);
	}

}

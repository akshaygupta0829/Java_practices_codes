package todo3;

import todo1_and_2.Course;

public class CourseProcessor {

	public static void printShortDurationCourseNames(Course[] courseRef) {
		for(Course shortTime : courseRef) {
			float shortDuration = shortTime.getDuration();
			String getTitleName = shortTime.getTitle();
			if(shortDuration < 40)
				System.out.println(getTitleName);
		}
	}

	public static void main(String[] args) {
		Course courses[] = new Course[5];
		courses[0] = new Course(1,"Java",60.00f,"Coursera",30000);
		courses[1] = new Course(2,"C++",35.00f,"Udemy",25000);
		courses[2] = new Course(3,"C",30.00f,"udemy",10000);
		courses[3] = new Course(4,"SalesForce",50.00f,"Coursera",30000);
		courses[4] = new Course(5,"DataBase",15.00f,"udemy",5000);

		printShortDurationCourseNames(courses);
	}


}


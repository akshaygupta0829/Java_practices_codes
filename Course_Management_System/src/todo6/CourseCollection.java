package todo6;

import todo5.Course;

public class CourseCollection {

	private static Course[] availableCourses;
	static {
		availableCourses = new Course[5];
		availableCourses[0] = new Course(1,"Core Java",100,"Udemy",5500);
		availableCourses[1] = new Course(2,"Adv Java",100,"Udemy",8500);
		availableCourses[2] = new Course(3,"Angular",60,"Edureka",7500);
		availableCourses[3] = new Course(4,"Angular",75,"Coursera",8000);
		availableCourses[4] = new Course(5,"Spring",80,"Udemy",10500);
	}
	
	public static void printCourseNames(String provider)throws ProviderNotFoundException{
		boolean  providerFound = false;
		
		for(Course c : availableCourses) {
			if(c.getProvider().equals(provider)) {
				System.out.println(c.getTitle());
				providerFound = true;
			}
		}
			
		
		if(!providerFound) {
			String error = "The Provider name is invalid, Please entered valid provider";
			ProviderNotFoundException pn = new ProviderNotFoundException(error, provider);
			throw pn;
		}
	}
}

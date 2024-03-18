package day2;

import java.util.Collection;

public class CRUDMain {
	
	private static void showAllCourses() {
		DaoInterface<Course, Integer> idao = new CourseDao();
		Collection<Course> availableCourses = idao.getAll();
		
		for(Course crs : availableCourses) {
			System.out.println(crs);
		}
	}
	
	private static void showOneCourse() {
			DaoInterface<Course, Integer> idao = new CourseDao();
			Course crs = idao.getOne(5);
			if(crs != null)
				System.out.println(crs);
			else 
				System.out.println("Course id does not exist");
		}
	
	private static void createNewCourse() {
			DaoInterface< Course, Integer> idao = new CourseDao();
			Course crs1 = new Course(7,"Database",25,"W3 School",2500);
			
			idao.create(crs1);
			
		/*	Course[] crs = new Course[3];
			crs[0] = new Course(4,"SalesForce",60,"Rubrixx",7500);
			crs[1] = new Course(5,"Angular",75,"Coursera",8000);
			crs[2] = new Course(6,"Spring",80,"Udemy",10500);
			for(Course cr : crs) {
				System.out.println(cr); 
			} */
		}
	
	private static void deleteCourse() {
			DaoInterface< Course, Integer> idao = new CourseDao();
			idao.deleteOne(7);
		}
	
	private static void updateCourse() {
		DaoInterface< Course, Integer> idao = new CourseDao();
		Course currentCourse = idao.getOne(3);
		
		currentCourse.setTitle("C ");
		currentCourse.setDuration(20);
		
		idao.update(currentCourse);
		
	}

	public static void main(String[] args) {
		showAllCourses();
		//showOneCourse();
		//createNewCourse();
		//deleteCourse();
		//updateCourse();
	}

}

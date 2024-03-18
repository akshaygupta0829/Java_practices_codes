package todo10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CourseDataCollection {

	private static Map<Integer,Course> allAvailableCourses;
	
	static {
		allAvailableCourses = new HashMap<>();
		allAvailableCourses.put(101, new Course(101,"C++","Udemy",108,10000));
		allAvailableCourses.put(102, new Course(102,"C","Coursera",108,10000));
		allAvailableCourses.put(103, new Course(103,"Java","Udemy",108,10000));
		allAvailableCourses.put(104, new Course(104,"Python","Udemy",108,10000));
		allAvailableCourses.put(105, new Course(105,"Angular","Coursera",108,10000));
	}
	
	Scanner sc=new Scanner(System.in);
	public void addNewCourse()
	{

		System.out.println("Enter Course Id: ");
		int courseId=sc.nextInt();
		System.out.println("Enter Course Title : ");
		String courseTitle=sc.next();
		System.out.println("Enter Course Duration : ");
		int courseDuration=sc.nextInt();
		System.out.println("Enter Course Provider : ");
		String courseProvider=sc.next();
		System.out.println("Enter Course Fees : ");
		int courseFees=sc.nextInt();
		
		allAvailableCourses.put(courseId, new Course(courseId, courseTitle,  courseProvider, courseDuration, courseFees));
	}
	
	public void findCourse()
	{
		System.out.println("Enter Course Id To Print Information About Course : ");
		int courseKey = sc.nextInt();
		int flag = 0;
		Set<Integer> allKeys = allAvailableCourses.keySet();
		
		for(Integer key: allKeys)
		{
			Course allValue = allAvailableCourses.get(key);
			if(key.equals(courseKey)) {
				System.out.println("Course Details : \n"+ allValue);
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Course Of ID " +courseKey+ " Not Found!");
		}
	}
	
}

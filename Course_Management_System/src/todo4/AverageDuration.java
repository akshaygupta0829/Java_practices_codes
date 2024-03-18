package todo4;

import todo1_and_2.Course;

public class AverageDuration extends CourseDataCalculator {

	@Override
	public float doCalculation(Course[] allCourses) {
		float totalDuration = 0;
		float length = allCourses.length;
		for(Course  avg : allCourses) {
			totalDuration += avg.getDuration();		
		}
		
		float average = totalDuration / length ;
		
		return average;
	}

}

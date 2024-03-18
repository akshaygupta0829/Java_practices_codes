package todo4;

import todo1_and_2.Course;

public class AverageFees extends CourseDataCalculator {

	@Override
	public float doCalculation(Course[] allCourses) {
		int totalFees = 0;
		int length = allCourses.length;
		
		for(Course avg : allCourses) {
			totalFees += avg.getFees(); 
		}
		int average = totalFees / length;
		
		return average;
	}

}

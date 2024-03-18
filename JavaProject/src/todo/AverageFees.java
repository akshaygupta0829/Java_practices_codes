package todo;

public class AverageFees extends CourseDataCalculator {

	@Override
	public float doCaculation(CourseManagementSystem[] allCourses) {
		int totalFees = 0;
		int length = allCourses.length;
		
		for(CourseManagementSystem avg : allCourses) {
			totalFees += avg.getFees(); 
		}
		int average = totalFees / length;
		
		return average;
	}

}

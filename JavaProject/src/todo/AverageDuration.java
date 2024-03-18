package todo;

public class AverageDuration extends CourseDataCalculator {

	@Override
	public float doCaculation(CourseManagementSystem[] allCourses) {
		float totalDuration = 0;
		float length = allCourses.length;
		
		for(CourseManagementSystem avg : allCourses) {
			totalDuration += avg.getDuration();		
		}
		
		float average = totalDuration / length ;
	
		return average;	
	}

}

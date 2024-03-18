package todo5;

public class AverageFees implements CourseInfoProcessor {

	@Override
	public float processCourseInfo(Course[] allCourses, CourseInfo allInfo) {
		
		int count = 0, average = 0, totalFees = 0;
	

		
		for(Course cr : allCourses) {
			CourseInfo cinfo = new CourseInfo(cr.getProvider(), cr.getDuration());
			if(allInfo.equals(cinfo)) {
			totalFees += cr.getFees();
			count++;	
			}
		}
		
		average = totalFees / count;
		
		
		return average;
	}

}

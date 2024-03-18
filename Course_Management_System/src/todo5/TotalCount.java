package todo5;

public class TotalCount implements CourseInfoProcessor {

	@Override
	public float processCourseInfo(Course[] allCourses, CourseInfo allInfo) {
		int count = 0;	
		
		for(Course cr : allCourses) {
			CourseInfo cinfo = new CourseInfo(cr.getProvider(), cr.getDuration());
			
			if(allInfo.equals(cinfo)) {
				count++;
			}
		}
				
		return count;
	}

}

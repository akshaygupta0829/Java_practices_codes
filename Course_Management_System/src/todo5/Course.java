package todo5;

public class Course {

	private int courseId;
	private String title;
	private int duration;
	private String provider;
	private int fees;
	private static int totalCount;
	
	public Course(){
		totalCount++;
	}
	
	public Course(int courseId, String title, int duration, String provider, int fees) {
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.provider = provider;
		this.fees = fees;
		
		totalCount++;
	}
	public static int getTotalCount() {
		return totalCount;
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	

	
}

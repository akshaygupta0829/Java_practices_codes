package todo;

public class CourseManagementSystem {
	private int courseId;
	private String title;
	private float duration;
	private String provider;
	private int fees;
	private static int totalCount;
	
	public static int getCount() {
		return totalCount;
	}
	
	public CourseManagementSystem() {
		totalCount++;
	}
	public CourseManagementSystem(int courseId, String title, float duration, String provider, int fees) {		
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.provider = provider;
		this.fees = fees;
		totalCount++;
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
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
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

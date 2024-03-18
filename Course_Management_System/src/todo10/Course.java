package todo10;

import java.util.Objects;

public class Course {

	private int courseId;
	private String title;
	private int duration;
	private String provider;
	private int fees;
	private static int count;
	
	public Course() {
		courseId=101;
		title="CET";
		duration=200;
		provider="VidhySagar";
		fees=35000;
	}
	public Course(int courseId, String title, String provider, int duration, int fees) {
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.provider = provider;
		this.fees = fees;
		count++;
	}
	public static int getCount() {
		return count;
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
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", duration=" + duration + ", provider=" + provider
				+ ", fees=" + fees + "]";
	}
	
	public void courseDisplay()
	{
		//System.out.println("Course Id: "+courseId+"\tCourse Title: "+courseTitle+"\tDuration: "+courseHrs+"\tProvider: "+courseProvider+"\tFees"+courseFees);
		System.out.println("Course Id: "+getCourseId()+"\tCourse Title: "+getTitle()+"\tDuration: "+getDuration()+"\tProvider: "+getProvider()+"\tFees"+getFees());
		System.out.println("\n");
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseId, duration, fees, provider, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && duration == other.duration && fees == other.fees
				&& Objects.equals(provider, other.provider) && Objects.equals(title, other.title);
	}
	
}

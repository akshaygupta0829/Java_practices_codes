package todo;

public class CourseEntityService implements Course {

	private String courseName;
	private String provider;
	private int fees;
	
	public CourseEntityService() {
		System.out.println("Course class instantiated...");
	}

	public CourseEntityService(String courseName, String provider, int fees) {
		System.out.println("CourseEntityService String,String,int");
		this.courseName = courseName;
		this.provider = provider;
		this.fees = fees;
	}

	public CourseEntityService(String courseName, int fees, String provider) {
		System.out.println("CourseEntityService String,int,String");
		this.courseName = courseName;
		this.fees = fees;
		this.provider = provider;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
		return "CourseEntityService [courseName=" + courseName + ", provider=" + provider + ", fees=" + fees + "]";
	}

	@Override
	public String courseName() {
		String message = "Your course:" + courseName + ",Provide by " + provider + ",Course fees:" + fees ;
		return message;
	}

}

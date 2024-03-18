package day7.beans;

public class CourseEntities {

	private String title;
	private String provider;
	private int fees;
	
	public CourseEntities() {
		
	}

	public CourseEntities(String title, String provider, int fees) {
		super();
		this.title = title;
		this.provider = provider;
		this.fees = fees;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		return "CourseEntities [title=" + title + ", provider=" + provider + ", fees=" + fees + "]";
	}
	
}

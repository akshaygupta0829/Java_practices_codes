package todo8;

public class Course {
	private int id;
    private String title;
    private String provider;
    private int duration;
    private int fees;
    
	public Course(int id, String title, String provider, int duration, int fees) {
		this.id = id;
		this.title = title;
		this.provider = provider;
		this.duration = duration;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", provider=" + provider + ", duration=" + duration + ", fees="
				+ fees + "]";
	}
    
	
    
}

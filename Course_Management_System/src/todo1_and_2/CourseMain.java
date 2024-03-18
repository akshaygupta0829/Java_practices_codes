package todo1_and_2;

public class CourseMain {

	public static void main(String[] args) {

		Course c = new Course(1,"Java",60.00f,"Coursera",50000);
		Course c1 = new Course(2,"Java",60.00f,"Coursera",60000);
		
		System.out.println(Course.getTotalCount());
		
		Course c2 = new Course();
		c2.setCourseId(3);
		c2.setTitle("C++");
		c2.setDuration(25.00f);
		c2.setProvider("udemy");
		c2.setFees(25000);
		
		System.out.println(Course.getTotalCount());
		
		System.out.println(c.getCourseId());
		System.out.println(c.getTitle());
		System.out.println(c.getDuration());
		System.out.println(c.getProvider());
		System.out.println(c.getFees());
		System.out.println();
		
		System.out.println(c2.getCourseId());
		System.out.println(c2.getTitle());
		System.out.println(c2.getDuration());
		System.out.println(c2.getProvider());
		System.out.println(c2.getFees());
		System.out.println();
		
		System.out.println(c1.getCourseId());
		System.out.println(c1.getTitle());
		System.out.println(c1.getDuration());
		System.out.println(c1.getProvider());
		System.out.println(c1.getFees());
		
		
		
	}

}

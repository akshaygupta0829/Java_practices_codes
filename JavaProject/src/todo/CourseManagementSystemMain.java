package todo;

public class CourseManagementSystemMain {

	public static void main(String[] args) {
		CourseManagementSystem cm1 = new CourseManagementSystem(1,"Java",60.00f,"Coursera",50000);
		CourseManagementSystem cm = new CourseManagementSystem();

		cm.setCourseId(3);
		cm.setTitle("C++");
		cm.setDuration(60.00f);
		cm.setProvider("Coursera");
		cm.setFees(30000);
		System.out.println(CourseManagementSystem.getCount());

		CourseManagementSystem cm2 = new CourseManagementSystem(2,"Java",60.00f,"Coursera",60000);
				
//		System.out.println(cm1.getCourseId());
//		System.out.println(cm1.getTitle());
//		System.out.println(cm1.getDuration());
//		System.out.println(cm1.getProvider());
//		System.out.println(cm1.getFees());
//		System.out.println();
//		System.out.println(cm2.getCourseId());
//		System.out.println(cm2.getTitle());
//		System.out.println(cm2.getDuration());
//		System.out.println(cm2.getProvider());
//		System.out.println(cm2.getFees());
//		System.out.println();
//		System.out.println(cm.getCourseId());
//		System.out.println(cm.getTitle());
//		System.out.println(cm.getDuration());
//		System.out.println(cm.getProvider());
//		System.out.println(cm.getFees());
//		System.out.println();
		System.out.println("Count is " +  CourseManagementSystem.getCount());
		
	}

}

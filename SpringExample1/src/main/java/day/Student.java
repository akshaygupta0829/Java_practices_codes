package day;


public class Student implements DisplayDetails {
	private int studentId;
	private String studentName;
	
	public Student() {
		System.out.println("Student class instantiated");
	}

	public Student(int studentId, String studentName) {
		System.out.println("This my Student class");
		this.studentId = studentId;
		this.studentName = studentName;
	}
		
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		studentName = studentName;
	}
	
	@Override
	public String display() {
		String finalMessage = "Student Id " + studentId + " " + "name is " + studentName;
		return finalMessage;
	}	
	

}
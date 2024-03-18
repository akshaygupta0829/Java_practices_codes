package day1;

public class EmployeeMain {

	public static void main(String[] args) {
			Employee emp = new Employee();
			emp.empId = 101;
			emp.empName = "Akshay";
			emp.empSalary = 10000;
			
			System.out.println("Employee Id:" + emp.empId);
			System.out.println("Employee Name:" + emp.empName);
			System.out.println("Employee Salary:" + emp.empSalary);

	}

}

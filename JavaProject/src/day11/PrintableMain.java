package day11;

public class PrintableMain {

	public static void main(String[] args) {
		
		Printable p1 = () -> System.out.println("Hello");
		Printable p2 = () -> System.out.println("Welcome");
		Printable p3 = () -> {
			System.out.println("Hii");
			System.out.println("Bye");
		};
				
		p1.Print();
		p2.Print();
		p3.Print();
	}

}

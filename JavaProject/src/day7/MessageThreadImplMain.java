package day7;

public class MessageThreadImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new MessageThreadImpl("Hello", 1000);
		Thread t2 = new MessageThreadImpl("Hii", 500);
		t1.start();
		t2.start();
				
		System.out.println("Done Succesfully");
	}

}

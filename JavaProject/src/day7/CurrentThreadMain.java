package day7;

public class CurrentThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThreadRef = Thread.currentThread();
		int mainThreadPriority = mainThreadRef.getPriority();
		String mainThreadName = mainThreadRef.getName();
		System.out.println("Main thread priority: " + mainThreadPriority);
		System.out.println("Main thread name: " + mainThreadName);
		
		mainThreadRef.stop();
		
		System.out.println("This statement will not get printed");
		
	}

}

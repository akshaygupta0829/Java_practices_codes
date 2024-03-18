package day7;

public class MessageWithSync {
	private String content;

	public MessageWithSync(String content) {
		this.content = content;
	}
	
	public synchronized void printMessage() throws InterruptedException{
		System.out.println("***************************");
		Thread.sleep(2000);
		System.out.println(content);
		Thread.sleep(2000);
		System.out.println("***************************");
		Thread.sleep(2000);
	}
}

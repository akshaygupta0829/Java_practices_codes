package day7;

public class MessageWithoutSync {
	private String content;

	public MessageWithoutSync(String content) {
		this.content = content;
	}
	
	public void printMessage() throws InterruptedException{
		//This method prints the content using some decoration with some time gap: 1 Second
		System.out.println("************************");
		Thread.sleep(2000);
		System.out.println(content);
		Thread.sleep(2000);
		System.out.println("************************");
		Thread.sleep(2000);
	}
}

package day7;

public class MessageThreadImpl extends Thread {

	private String message;
	private int delayTime;
	
	public MessageThreadImpl(String message, int delayTime) {
		super();
		this.message = message;
		this.delayTime = delayTime;
	}
	
	@Override
	public void run(){
		for(int i = 0;i <= 10;i++) {
			System.out.println(message);
			try {
				Thread.sleep(delayTime);		//Introducing a time gap in terms of milliseconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

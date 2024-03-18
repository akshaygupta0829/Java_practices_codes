package day7;

public class MessageWithoutSyncThreadImpl extends Thread {
	private MessageWithoutSync msg;

	public MessageWithoutSyncThreadImpl(MessageWithoutSync msg) {
		this.msg = msg;
	}
	
	public void run() {
		try {
			msg.printMessage();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

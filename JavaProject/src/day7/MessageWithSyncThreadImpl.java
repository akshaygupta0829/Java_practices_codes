package day7;

public class MessageWithSyncThreadImpl extends Thread {
	private MessageWithSync msg;

	public MessageWithSyncThreadImpl(MessageWithSync msg) {
		this.msg = msg;
	}
	
	public void run() {
		try {
			msg.printMessage();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Use the following code in case of synchronized block. In this case the method 'printMessage()' need not to be 'synchronized'
	/*public void run() {
		synchronized (msg) {
			try {
				msg.printMessage();
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
}

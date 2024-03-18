package day7;
//This example illustrates asynchronized version

public class WithoutSyncMain {

	public static void main(String[] args) {
		MessageWithoutSync msgWithoutSync = new MessageWithoutSync("Tomorrow late comers must bring chocolates");
		
		Thread t1 = new MessageWithoutSyncThreadImpl(msgWithoutSync);
		Thread t2 = new MessageWithoutSyncThreadImpl(msgWithoutSync);
		
		t1.start();
		t2.start();
		
	}

}

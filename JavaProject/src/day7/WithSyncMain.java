package day7;
//This example illustrates synchronized version

public class WithSyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageWithSync msgWithSync = new MessageWithSync("Tomorrow late comers must bring chocolates");
		
		Thread t1 = new MessageWithSyncThreadImpl(msgWithSync);
		Thread t2 = new MessageWithSyncThreadImpl(msgWithSync);
		
		t1.start();
		t2.start();
	}

}

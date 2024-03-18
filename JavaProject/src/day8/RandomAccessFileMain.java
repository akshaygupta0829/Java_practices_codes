package day8;

import java.io.RandomAccessFile;

public class RandomAccessFileMain {

	public static void main(String[] args) {

		String filePath = "./src/day8/zoo/animal.txt";
		try (
				RandomAccessFile rf = new RandomAccessFile(filePath, "r");
			){
			long fileSize = rf.length();
			//Placing the file pointer directly at the mid position
			long midPosition = fileSize / 2;
			rf.seek(midPosition);
			while(true) {
				int data = rf.read();
				if(data == -1)
					break;
				System.out.print((char)data);
			}			
		}
		catch (Exception e) {
			e.printStackTrace();		}
	}

}

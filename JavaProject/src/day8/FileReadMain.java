package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {
	
	public static void main(String[] args) {
	String filePath = "toffee.txt";
	
	FileInputStream fin = null;
	
	try {
		fin = new FileInputStream(filePath);
		while(true) {
			int data = fin.read();
			if(data == -1)
				break;
			char ch = (char)data;
			System.out.print(ch);
		}
	} 
	catch (FileNotFoundException e) {
		
		// TODO Auto-generated catch block
		System.out.println("The file does not exist");
	}
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	finally {
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}
}

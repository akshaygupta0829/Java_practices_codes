package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadUsingTryWithResourcesMain {
	
	public static void main(String[] args) {
	String filePath = "toffes.txt";
	
	try (FileInputStream fin = new FileInputStream(filePath)){
		while(true) {
			int data = fin.read();
			if(data == -1)
				break;
			char ch = (char)data;
			System.out.print(ch);
		}
	} 
	catch (FileNotFoundException e) {
			System.out.println("The file does not exist");
	}
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

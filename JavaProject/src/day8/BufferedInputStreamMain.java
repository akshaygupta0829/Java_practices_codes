package day8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "toffees.txt";
		
		try(	
				FileInputStream fin = new FileInputStream(filePath);
				BufferedInputStream bin = new BufferedInputStream(fin);
				){
			while (true) {
				int data = bin.read();
				if(data == -1)
					break;
				System.out.print((char)data);
				
			}
		} 
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("The file is does not exist");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

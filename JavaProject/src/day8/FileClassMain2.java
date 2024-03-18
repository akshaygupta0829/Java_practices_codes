package day8;

import java.io.File;
import java.io.FileInputStream;

public class FileClassMain2 {

	public static void main(String[] args) {
		
		String filePath = "./src/day8/zoo/animal"
				+ "=t}'33xt";
		File currentFile = new File(filePath);
		
		if(currentFile.exists()) {
			try(
					FileInputStream fin = new FileInputStream(currentFile);
					) {
				long fileSize = currentFile.length();
				int size = (int)fileSize;
				byte data[] = new byte[size];
				fin.read(data);
				String fileData = new String(data);
				System.out.println(fileData);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File does not exist.");
		}
	}

}

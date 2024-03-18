package day8;

import java.io.File;
import java.io.IOException;

public class FileClassMain {

	public static void main(String[] args) {

		String dirPath = "./src/day8/zoo";
		File currentDirectory = new File(dirPath);
		if(currentDirectory.exists()) {
			
			String filePath = dirPath + "/animal.txt";
			File currentFile = new File(filePath);
			if(currentFile.exists()) {
				System.out.println("File found");
			}
			else {
				System.out.println("File not found, creating the same");
				try {
					currentFile.createNewFile();
				}
				catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		else {
			System.out.println("Directory Not Found");
			currentDirectory.mkdir();
		}
				
	}

}

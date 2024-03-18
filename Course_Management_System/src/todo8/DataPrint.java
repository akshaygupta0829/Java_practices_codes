package todo8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataPrint {

	public static void main(String[] args) {
		String filePath = "./src/todo8/course_data.txt";
		
		try (
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				){
			String line;
			while((line = br.readLine()) != null) {
				 
				//System.out.println(line);
				String[] data = line.split(":");
				
				Course crs = new Course(
						Integer.parseInt(data[0]), 
						data[1],
						data[2],
						Integer.parseInt(data[3]),
						Integer.parseInt(data[4])
						);
				
				System.out.println(crs);
			}
		}
		catch(IOException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

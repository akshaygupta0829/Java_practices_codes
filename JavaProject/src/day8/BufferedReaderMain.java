package day8;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderMain {

	public static void main(String[] args) {
		String filePath = "./src/day8/persons.txt";
		
		try (
				BufferedReader br = new BufferedReader(new FileReader(filePath))
				){
			while(true) {
				String line = br.readLine();	//Reading the data line by line
				if(line == null)
					break;
				//System.out.println(line);
				//Dividing the line into 2 pieces: name and nickName.
				//This is done using String class's split() method
				String[] data = line.split("=");
				String name = data[0];
				String nickname = data[1];
				System.out.println("Name is " + name + "and is also known is" + nickname);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

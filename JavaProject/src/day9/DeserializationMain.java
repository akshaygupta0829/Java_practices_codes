package day9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationMain {

	public static void main(String[] args) {

		String filePath = "./src/day9/movie.txt";
		
		try (
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
				){
			Object currentObject = in.readObject();
			System.out.println(currentObject);
			
			Movie currentMovie = (Movie)currentObject;
			String movieTitle = currentMovie.getTitle();
			System.out.println(movieTitle);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

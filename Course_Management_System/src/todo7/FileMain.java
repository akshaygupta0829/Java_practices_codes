package todo7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

            /*Create a file course_info.txt and add some information into it.
			Write a main program that accepts 2 command line arguments indicating the source file name and
			the destination file name and the program must copy the contents of source file into destination file.
			
			Display appropriate message if the source file with the given name is not available.
			
			Implement this using standard practices.
			(Hint: Make use of StringBuilder)		*/

public class FileMain {

	public static void main(String[] args) {

		String sourceFileName = args[0];
		String destinationFileName = args[1];
		

		try (	FileInputStream fin = new FileInputStream(sourceFileName);
				FileOutputStream fout = new FileOutputStream(destinationFileName,true);
				){
//			StringBuilder b = new StringBuilder();
//			b.append(sourceFileName);
//			String data  = b.toString();
//			fout.write(data.getBytes());
			
			while(true) {
				int data = fin.read();
				if(data == -1)
					break;
				
				fout.write(data);
			}
			System.out.println("Data has been copy Successfully...!");
			
		}
		catch (FileNotFoundException e) {
			System.out.println("The File does not exist");	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}

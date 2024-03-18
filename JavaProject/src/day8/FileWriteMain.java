package day8;

import java.io.FileOutputStream;

public class FileWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "ice_creams.txt";
		String ice_cream_data = "List of ice cream \n1.Vanila \n2.Strawberry \n3.Chocolate";
		try (FileOutputStream fout = new FileOutputStream(filePath,true)){
			
			byte[] ice_cream_info = ice_cream_data.getBytes();
			fout.write(ice_cream_info);
			System.out.println("Data has been written to file");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

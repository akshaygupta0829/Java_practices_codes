package todo9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeCourse {

	public void Serialize(Course []arr) {
		String path = "./src/todo9/courseInfo.txt";
		try (
				FileOutputStream fs = new FileOutputStream(path,true);
				ObjectOutputStream obj = new ObjectOutputStream(fs);
				){
			for(int i=0;i<arr.length;i++) {
				obj.writeObject(arr[i]);
			}
			System.out.println("Successfully Serialized...!!");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void Deserialize(int size) {
		String path = "./src/todo9/courseInfo.txt";
		try (
				FileInputStream fs = new FileInputStream(path);
				ObjectInputStream obj = new ObjectInputStream(fs);
				){
			for(int i=0;i<size;i++) {
				Object ob = obj.readObject();
				Course crs = (Course)ob;
				System.out.println(crs.toString());
			}
		//S	System.out.println("Successfully Deserialized...!!");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
}

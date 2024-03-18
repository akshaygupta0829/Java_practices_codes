package exam;

public class Class {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = {1,2,3,4,5};
			for(int i=0;i<5;++i) {
				System.out.println(a[i]);
			}
			int x = 1/0;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("A");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("B");
		}
	}

}

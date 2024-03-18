package day11;

public class MathCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculator m1 = (a,b) -> a + b;
		MathCalculator m2 = (int p, int q) ->{
			return p - q;
		};
		
		int add = m1.doCalculate(10, 20);
		int subtract = m2.doCalculate(50, 30);
		
		System.out.println("Sum :" +  add);
		System.out.println("Sub :" + subtract);
	}

}

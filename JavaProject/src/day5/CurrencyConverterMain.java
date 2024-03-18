package day5;

public class CurrencyConverterMain {

	public static void main(String[] args) {
		CurrencyConverter converter;
		converter = new DollarToRupeeConverter();
		float usDollars = 10000;
		float inr = converter.doConvert(usDollars);
		System.out.println("$" + usDollars + " = Rs. " + inr);
		
		converter = new RupeeToPoundConverter();
		float indianRupees = 1000000;
		float gbp = converter.doConvert(indianRupees);
		System.out.println("Rs. " + indianRupees + " = " + gbp + " Pounds");
	
	}

}

package day5;

public class DollarToRupeeConverter implements CurrencyConverter {
@Override
	public float doConvert(float amountDollars) {
		
		float indianRupees = amountDollars * DOLLAR_TO_RUPEE;
		return indianRupees; 
	}

}

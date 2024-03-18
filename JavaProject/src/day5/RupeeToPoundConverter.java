package day5;

public class RupeeToPoundConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInRupees) {
		float amountInPound = amountInRupees / POUND_TO_RUPEE;
		return amountInPound;
	}

}

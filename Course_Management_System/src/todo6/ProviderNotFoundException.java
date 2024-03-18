package todo6;

public class ProviderNotFoundException extends Exception {

	private String invalidProvider;

	public ProviderNotFoundException(String errorMessage, String invalidProvider) {
		super(errorMessage);
		this.invalidProvider = invalidProvider;
	}
	
	@Override
	public String getMessage() {
		String message = super.getMessage();
		String finalMessage = message + ": " +invalidProvider;
		return finalMessage;
	}
	
	
}

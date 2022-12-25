package exception;

public class ConnectionDataBase extends Exception {

	public ConnectionDataBase(String message) {

		super(message);
	}

	
	@Override
	public String getMessage() {
		String message = super.getMessage();
		return "System can't reach to the database ";
		
	}
}

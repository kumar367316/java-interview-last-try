package comc.ore.designpattern.factory;

public class InvalidDataException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	private String message;
	public InvalidDataException(String message) {
		super();
		this.message = message;
	}

	
	
	
}

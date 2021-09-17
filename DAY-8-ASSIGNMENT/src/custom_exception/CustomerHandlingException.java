package custom_exception;

//Create custom exception (checked exception )class in a separate package
// so create CustomerHandlingException

public class CustomerHandlingException extends Exception {

	public CustomerHandlingException(String errMesg) {
		super(errMesg);
	}
	

}

package custom_Exception;

@SuppressWarnings("serial")
public class CustomBookException extends Exception {
	public CustomBookException(String mesg) {
		super(mesg);
	}
}

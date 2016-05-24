package Exception;

public class TooManyRecordsException extends AbstractException {

	/**
	 * This class aims to handle >40 records exception.
	 */
	private static final long serialVersionUID = -7034511322436988918L;

	public TooManyRecordsException() {
		super();
		printException();
	}

	public void printException() {
		System.out.println(TooManyRecordsException.class.getName());
	}

	public void fixException() {
		System.out.println("Only first 40 records' statistics can be calculated.");
	}

}

package Exception;

public abstract class AbstractException extends Exception {

	/**
	 * An abstract exception class.
	 */
	private static final long serialVersionUID = 1123071561035218062L;

	private int errorNo;

	private String errorMsg;

	public int getErrorNo() {
		return errorNo;
	}

	public void setErrorNo(int errorNo) {
		this.errorNo = errorNo;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public abstract void printException();
	
	public abstract void fixException();
}

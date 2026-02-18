package exceptions;

public class WithdrawLimitException extends RuntimeException {	
	private static final long serialVersionUID = 1L;

	public WithdrawLimitException(String msg) {
		super(msg);
	}	
}

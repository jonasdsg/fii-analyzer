package br.com.scrapfii.domain.fund;

public class InvalidMonthException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidMonthException(String message) {
		super(message);
	}

}

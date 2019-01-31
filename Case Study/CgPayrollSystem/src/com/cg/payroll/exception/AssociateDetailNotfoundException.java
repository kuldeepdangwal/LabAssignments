package com.cg.payroll.exception;

public class AssociateDetailNotfoundException extends RuntimeException 
{

	public AssociateDetailNotfoundException() {
		super();
	}

	public AssociateDetailNotfoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AssociateDetailNotfoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AssociateDetailNotfoundException(String message) {
		super(message);
	}

	public AssociateDetailNotfoundException(Throwable cause) {
		super(cause);
	}
	
}

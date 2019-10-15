package com.wipro.bank.exception;

public class BankValidationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankValidationException() {
		super();
	}

	public String toString(String s) {
		
		return "Invalid Data";
	}
}

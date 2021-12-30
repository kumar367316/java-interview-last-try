package com.core.designpattern.abstractfactory;

public class InvalidDataException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	private String message;
	public InvalidDataException(String message) {
		super();
		this.message = message;
	}

	
	
	
}

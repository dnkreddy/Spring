package com.lavi.springs.exception;

public class SIDNotFoundException extends RuntimeException {

	private String msg;

	public SIDNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage(){
		return msg;
	}
	
}

package com.maximojo.hiring.exception;

// this class is for creating cystom exceptions
public class CustomException extends Exception{

	public CustomException(String exceptionName,String exceptionMessage) {
		this.exceptionMessage=exceptionMessage;
		this.exceptionName=exceptionName;
	}
	
//	name of exception
	private String exceptionName;
	
//	reason for exception
	private String exceptionMessage;

	public String getExceptionName() {
		return exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
	@Override
	public String toString() {
		
		return this.exceptionName +" occured because of "+this.exceptionMessage;
	}

}

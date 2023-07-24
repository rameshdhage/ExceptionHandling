package com.customexception;

public class OutofStockException extends RuntimeException{
	
	public OutofStockException(String massage) {
		super(massage);
	}
	
	

}

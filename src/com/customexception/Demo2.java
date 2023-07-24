package com.customexception;

public class Demo2 {
	
	public static void main(String[] args) {
		int stk=9000;
		
		Stock stock=new Stock();
		stock.givestock(stk);
		System.out.println("remaining stock"+stock.getStock());
		
	}}



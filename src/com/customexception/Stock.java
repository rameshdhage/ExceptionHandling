package com.customexception;

public class Stock {
	
	private  int stock=8000;
	
	
	public int  getStock() {
		return stock;
	}
	public void givestock(int contity) {
		if(contity>stock) {
			System.out.println("sale stock nahi hai utana");
		}
		else {
			stock=stock-contity;
		}
	}

}

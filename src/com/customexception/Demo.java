package com.customexception;

public class Demo {
	public static int m1() {
		
		try {
			int b=10/0;
			return 10;
			
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("inside catch block...");
			return 20;
			
		}finally {
			System.out.println("inside finally block...");
			return 30;
		}
		
	}
public static void main(String args[]) {
	System.out.println(m1());
	
}
}

package com.customexception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount");
		
	    int amt=scanner.nextInt();*/
		int amt=8000;
		
		Account account=new Account();
		account.doWithdrawal(amt);
		System.out.println("remaining balance>>" +account.getBalance());
		
	}

}

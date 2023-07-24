package com.customexception;

public class Account {
	
	private int balance=10000;
	
	public int getBalance() {
		return balance;
	}
public void doWithdrawal(int amount) {
	if(amount>balance) {
		throw  new InsufficientFundException("sorry insufficientfund in your account");
	}
	else {
		balance=balance-amount;
	}
	
}
}
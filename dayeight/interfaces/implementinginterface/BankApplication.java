package com.dayeight.interfaces.implementinginterface;

public class BankApplication {
public static void main(String[] args) {
		
		//create a bank instance
		Bank bank = new BankImpl ();
		
		//create an account 
		
		Account acc = new Account (12344,"Nano",15500, bank);
		
		//deposit money
	
		 bank.deposit(acc, 2000);
		
		System.out.println(acc);
		
		//withdraw money
		
		bank.withdraw(acc, 500);
		System.out.println(acc);
		
	
	
	}

}

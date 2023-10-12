//program to define concrete class that implements the phone interface
package com.dayeight.instanceofinterface;

public class jio implements Phone {

	@Override
	public void call() {
		System.out.println("Calling usiong Jio");
		
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");
	}

	
}

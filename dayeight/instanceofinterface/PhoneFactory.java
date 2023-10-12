//program to define Factory method
package com.dayeight.instanceofinterface;

public class PhoneFactory {

	public static Phone createPhone(String company) {
		if(company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new jio();
		
		return null;

	}

}

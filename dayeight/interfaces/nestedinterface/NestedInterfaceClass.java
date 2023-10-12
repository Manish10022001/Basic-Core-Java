//child clas implement inner interface
package com.dayeight.interfaces.nestedinterface;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{
	
	@Override
	public void print()
	{
		System.out.println("print method of nested interface");
	}

}

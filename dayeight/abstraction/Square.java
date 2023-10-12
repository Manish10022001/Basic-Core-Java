//program to demonstrate abstraction
package com.dayeight.abstraction;

public class Square extends Shape {

	private float side;
	public Square()
	{
		side = 3.0f;
	}
	
	public Square (float side)
	{
		this.side =side;
	}

	@Override
	void calArea() {
		super.area= side * side;
		
	}
	

}

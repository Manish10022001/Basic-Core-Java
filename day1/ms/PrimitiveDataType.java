package com.day1.ms;

public class PrimitiveDataType {

	public static void main(String[] args) {
		byte bytemax=127;
		byte bytemin=-128;
		
		System.out.println("max range of byte is ="+bytemax+"min range of the bye is ="+bytemin);
		
		short shortmax=32767;
		short shortmin=-32767;
		System.out.println("max range of short is ="+shortmax+"min range of short is ="+shortmin);
		
		int maxInt=2147483647;
		int minInt=-2147483647;
		System.out.println("Minint range of byte is"+minInt+"Maxint range of byte is"+maxInt);
		
		long maxLong=92222554566555L;
		long minLong=-92222554566556L;
		System.out.println("minlong range of bye is"+minLong+"Maxlong range of byte is"+maxLong);
		
		float f=3234.3334423232f;
		double d=3435.343422211343455343444f;
		System.out.println("Float value is="+f+"double value is ="+d);
		
		boolean flag=false;
		System.out.println("boolean value is "+flag);

	}

}

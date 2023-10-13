package com.daynine;

public class StringComparision {

	public static void main(String[] args) {
		
	//create strings using literals
		String s1= "TNSIF";
		String s2 = "TNSIF";
		
	//create strings using literals
		String s3= new String ("TNSIF");
		String s4 = new String ("TNSIF");
		
	// == and equals
		System.out.println("s1 == s2 : " + (s1 == s2) + "\ts1 equals s2" + s1.equals(s2));
		
		System.out.println("s1 == s3 : " + (s1 == s3) + "\ts1 equals s3" + s1.equals(s3));
		
		System.out.println("s4 == s3 : " + (s4 == s3) + "\ts4 equals s3" + s4.equals(s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	// Compare to 
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s2));

	}

}

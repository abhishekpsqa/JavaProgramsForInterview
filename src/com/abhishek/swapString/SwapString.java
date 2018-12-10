package com.abhishek.swapString;

public class SwapString {

	public static void swapString() {
		
		String a = "Hello";
		String b = "World";
		
		String temp = b;
		b = b.replace(b, a);
		System.out.println("Value of b is: "+b);
		a = a.replace(a, temp);
		System.out.println("Value of a is: "+a);
		
		
		//************without using temp variable******************//
		
		String s = a+b;
		System.out.println(s);
		System.out.println(s.replaceAll(a, ""));
		System.out.println(s.replace(b, ""));
		Exception e = new Exception("test");
		Exception e1 = new NullPointerException("Test");
	
	}
	public static void main(String[] args) {
		
		swapString();
	}
	
}

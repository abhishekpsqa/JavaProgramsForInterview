package com.abhishek.Recursion;

public class RecursionExample {

	
	public static void main(String[] args) {
		recursion(6);
		System.out.println(factorial(5));
		System.out.println(forLoopExample());
	}
	static int counter = 0;
	public static void recursion(int value) {
				
		System.out.println("The value is: "+value+ ++counter);
		value-=1;
		if(value ==1) {
			return;
		}
		recursion(value);
	}
	
	
	public static int factorial(int value) {
		
		if(value ==1) {
			return 1;
		}
		return factorial(value-1) * value;
		
	}
	
	
	public static int forLoopExample() {
		int value =0;
		int factvalue = 5;
		for (int i = 5; i> 1; i--) {
			
			value = (i-1);
			factvalue = factvalue *value;
		}
		return factvalue;
	}
	
}

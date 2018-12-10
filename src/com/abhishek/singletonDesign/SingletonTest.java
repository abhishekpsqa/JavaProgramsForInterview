package com.abhishek.singletonDesign;

public class SingletonTest {

	//private constructor to avoid making instance of this class.
	private SingletonTest() {
		System.out.println("I am created.");
	}
	
	private static SingletonTest st = null;
	
	public static SingletonTest getInstance() {
		
		if(st == null) 
			st = new SingletonTest(); 
		return st;
	}
}

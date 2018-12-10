package com.abhishek.reverse;

public class ReverseInteger {

	
	public static void reverseThisInteger(int value) {
		String reverseInt= "";
		int reverseIn;
		String intval = String.valueOf(value);
		StringBuilder sb = new StringBuilder(intval);
		reverseInt += sb.reverse();
		reverseIn = Integer.valueOf(reverseInt);
		System.out.println(reverseIn);
	}
	public static void main(String[] args) {
		reverseThisInteger(1270);
	}
}

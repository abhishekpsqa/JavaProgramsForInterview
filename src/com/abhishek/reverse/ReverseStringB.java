package com.abhishek.reverse;

public class ReverseStringB {

	public static void ReverseThisString(String st) {
		
		StringBuilder sb = new StringBuilder(st);
		sb.reverse();
		System.out.println(sb);
	}
	public static void main(String[] args) {
		ReverseThisString("cat");
	}
}

package com.abhishek.reverse;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

	public static void reverseThisNumber(String st) {
	
		char[] chars = st.toCharArray();
		String reverseWord = "";
		List<Character> reverseChar = new ArrayList<Character>();
		
		for(int i=chars.length-1; i>=0; i--) {
			reverseChar.add(chars[i]);
			
	}
		for (Character ch : reverseChar) {
			reverseWord += ch;
		}
		System.out.println(reverseWord);
		}
	public static void main(String[] args) {
		
		reverseThisNumber("cat");
	}
}

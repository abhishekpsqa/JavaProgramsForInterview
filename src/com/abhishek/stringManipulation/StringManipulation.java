package com.abhishek.stringManipulation;

public class StringManipulation {

	public static void stringManipulation() {
		
		
		String str = "This is an experimental string.";
		
		//length of string.
		
		System.out.println(str.length());
		//character position x?
		System.out.println(str.charAt(0));
		//index of position x?
		System.out.println(str.indexOf("h"));
		//second occurrence of character i.
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
		// find index position of substring in string.
		System.out.println(str.indexOf("is"));
		//check boolean value of substring.
		System.out.println(str.indexOf("patel")); //should return -1
		//String comparision. => equals and equalsignorecase methods.
		//find substring at given index.
		System.out.println(str.substring(11));
		System.out.println(str.substring(11, 23));
		//trim spaces from string.
		String s = "    Hello World    ";
		System.out.println(s.trim());
		//remove between space
		System.out.println(s.replace(" ", ""));
		//split method. split method returns array of string.
		String sp = "Hello_World_Abhishek_Patel_Is_Here";
		String[] splittedVal = sp.split("_");
		System.out.println(splittedVal[0]);
		
	}
	
	public static void main(String[] args) {
		stringManipulation();
	}
	
}

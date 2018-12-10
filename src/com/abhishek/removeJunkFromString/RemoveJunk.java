package com.abhishek.removeJunkFromString;

public class RemoveJunk {

	public static void removeJunk() {
		
		String str = "@#@@#$RemoveJunkFromHere*(&^*(&";
		
		//Removing numbers, special characters etc is achieved by regular expression.
		
		str = str.replaceAll("[^a-zA-Z0-9]", ""); //because string is immutable class.
		System.out.println(str);
		
		
		String strw = "Abhishek011592"; //remove numbers from string.
		
		strw = strw.replaceAll("[^a-zA-Z]", "");
		System.out.println(strw);
		
		//another string method.
		
		System.out.println(strw.substring(0, 8));
		
	}
	public static void main(String[] args) {
		
		removeJunk();
	}
	
}

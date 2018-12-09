package com.abhishek.isAnagram;

public class IsAnagram {

	public boolean isAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			System.out.println("given string is not anagram...");
			return false;	
		} 
		
		for(Character ch: s1.toCharArray()) {
			if(!(s2.indexOf(ch) >=0)) {
				System.out.println("given string is not anagram...");
				return false;
			}
		}
		System.out.println("given string is anagram...");
		return true;
	}
	
	public static void main(String[] args) {
		
	
		IsAnagram IA = new IsAnagram();
		IA.isAnagram("Java", "avaJ");
	}
}

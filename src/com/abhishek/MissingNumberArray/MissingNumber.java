package com.abhishek.MissingNumberArray;

public class MissingNumber {

	public static void findMissingNumber() {
		
		int[] values = {1,2,3,5,6,7};
		
		for(int i=0;i< values.length-1;i++) {
			
			if(values[i]+1 != values[i+1]) {
				
				System.out.println("missing value is: "+(values[i+1]-1));
			}
			
		}
		
	}
	public static void main(String[] args) {
		findMissingNumber();
	}
}

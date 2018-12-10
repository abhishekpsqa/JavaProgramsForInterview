package com.abhishek.SmallestAndLargestMemberInArray;

public class SmallestAndLargest {

	
	public static void smallestAndLargestMemberInArray() {
		
		int[] arry = {1,2,3,4,5,6,-7,345,-8,-56,998};
		
		int smallestNumber = arry[0];
		int largestNumber = arry[0];
		
		for(int i=1; i<arry.length; i++) {
			
			if(arry[i]<smallestNumber) {
				
				smallestNumber = arry[i];
				
			}
			
			else if(arry[i]> largestNumber) {
				
				largestNumber = arry[i];
			}
			
		}
		System.out.println("smallest number in an array is: "+smallestNumber);
		System.out.println("Largest number in an array is: "+largestNumber);
		
	}
	public static void main(String[] args) {
		smallestAndLargestMemberInArray();
	}
	
}

package com.abhishek.TwoMaxNoInArray;

public class MaxNoInArry {

	public static void getTwoMaxNo() {
		
		int[] arry = {5,34,78,2,45,1,99,23};
		int index =0;
		int secondIndex =0;
		for(int i=0; i< arry.length; i++) {
			
			for(int j =i+1; j< arry.length; j++) {
				
				if(arry[index]<arry[j] ) {
					secondIndex = index;
					index =j;					
				}
			}
		}
		
		System.out.println("Largest number in array is: "+arry[index]+ " and second largest is: "+arry[secondIndex]);
	}
	public static void main(String[] args) {
		getTwoMaxNo();
	}
}

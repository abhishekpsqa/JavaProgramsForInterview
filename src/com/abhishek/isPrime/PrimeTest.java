package com.abhishek.isPrime;

public class PrimeTest {

	// 9
	public static void isPrime() {
		
		for(int i=2; i<= 100; i++) {
			boolean isPrime = true;
			for(int j =2; j<i; j++) {
				
				if(i%j ==0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i+" is a prime number");
			}
		}
		
		
	
	}

	public static void main(String[] args) {
		PrimeTest.isPrime();
	}
}
